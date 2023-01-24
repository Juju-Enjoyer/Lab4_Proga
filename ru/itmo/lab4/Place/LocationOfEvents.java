package ru.itmo.lab4.Place;

import ru.itmo.lab4.Enum.WhatWhereWhen;

public class LocationOfEvents {
    public static class WhereEvents{

        public void getPlace(WhatWhereWhen place){
            System.out.print(place);
        }
    }
    public static class WhenEvents{

        public void getTime(WhatWhereWhen time){
            System.out.print(time);
        }
    }
    public static class WhatHappening{

        public void getEvents(WhatWhereWhen events){
            System.out.print(events);
        }
    }
}
