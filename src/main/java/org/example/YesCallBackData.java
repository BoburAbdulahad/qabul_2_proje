package org.example;

import com.vdurmont.emoji.EmojiParser;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class YesCallBackData {
    public static boolean ismFam = false;
    public static boolean isArea = false;
    public static boolean isPerson = false;

    private static String sendText = "";

    public static SendMessage sendMessageReturnCallBack(Update update) {

        SendMessage sendMessage = new SendMessage();

        CallbackQuery callbackQuery = update.getCallbackQuery();
        String data = callbackQuery.getData();

        Long chatId = callbackQuery.getMessage().getChatId();


        if (data.equals("rektor")) {
            sendText = "Eslatma: Murojaatingiz tezkor ravishda hal etilishini istasangiz, " +
                    "\nhar bir masala bo‘yicha alohida murojaat yo‘llashingizni hamda " +
                    "\nmazkur murojaatni lo‘nda, oddiy va ravon tilda " +
                    "\nbayon etishingizni so‘raymiz !\n" +
                    "Marhamat murojaatingizni yo`llang:";
            ismFam = true;
            isPerson=true;
            //todo

            sendMessage = getSendMessage(chatId, sendText);

        }
        if (data.equals("maqom")) {
            sendText = "Murojaatni kimga yo`llamoqchi ekanligingizni belgilang\n" +
                    "* Rektor xizmat safarida bo`lganda qabul prorektorlardan biri tomonidan o`tkaziladi.";
            List<List<InlineKeyboardButton>> listList = getListsRahbarlar();
            sendMessage = getSendMessage(chatId, sendText);
            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(listList);
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        }
        if (data.equals("day")) {
            sendText = "Maqomingizni tanlang:";
            List<List<InlineKeyboardButton>> listList = getListsByMaqom();

            sendMessage = getSendMessage(chatId, sendText);
            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            inlineKeyboardMarkup.setKeyboard(listList);
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        }
        if (data.equals("month")) {
            sendText = "Tug`ilgan kuningiz sanasini kiriting:";
            List<List<InlineKeyboardButton>> list = getListsByDay();
            sendMessage = getSendMessage(chatId, sendText);
            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            inlineKeyboardMarkup.setKeyboard(list);
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        }
        if (data.equals("year")) {
            sendText = "Tug'ilgan oyingizni tanlang:";
            sendMessage = getSendMessage(chatId, sendText);
            InlineKeyboardMarkup inlineKeyboardMarkup = getInlineKeyboardMarkupByMonth();
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        }
        if (data.equals("m") || data.equals("w")) {
            sendText = "Tug'ilgan yilingizni tanlang:";
            sendMessage = getSendMessage(chatId, sendText);
            InlineKeyboardMarkup inlineKeyboardMarkup = getInlineKeyboardMarkupByYear();
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);


        }
        if (data.equals("a") || data.equals("sh") || data.equals("t")) {

            sendText = "Familiya Ism Sharifingizni kiriting:";
            sendMessage = getSendMessage(chatId, sendText);
            ismFam = true;

        }
        if (data.equals("1")) {
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboardRows = new ArrayList<>();
            KeyboardRow keyboardRow = new KeyboardRow();
            KeyboardButton keyboardButton = new KeyboardButton();
            keyboardButton.setText("Telefon raqamni ulashish" + EmojiParser.parseToUnicode(" :phone: "));
            keyboardButton.setRequestContact(true);
            keyboardRow.add(keyboardButton);
            keyboardRows.add(keyboardRow);

            replyKeyboardMarkup.setKeyboard(keyboardRows);
            replyKeyboardMarkup.setResizeKeyboard(true);

            sendText = "Telefon raqamingizni yo`llang";
            sendMessage = getSendMessage(chatId, sendText);
            sendMessage.setReplyMarkup(replyKeyboardMarkup);


        }


        return sendMessage;

    }

    private static List<List<InlineKeyboardButton>> getListsRahbarlar() {
        List<List<InlineKeyboardButton>> listList = new ArrayList<>();
        List<InlineKeyboardButton> inlineKeyboardButtonList1 = new ArrayList<>();
        List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
        List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
        List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
        List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();

        InlineKeyboardButton keyboardButton1 = new InlineKeyboardButton("Rektor");
        keyboardButton1.setCallbackData("rektor");
        InlineKeyboardButton keyboardButton2 =
                new InlineKeyboardButton();
        String txt = "Yoshlar masalalari va ma'naviy-ma'rifiy ishlar bo'yicha birinchi prorektor";
        keyboardButton2.setText("Yoshlar masalalari va ma'naviy-ma'rifiy \n ishlar bo'yicha birinchi prorektor");
        keyboardButton2.setCallbackData("rektor");
        InlineKeyboardButton keyboardButton3 = new InlineKeyboardButton("O`quv ishlari bo`yicha prorektor");
        keyboardButton3.setCallbackData("rektor");
        InlineKeyboardButton keyboardButton4 = new InlineKeyboardButton("Ilmiy ishlar va innovatsiyalar bo'yicha prorektor");
        keyboardButton4.setCallbackData("rektor");
        InlineKeyboardButton keyboardButton5 = new InlineKeyboardButton("Xalqaro hamkorlik va moliya-iqtisod ishlari\n bo'yicha prorektor v.v.b.");
        keyboardButton5.setCallbackData("rektor");

        inlineKeyboardButtonList1.add(keyboardButton1);
        inlineKeyboardButtonList2.add(keyboardButton2);
        inlineKeyboardButtonList3.add(keyboardButton3);
        inlineKeyboardButtonList4.add(keyboardButton4);
        inlineKeyboardButtonList5.add(keyboardButton5);

        listList.add(inlineKeyboardButtonList1);
        listList.add(inlineKeyboardButtonList2);
        listList.add(inlineKeyboardButtonList3);
        listList.add(inlineKeyboardButtonList4);
        listList.add(inlineKeyboardButtonList5);
        return listList;
    }

    private static List<List<InlineKeyboardButton>> getListsByMaqom() {
        List<List<InlineKeyboardButton>> listList = new ArrayList<>();
        List<InlineKeyboardButton> inlineKeyboardButtonList1 = new ArrayList<>();
        List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();

        InlineKeyboardButton keyboardButton1 = new InlineKeyboardButton("Band-ishlaydi");
        keyboardButton1.setCallbackData("maqom");
        InlineKeyboardButton keyboardButton2 = new InlineKeyboardButton("Ishsiz");
        keyboardButton2.setCallbackData("maqom");
        InlineKeyboardButton keyboardButton3 = new InlineKeyboardButton("Pensioner");
        keyboardButton3.setCallbackData("maqom");
        InlineKeyboardButton keyboardButton4 = new InlineKeyboardButton("Talaba");
        keyboardButton4.setCallbackData("maqom");

        inlineKeyboardButtonList1.add(keyboardButton1);
        inlineKeyboardButtonList1.add(keyboardButton2);
        inlineKeyboardButtonList2.add(keyboardButton3);
        inlineKeyboardButtonList2.add(keyboardButton4);

        listList.add(inlineKeyboardButtonList1);
        listList.add(inlineKeyboardButtonList2);
        return listList;
    }

    private static List<List<InlineKeyboardButton>> getListsByDay() {
        List<List<InlineKeyboardButton>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            List<InlineKeyboardButton> keyboardButtonList = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
                inlineKeyboardButton.setText(Integer.toString(i * 6 + j + 1));
                inlineKeyboardButton.setCallbackData("day");
                keyboardButtonList.add(inlineKeyboardButton);
            }
            list.add(keyboardButtonList);
        }
        List<InlineKeyboardButton> keyboardButtonList31 = new ArrayList<>();
        InlineKeyboardButton keyboardButton31 = new InlineKeyboardButton();
        keyboardButton31.setText("31");
        keyboardButton31.setCallbackData("day");
        keyboardButtonList31.add(keyboardButton31);
        list.add(keyboardButtonList31);//checking for
        return list;
    }

    private static InlineKeyboardMarkup getInlineKeyboardMarkupByMonth() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> list = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        List<InlineKeyboardButton> row4 = new ArrayList<>();

        InlineKeyboardButton month1 = new InlineKeyboardButton();
        month1.setText("Yanvar");
        month1.setCallbackData("month");

        InlineKeyboardButton month2 = new InlineKeyboardButton();
        month2.setText("Fevral");
        month2.setCallbackData("month");

        InlineKeyboardButton month3 = new InlineKeyboardButton();
        month3.setText("Mart");
        month3.setCallbackData("month");

        InlineKeyboardButton month4 = new InlineKeyboardButton();
        month4.setText("Aprel");
        month4.setCallbackData("month");

        InlineKeyboardButton month5 = new InlineKeyboardButton();
        month5.setText("May");
        month5.setCallbackData("month");

        InlineKeyboardButton month6 = new InlineKeyboardButton();
        month6.setText("Iyun");
        month6.setCallbackData("month");

        InlineKeyboardButton month7 = new InlineKeyboardButton();
        month7.setText("Iyul");
        month7.setCallbackData("month");

        InlineKeyboardButton month8 = new InlineKeyboardButton();
        month8.setText("Avgust");
        month8.setCallbackData("month");

        InlineKeyboardButton month9 = new InlineKeyboardButton();
        month9.setText("Sentabr");
        month9.setCallbackData("month");

        InlineKeyboardButton month10 = new InlineKeyboardButton();
        month10.setText("Oktabr");
        month10.setCallbackData("month");

        InlineKeyboardButton month11 = new InlineKeyboardButton();
        month11.setText("Noyabr");
        month11.setCallbackData("month");

        InlineKeyboardButton month12 = new InlineKeyboardButton();
        month12.setText("Dekabr");
        month12.setCallbackData("month");
        row1.add(month1);
        //todo cheking all duplicates
        row1.add(month2);
        row1.add(month3);
        row2.add(month4);
        row2.add(month5);
        row2.add(month6);
        row3.add(month7);
        row3.add(month8);
        row3.add(month9);
        row4.add(month10);
        row4.add(month11);
        row4.add(month12);
        list.add(row1);
        list.add(row2);
        list.add(row3);
        list.add(row4);


        inlineKeyboardMarkup.setKeyboard(list);
        return inlineKeyboardMarkup;
    }

    private static InlineKeyboardMarkup getInlineKeyboardMarkupByYear() {
        List<List<InlineKeyboardButton>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
                inlineKeyboardButton.setText(Integer.toString((i * 6 + j) + 1950));
                inlineKeyboardButton.setCallbackData("year");
                inlineKeyboardButtonList.add(inlineKeyboardButton);
            }
            list.add(inlineKeyboardButtonList);


        }


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(list);
        return inlineKeyboardMarkup;
    }


    private static SendMessage getSendMessage(Long chatId, String sendText) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(sendText);
        return sendMessage;
    }

}
