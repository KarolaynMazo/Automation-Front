package co.com.test2.enums;

public enum Message {

    MSG_ERR("El proceso no es valido");
    String message;

    private Message(String message) {
        this.message = message;
    }

    public String getmessage() {
        return message;
    }
}
