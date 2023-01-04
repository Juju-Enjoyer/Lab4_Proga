package itmo.ru.lab3.Actors;


import itmo.ru.lab3.Enum.FeelsList;
import itmo.ru.lab3.Enum.PhrasesForListen;
import itmo.ru.lab3.Enum.PhrasesForSaying;
import itmo.ru.lab3.Interfaces.Feels;
import itmo.ru.lab3.Interfaces.Listen;
import itmo.ru.lab3.Interfaces.Speak;

import java.util.Objects;
import java.util.SortedMap;

public class Inhabitant extends Lilliputian implements Speak, Listen, Feels {
    private String placeOfResidence;


    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public void getPlaceOfResidence() {
        System.out.print(placeOfResidence);
    }

    @Override
    public void Feels() {
        System.out.print(" жители "+FeelsList.SadNoOne);
    }

    @Override
    public void listenSmth() {
        System.out.print(" услышив "+ PhrasesForListen.IT);
    }

    @Override
    public void speakSmth() {
        System.out.print(" и сказали" + PhrasesForSaying.youCantGoThere);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Inhabitant that = (Inhabitant) other;
        return Objects.equals(placeOfResidence, that.placeOfResidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeOfResidence);
    }
}
