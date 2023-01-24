package ru.itmo.lab4.Actors;
import ru.itmo.lab4.Enum.FeelsList;
import ru.itmo.lab4.Enum.PhrasesForSaying;
import ru.itmo.lab4.Interfaces.Feels;
import ru.itmo.lab4.Interfaces.Speak;
import ru.itmo.lab4.Interfaces.YourName;

public class MainCharacters extends Lilliputian implements Feels, Speak, YourName {
    private String name;
    public MainCharacters(String name){
        this.name=name;
    }

    public void askToShowTheWay(String where){
        System.out.print(" просил показать дорогу "+where);
    }
    @Override
    public void feels(FeelsList feels){
        System.out.print(" "+name +" "+feels);

   }

    @Override
    public void speakSmth(PhrasesForSaying phrases) {
        System.out.print(name+" "+"сказал "+ phrases);
    }
    @Override
    public void yourName() {
        System.out.print(name+" ");
    }
    public void startedAskingAbout(){
        System.out.print("стал расспрашивать о ");
    }
    public void guess(String what){
        System.out.print("догадался "+what+" ");
    }
    public void thought(){
        System.out.print("задумался ");
    }
}

