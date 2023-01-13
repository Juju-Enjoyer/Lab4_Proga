package itmo.ru.lab3.Actors;

import itmo.ru.lab3.Enum.FeelsList;
import itmo.ru.lab3.Enum.PhrasesForSaying;
import itmo.ru.lab3.Interfaces.Feels;
import itmo.ru.lab3.Interfaces.Speak;

public class MainCharacters extends Mentioned implements Feels,Speak {
    public MainCharacters(String name){
        super(name);
        this.name=name;
    }

    public void askToShowTheWay(String where){
        System.out.print(" просил показать дорогу "+where);
    }
    @Override
    public void feels(){
        System.out.print(" "+name +" "+FeelsList.Happy);

   }

    @Override
    public void speakSmth() {
        System.out.print(" "+name+" сказал "+PhrasesForSaying.WILLGO);
    }
}

