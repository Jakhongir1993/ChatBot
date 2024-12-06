package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class MyBot extends TelegramLongPollingBot {
    List<TelegramState> users = new ArrayList<>();

    @Override
    public void onUpdateReceived(Update update) {


        try {
           Long chatId = update.getMessage().getChatId();
           String text = update.getMessage().getText();

          if(text.equals("/start")){
              SendMessage sendMessage = new SendMessage();
              sendMessage.setText("Assalomu alaykum botga xush kelibsiz");
              sendMessage.setChatId(chatId);
              execute(sendMessage);
          }else{

              SendMessage sendMessage = new SendMessage();
              sendMessage.setText("Iltimos admin javobini kuting");
              sendMessage.setChatId(chatId);
              execute(sendMessage);
          }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public String getBotUsername() {
        return "@ChiroqchiDirstbot";
    }

    @Override
    public String getBotToken() {
        return "7913234153:AAGrDeuprx-2bUXKIm8wvb6xIDaLT6WjImQ";
    }


}
