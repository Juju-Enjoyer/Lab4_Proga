package ru.itmo.Actors;

import ru.itmo.Enum.GenderList;

import ru.itmo.Enum.WhatWhereWhen;
import ru.itmo.Interfaces.Described;
import ru.itmo.Place.LocationOfEvents;

public class Kids extends Lilliputian implements Described{
    private GenderList gender;
    public Kids(GenderList gender){
        this.gender=gender;
    }

    public GenderList getGender() {
        return gender;
    }
    public void sayGender(){
        System.out.print(this.gender);
    }
    @Override
    public void description(){
        if (this.gender == GenderList.THEY |this.gender==GenderList.MALES|this.gender==GenderList.FEMALES){
            System.out.print("которые ");
        }
        else if (this.gender==GenderList.FEMALE) {
            System.out.print("которая ");
    } else if (this.gender==GenderList.MALE) {
            System.out.print("который ");
        }
    }

    public void howManyOfThem(int howMany){
        if (howMany==2){
            System.out.print("двое из нмх ");
        } try {
            if (howMany==3){
                System.out.print("трое из них ");
                throw new ArrayIndexOutOfBoundsException();
            } else if (howMany==1) {
                System.out.print("один из них ");
                throw new ArrayIndexOutOfBoundsException();
            }

        }catch (ArrayIndexOutOfBoundsException Oshibka){
            System.out.print("(в изначальном тексте было 'двух из них') ");
        }

    }
public void cameForWhat(String thing,WhatWhereWhen place){
    System.out.print("приходили "+place+"за "+thing+" ");
}
public void left(WhatWhereWhen place){
    System.out.print("уехали "+place+"c ");
}
public void howMuch(int howMuch, int version){
    if (howMuch==1&version==1){
        System.out.print("один ");
    }
    else if (howMuch==2&version==1) {
        System.out.print("оба ");
    }
    else if (howMuch==3&version==1){
        System.out.print("троя ");
    }
    else if (howMuch==1&version==2) {
        System.out.print("одном ");
    }
    else if (howMuch==2&version==2) {
        System.out.print("двух ");
    }
    else if (howMuch==3&version==2) {
        System.out.print("троих ");
    }

}public void wereDressedIn(String cloth){
        System.out.print("были одеты в "+cloth+" ");
    }


}


