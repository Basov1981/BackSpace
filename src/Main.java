import java.util.*;

public class Main {
    public static void main(String[] args) {

        Command comd = new Command(1,"FGFGDFG","EGTGHDF",2132);
        Command comd1 = new Command(1, "Manchester Unaited", "Manchester", 13);
        Command comd12 = new Command(1, "Manchester Unaited", "Manchester", 10);
        Command comd2 = new Command(2, "Chelsy", "London", 11);
        Command comd3 = new Command(3, "Liverpool", "Manchester", 3);
        Command comd4 = new Command(4, "Arsenal", "Sity", 1);
        Command comd7 = new Command(4, "Arsenal", "Sity", 2);
        Command comd8 = new Command(4, "Arsenal", "Sity", 7);
        Command comd15 = new Command(3, "Liverpool", "Manchester", 7);

        comd.addCom(comd1);
        comd.addCom(comd2);
        comd.addCom(comd3);
        comd.addCom(comd4);
        comd.addCom(comd12);
        comd.addCom(comd15);
        comd.addCom(comd7);
        comd.addCom(comd8);


       comd.showCom();

//        int a,b,c;
//        System.out.println("Введите два числа ");
//        a = new  Scanner(System.in).nextInt();
//        b = new Scanner(System.in).nextInt();
//        c=a+b;
//        System.out.println("Сумма Ваший чисел равна  " + c);





    }
}

