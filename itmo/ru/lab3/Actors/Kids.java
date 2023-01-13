package itmo.ru.lab3.Actors;

import java.util.Objects;

public class Kids extends Lilliputian {
    private String gender;
    public Kids(String gender){
        this.gender=gender;
    }

    public  String kidsGender(){
        if (this.gender == "female"){
            return "малышек";
        }
        else{
            return "малышей";
        }
    }

}

