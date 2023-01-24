package ru.itmo.Enum;

public enum GenderList {
            MALE("малыш "),
            MALES("малышей "),
            FEMALE("малышка "),
            FEMALES("малышек "),
            THEY("малыши "),
            AboutBaby("малышах ");

    private String genders;
    GenderList(String genders){
        this.genders=genders;
    }

    @Override
    public String toString() {
        return genders;
    }
}
