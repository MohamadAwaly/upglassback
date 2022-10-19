package be.upglassback.core.enums;

public enum OperationTypeEnum {
    Livraison("Livraison"),
    Montage("Montage"),
    Reparation("Reparation");

    private final String text;

    OperationTypeEnum(String text) {
        this.text = text;
    }

    public String display() {
        return text;
    }
}
