package models;

public class VoiceMail {

    private Integer number;
    private String message;

    public VoiceMail(Integer number, String message) {
        this.number = number;
        this.message = message;
    }

    public Integer getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "VoiceMail{" +
                "number=" + number +
                ", message='" + message + '\'' +
                '}';
    }
}
