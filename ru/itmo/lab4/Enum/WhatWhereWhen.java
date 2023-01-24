package ru.itmo.Enum;

public enum WhatWhereWhen {
    FewDayAgo("несколько дней назад "),
    WhenDescribed("когда ему описали их "),
    After("потом "),
    Straightaway("сразу "),
    WasThere("был тут "),
    BabiesAppeared("появились малыши "),
    GreenCity("в Зеленом городе "),
    InGreenCity("в Зеленый город "),

    ZmeevkaCity("в Змеевку ");


    private String eventsPlaceTime;
    WhatWhereWhen(String eventsPlaceTime) {
        this.eventsPlaceTime = eventsPlaceTime;
    }
    @Override
    public String toString() {
        return eventsPlaceTime;
    }
}
