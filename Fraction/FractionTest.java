/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fraction;
import Fraction.Fraction;
/**
 *
 * @author susmi
 */
public class FractionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        f1.setNumerator(1);
        //f1.setDenominator(3);
        f2.setNumerator(6);
        //f2.setDenominator(6);
        Fraction result = new Fraction();
        result = f1.add(f2);
      
      System.out.println(f1 + " + " + f2 + " = " + result);
      result = f2.add(f1);
      System.out.println(f2 + " + " + f1 + " = " + result);
      System.out.println();      
      result = f1.subtract(f2);      
      System.out.println(f1 + " - " + f2 + " = " + result);      
      result = f2.subtract(f1);      
      System.out.println(f2 + " - " + f1 + " = " + result);
      
      result = f1.multiply(f2);
        f1.output();
      System.out.print(" * ");
      f2.output();
      System.out.print(" = ");
      result.output();
      System.out.println();
      
      result = f1.divide(f2);      
      f1.output();
      System.out.print(" / ");
      f2.output();
      System.out.print(" = ");
      result.output();
      System.out.println();
    }
    
}
