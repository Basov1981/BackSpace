import java.util.*;

public class Command implements Comparable<Command> {

    static Set<Command> commands  = new TreeSet<>();

    int number;
    String name;
    String city;
    int rezult;

    public Command(int number, String name, String city, int rezult) {
        this.number = number;
        this.name = name;
        this.city = city;
        this.rezult = rezult;
    }

    @Override
    public String toString() {
        return "\n" + "Команда {  " +
                "номер в таблице  " + number +
                " название команды  " + name + '\'' +
                " город команди  " + city + '\'' +
                " очки команды  " + rezult +
                '}';
    }




   public boolean addCom(Command comd){
        return commands.add(comd);
    }

    public void showCom ( ){
        System.out.println( commands);
    }

    @Override
    public int compareTo(Command comd) {
        int rez = 0;

        rez = this.city.compareTo(comd.city)*1111 + this.name.compareTo(comd.name);

        if(rez == 0){

           comd.rezult = comd.rezult + this.rezult;

        }


        return rez;
    }
}
