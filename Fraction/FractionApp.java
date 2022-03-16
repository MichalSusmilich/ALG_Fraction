package Fraction;

import Fraction.Fraction;
import java.util.Scanner;

public class FractionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
boolean pokracovat = true;
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction result = new Fraction();
        
        System.out.println();
        System.out.println("Fraction 1:");
        f1.input();
        System.out.println();
        System.out.println("Fraction 2:");
        f2.input();
        System.out.println();
        System.out.println("Vyberte jakou operaci chcete provést: (+ - * /)");
        String operace = sc.next();
        switch (operace) {
            case "+":
                result = f1.add(f2);
                f1.output();
                System.out.print(" + ");
                f2.output();
                System.out.print(" = ");
                result.output();
                System.out.println();
                break;
            case "-":
                result = f1.subtract(f2);
                f1.output();
                System.out.print(" - ");
                f2.output();
                System.out.print(" = ");
                result.output();
                System.out.println();
                break;
            case "*":
                result = f1.multiply(f2);
                f1.output();
                System.out.print(" * ");
                f2.output();
                System.out.print(" = ");
                result.output();
                System.out.println();
                break;
            case "/":
                result = f1.divide(f2);
                f1.output();
                System.out.print(" / ");
                f2.output();
                System.out.print(" = ");
                result.output();
                System.out.println();
                break;
        }
            System.out.println("Chcete pokračovat? a/jiná");
            String anoNe = sc.next();
        switch(anoNe){
            case "a":
                pokracovat = true;
                break;
                default:
                    pokracovat = false;
                
        }

        
    }}

}
