package be.upglassback.core.enums;

public enum AddressTypeEnum {

    Domicile("Domicile"),
    Professional("Professional"),
    Facturation("Facturation"),
    Livraison("Livraison");

    private final String text;

    AddressTypeEnum(String text) {
        this.text = text;
    }

    public String display() {
        return text;
    }
}
