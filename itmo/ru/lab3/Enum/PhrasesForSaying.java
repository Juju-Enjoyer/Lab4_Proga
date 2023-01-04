package itmo.ru.lab3.Enum;

public enum PhrasesForSaying {
    WILLGO(", что сейчас же отправится в Зеленый город "),
    youCantGoThere(", что в Зеленый город ходить нельзя, так как там ");


    private String Phrases;

    PhrasesForSaying(String Phrases) {
        this.Phrases = Phrases;
    }
    @Override
    public String toString() {
        return Phrases;
    }
}
