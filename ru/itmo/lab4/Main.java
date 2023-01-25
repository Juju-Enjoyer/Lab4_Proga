package ru.itmo.lab4;

import ru.itmo.lab4.Actors.Monsters.Dragon;
import ru.itmo.lab4.Actors.*;
import ru.itmo.lab4.Enum.*;
import ru.itmo.lab4.Interfaces.Speak;
import ru.itmo.lab4.MyException.NotThatClassException;
import ru.itmo.lab4.Place.LocationOfEvents;
import ru.itmo.lab4.Transport.Transport;

public class Main {
    public static void main(String[] args) throws NotThatClassException {
        MainCharacters Znaika = new MainCharacters("Знайка");//взял из 3
        //4 laba
        Speak ZmeevkiVillDontSayVill = new Speak() {
            @Override
            public void speakSmth(PhrasesForSaying phrases) {
                System.out.print(phrases);
            }
        };
        Inhabitant ZmeevkiVill = new Inhabitant("Змеевка");
        ZmeevkiVill.yourName();
        ZmeevkiVill.getPlaceOfResidence();
        ZmeevkiVillDontSayVill.speakSmth(PhrasesForSaying.TOLD);
        Znaika.yourName();
        LocationOfEvents.WhereEvents place = new LocationOfEvents.WhereEvents();
        LocationOfEvents.WhenEvents time = new LocationOfEvents.WhenEvents();
        LocationOfEvents.WhatHappening events = new LocationOfEvents.WhatHappening();
        Transport Balloon = new Transport("воздушный");
        place.getPlace(WhatWhereWhen.GreenCity);
        time.getTime(WhatWhereWhen.FewDayAgo);
        events.getEvents(WhatWhereWhen.BabiesAppeared);
        Kids Them = new Kids(GenderList.AboutBaby);
        Them.description();
        Balloon.travelByTransport();

        Them.howManyOfThem(2);

        Them.cameForWhat("паяльником", WhatWhereWhen.ZmeevkaCity);
        time.getTime(WhatWhereWhen.After);
        Minorcharacter Shef = new Minorcharacter("Бубликом", "шофером");
        Them.left(WhatWhereWhen.InGreenCity);
        Shef.getProfession();
        Shef.yourName();
        Znaika.yourName();
        Znaika.startedAskingAbout();
        Them.howMuch(2, 2);
        Them.sayGender();
        time.getTime(WhatWhereWhen.WhenDescribed);
        ZmeevkiVill.speakSmth(PhrasesForSaying.Told2);
        Them.howMuch(2, 1);
        Them.wereDressedIn("кожанные куртки");
        Znaika.yourName();
        time.getTime(WhatWhereWhen.Straightaway);
        Znaika.guess("кто это был ");
        //4 laba

        //3 laba
        Minorcharacter Smekailo = new Minorcharacter("Смекайло", "Писатель", "бормотографом");
        Kids Baby = new Kids(GenderList.MALES);
        Kids BabyFemale = new Kids(GenderList.FEMALES);


        Inhabitant InhabitantGreen = new Inhabitant("Зеленый город");
        Dragon Dragon = new Dragon("Дракон", "столовый");
        Smekailo.getProfession();
        Smekailo.yourName();
        Smekailo.getWithSmth();
        Smekailo.listenSmth(PhrasesForListen.ThisConversation);
        Smekailo.confirmNames("Винтик", "Шпунтик");
        Znaika.feels(FeelsList.Happy);
        Znaika.speakSmth(PhrasesForSaying.WILLGO);
        Znaika.askToShowTheWay("туда");
        InhabitantGreen.feels(FeelsList.SadNoOne);
        InhabitantGreen.listenSmth(PhrasesForListen.IT);
        InhabitantGreen.speakSmth(PhrasesForSaying.youCantGoGreen);
        Dragon.settle();
        Dragon.devours(BabyFemale, Baby);
        //3 laba
        Znaika.yourName();
        Znaika.thought();
        time.getTime(WhatWhereWhen.After);
        Znaika.speakSmth(PhrasesForSaying.Сolon);
    }
}
