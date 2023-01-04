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

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Kids kids = (Kids) other;
        return Objects.equals(gender, kids.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender);
    }
}

