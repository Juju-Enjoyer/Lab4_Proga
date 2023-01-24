package ru.itmo.lab4.Enum;

public enum FeelsList {
    Sad("опечалился"),
    SadNoOne("опечалились"),
    Happy("обрадовался"),
    HappyNoOne("обрадовались");
    private String feels;
    FeelsList(String feels){
        this.feels=feels;
    }

    @Override
    public String toString() {
        return feels;
    }
}
