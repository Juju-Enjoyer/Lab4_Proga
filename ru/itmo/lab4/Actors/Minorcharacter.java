package ru.itmo.lab4.Actors;

import ru.itmo.lab4.Enum.GenderList;
import ru.itmo.lab4.Enum.PhrasesForListen;
import ru.itmo.lab4.Interfaces.Listen;
import ru.itmo.lab4.Interfaces.YourName;
import ru.itmo.lab4.MyException.NotThatClassException;

import java.util.Objects;

public class Minorcharacter extends Lilliputian implements Listen, YourName {
    private String profession;
    private String withSmth;
    private String name;

    public Minorcharacter(String name, String profession, String withSmth){
        this.name=name;
        this.profession=profession;
        this.withSmth=withSmth;
    }
    public Minorcharacter(String name, String profession){
        this.name=name;
        this.profession=profession;
    }
    Kids Baby = new Kids(GenderList.MALES);
    public void confirmNames(String Vint,String Shpunt) throws NotThatClassException {
        class Mentioned {
            private String mentionedName;

            Mentioned(String mentionedName) {
                this.mentionedName=mentionedName;
            }
            @Override
            public String toString(){
                return mentionedName;
            }
        }
        Mentioned Lil1 = new Mentioned(Vint);
        Mentioned Lil2 = new Mentioned(Shpunt);

        if (Baby.getGender() == GenderList.MALES){
        System.out.print("потвердил, что "+Baby.getGender()+" зовут "+Lil1+" и "+Lil2);}
        else {
            System.out.println();
            throw new NotThatClassException("Использован не тот тип ");
        }

    }


    public void getProfession() {
        System.out.print(this.profession+" ");
    }
    public void getWithSmth(){
        System.out.print("со своим "+this.withSmth+" ");
    }

    public void yourName() {
        System.out.print(name+" ");
    }

    public void setWithSmth(String withSmth){
        this.withSmth=withSmth;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }



    @Override
    public void listenSmth(PhrasesForListen phrases) {
        System.out.print("слышал " + phrases);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Minorcharacter that = (Minorcharacter) other;
        return Objects.equals(name,that.name) && Objects.equals(profession, that.profession) && Objects.equals(withSmth, that.withSmth) ;
    }

    @Override
    public int hashCode() {
        return 7*Objects.hashCode(name) + 11*Objects.hashCode(profession) + 13*Objects.hashCode(withSmth);
    }
}
