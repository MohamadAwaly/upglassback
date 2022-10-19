package be.upglassback.core.enums;

public enum ModeOfPayementEnum {

    Domicile("CASH");

    private final String text;

    ModeOfPayementEnum(String text) {
        this.text = text;
    }

    public String display() {
        return text;
    }
}
