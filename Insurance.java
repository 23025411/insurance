package insurance;


import java.util.scanner;
public class insurance{

    public static void main(string[] args) {
        scanner ako=new scanner(system.in);
        system.out.println("enter your birth year");
        int birthyear=ako.nextint();
        system.out.println("enter the current year");
        int currentyear=ako.nextint();
        int amount=premiumAmount(birthyear,currentyear);
        system.out.println("the returned amount is"+amount);
    }
    public static int premiumAmount(int birthyear,int currentyear) {
        int age=currentyear-birthyear;
        int decade=age/10;
        int premiumAmount=(decade+15)*20;
        return premiumAmount;
    }
}