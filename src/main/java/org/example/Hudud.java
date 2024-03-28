package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Hudud {


    public InlineKeyboardMarkup getInlineHududTanlash() {
//        SendMessage sendMessage=new SendMessage();
        ArrayList<List<InlineKeyboardButton>> listsss = new ArrayList<>();
        List<InlineKeyboardButton> inlineKeyboardButtonList1 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
        List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Andijon");
        inlineKeyboardButton1.setCallbackData("1");
        inlineKeyboardButton2.setText("Namangan");
        inlineKeyboardButton2.setCallbackData("1");
        inlineKeyboardButton3.setText("Fargona");
        inlineKeyboardButton3.setCallbackData("1");
        inlineKeyboardButton4.setText("Toshkent");
        inlineKeyboardButton4.setCallbackData("1");
        inlineKeyboardButton5.setText("Sirdaryo");
        inlineKeyboardButton5.setCallbackData("1");
        inlineKeyboardButton6.setText("Jizzax");
        inlineKeyboardButton6.setCallbackData("1");
        inlineKeyboardButton7.setText("Buxoro");
        inlineKeyboardButton7.setCallbackData("1");
        inlineKeyboardButton8.setText("Navoiy");
        inlineKeyboardButton8.setCallbackData("1");
        inlineKeyboardButton9.setText("Surxandaryo");
        inlineKeyboardButton9.setCallbackData("1");
        inlineKeyboardButton10.setText("Qashqadaryo");
        inlineKeyboardButton10.setCallbackData("1");
        inlineKeyboardButton11.setText("Xorazm");
        inlineKeyboardButton11.setCallbackData("1");
        inlineKeyboardButton12.setText("Qoraqalpogiston Respublikasi");
        inlineKeyboardButton12.setCallbackData("1");
        inlineKeyboardButtonList1.add(inlineKeyboardButton1);
        inlineKeyboardButtonList1.add(inlineKeyboardButton2);
        inlineKeyboardButtonList2.add(inlineKeyboardButton3);
        inlineKeyboardButtonList2.add(inlineKeyboardButton4);
        inlineKeyboardButtonList3.add(inlineKeyboardButton5);
        inlineKeyboardButtonList3.add(inlineKeyboardButton6);
        inlineKeyboardButtonList4.add(inlineKeyboardButton7);
        inlineKeyboardButtonList4.add(inlineKeyboardButton8);
        inlineKeyboardButtonList5.add(inlineKeyboardButton9);
        inlineKeyboardButtonList5.add(inlineKeyboardButton10);
        inlineKeyboardButtonList6.add(inlineKeyboardButton11);
        inlineKeyboardButtonList6.add(inlineKeyboardButton12);




        listsss.add(inlineKeyboardButtonList1);
        listsss.add(inlineKeyboardButtonList2);
        listsss.add(inlineKeyboardButtonList3);
        listsss.add(inlineKeyboardButtonList4);
        listsss.add(inlineKeyboardButtonList5);
        listsss.add(inlineKeyboardButtonList6);


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(listsss);






        return inlineKeyboardMarkup;
    }


}


