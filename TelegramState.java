package org.example;

public class TelegramState {
    private Long chatId;
    private String firsName;
    private String lastrName;
    private String state;

    public TelegramState(Long chatId, String firsName, String lastrName, String state) {
        this.chatId = chatId;
        this.firsName = firsName;
        this.lastrName = lastrName;
        this.state = state;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastrName() {
        return lastrName;
    }

    public void setLastrName(String lastrName) {
        this.lastrName = lastrName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
