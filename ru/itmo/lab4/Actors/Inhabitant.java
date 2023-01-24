package ru.itmo.Actors;


import ru.itmo.Enum.FeelsList;
import ru.itmo.Enum.PhrasesForListen;
import ru.itmo.Enum.PhrasesForSaying;
import ru.itmo.Interfaces.Feels;
import ru.itmo.Interfaces.Listen;
import ru.itmo.Interfaces.Speak;
import ru.itmo.Interfaces.YourName;

public class Inhabitant extends Lilliputian implements Speak, Listen, Feels, YourName {
    private String placeOfResidence;


    public Inhabitant(String placeOfResidence) {
                this.placeOfResidence=placeOfResidence;
    }

    public void getPlaceOfResidence() {
        System.out.print(placeOfResidence + ' ');
    }
    @Override
    public void yourName(){
        System.out.print(toString());
    }
    @Override
    public String toString(){
        return " жители ";
    }

    @Override
    public void feels(FeelsList feels) {
            System.out.print(toString()+feels);
    }

    @Override
    public void listenSmth(PhrasesForListen phrase) {
        System.out.print(toString()+ phrase);
    }

    @Override
    public void speakSmth(PhrasesForSaying phrases) {
        System.out.print(toString()+ phrases);
    }


}
