package itmo.ru.lab3.Actors;

public class Mentioned extends Lilliputian{
    protected String name;
    public String printName(){
        return this.name;
    }
    public Mentioned(String name){
        this.name=name;
    }

    public void getName() {
        System.out.print(name);
    }
}




