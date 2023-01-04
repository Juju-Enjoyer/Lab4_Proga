package itmo.ru.lab3.Actors;

import itmo.ru.lab3.Enum.PhrasesForListen;
import itmo.ru.lab3.Interfaces.Listen;

import java.util.Objects;

public class Minorcharacter extends Mentioned implements Listen {
    private String profession;
    private String withSmth;

    public Minorcharacter(String name, String profession, String withSmth){
        super(name);
        this.name=name;
        this.profession=profession;
        this.withSmth=withSmth;
    }
    public void confirmNames(Kids Babies,Mentioned Vint,Mentioned Shpunt){
        System.out.print(" потвердил, что "+Babies.kidsGender()+" зовут "+Vint.printName()+" и "+Shpunt.printName());

    }


    public void getProfession() {
        System.out.print(this.profession);
    }
    public void getWithSmth(){
        System.out.print("со своим "+this.withSmth);
    }

    public void setWithSmth(String withSmth){
        this.withSmth=withSmth;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }



    @Override
    public void listenSmth() {
        System.out.print(" слышал " + PhrasesForListen.ThisConversation);
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
