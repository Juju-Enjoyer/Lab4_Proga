package ru.itmo.lab4.Actors;


import ru.itmo.lab4.Enum.FeelsList;
import ru.itmo.lab4.Enum.PhrasesForListen;
import ru.itmo.lab4.Enum.PhrasesForSaying;
import ru.itmo.lab4.Interfaces.Feels;
import ru.itmo.lab4.Interfaces.Listen;
import ru.itmo.lab4.Interfaces.Speak;
import ru.itmo.lab4.Interfaces.YourName;

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
