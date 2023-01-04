package itmo.ru.lab3.Enum;

public enum PhrasesForListen {
    IT("это"),
    ThisConversation("этот разговор");

private String Phrases;
PhrasesForListen(String Phrases){
    this.Phrases=Phrases;
}

    @Override
    public String toString() {
        return Phrases;
    }
}
