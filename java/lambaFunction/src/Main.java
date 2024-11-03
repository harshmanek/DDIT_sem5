
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface Calculator{
    public double operation(double op1, double op2);
}
public class Main {
    public static double operate(double op1,double op2,Calculator cr){
        return cr.operation(op1,op2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("enter no 1");
        a = sc.nextDouble();
        System.out.println("enter no 2");
        b = sc.nextDouble();
        Calculator add = (x,y)->(x+y);
        Calculator sub = (x,y)->(x-y);
        Calculator mul = (x,y)->(x*y);
        Calculator div = (x,y)->(x/y);

        System.out.println("add :- " + Main.operate(a,b,add));
        System.out.println("sub :- " + Main.operate(a,b,sub));
        System.out.println("mul :- " + Main.operate(a,b,mul));
        System.out.println("div :- " + Main.operate(a,b,div));
    }
}