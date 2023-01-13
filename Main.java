
import itmo.ru.lab3.Actors.*;
import itmo.ru.lab3.Actors.Monsters.Dragon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Minorcharacter Smekailo = new Minorcharacter("Смекайло ","Писатель ","бормотографом ");
        Kids Baby = new Kids("male");
        Kids BabyFemale = new Kids("female");
        Mentioned Vint = new Mentioned("Vint");
        Mentioned Shunt = new Mentioned("Shunt");
        MainCharacters Znaika = new MainCharacters("Знайка");
        Inhabitant InhabitantGreen = new Inhabitant();
        Dragon Dragon = new Dragon("Дракон","столовый");
        Smekailo.getProfession();
        Smekailo.getName();
        Smekailo.getWithSmth();
        Smekailo.listenSmth();
        Smekailo.confirmNames(Baby, Vint, Shunt);
        Znaika.feels();
        Znaika.speakSmth();
        Znaika.askToShowTheWay("туда");
        InhabitantGreen.feels();
        InhabitantGreen.listenSmth();
        InhabitantGreen.speakSmth();
        Dragon.settle();
        Dragon.devours(BabyFemale,Baby);
    }
}
