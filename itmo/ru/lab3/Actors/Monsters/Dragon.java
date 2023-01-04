package itmo.ru.lab3.Actors.Monsters;

import itmo.ru.lab3.Actors.Kids;

public class Dragon extends Monster{
    private String subspecies;

    public String getSubspecies() {
        return subspecies;
    }
    public void settle(){
        System.out.print(" поселился "+this.subspecies+" "+this.kind);
    }
    public void devours(Kids female, Kids male){
        System.out.print(" который пожирает "+female.kidsGender()+" и "+male.kidsGender());
    }

    public Dragon(String kind, String subspecies){
        super(kind);
        this.kind=kind;
        this.subspecies=subspecies;

    }
}
