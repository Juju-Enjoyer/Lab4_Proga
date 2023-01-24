package ru.itmo.Enum;

public enum PhrasesForSaying {
    WILLGO(", что сейчас же отправится в Зеленый город "),
    youCantGoGreen(", что в Зеленый город ходить нельзя, так как там "),
    TOLD("рассказали "),
    Told2("сказали "),
    Сolon(": ");



    private String Phrases;

    PhrasesForSaying(String Phrases) {
        this.Phrases = Phrases;
    }
    @Override
    public String toString() {
        return Phrases;
    }
}
