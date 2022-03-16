/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fraction;

import java.util.Scanner;
public class Fraction {
    
    private int numerator;
    private int denominator;
    
    public Fraction(){
        numerator = 0;
        denominator = 1;
        
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction add(Fraction b){
        
      if ((denominator == 0) || (b.denominator == 0))
         throw new IllegalArgumentException("Invalid denominator");
      
      int common = lcd(denominator, b.denominator);
      
      Fraction commonA = new Fraction();
      Fraction commonB = new Fraction();
      commonA = convert(common);
      commonB = b.convert(common);
      
      Fraction sum = new Fraction();
      
      sum.numerator = commonA.numerator + commonB.numerator;
      sum.denominator = common;
      
      sum = sum.reduce();
      return sum;
    }
    public Fraction subtract(Fraction b){
        if ((denominator == 0) || (b.denominator == 0)){
            throw new IllegalArgumentException("Invalid denominator");
        }
        int common = lcd(denominator, b.denominator);
        Fraction commonA = new Fraction();
        Fraction commonB = new Fraction();
        commonA = convert(common);
        commonB = b.convert(common);
        Fraction diff = new Fraction();
        diff.numerator = commonA.numerator - commonB.numerator;
        diff.denominator = common;
        diff = diff.reduce();
        return diff;
    }
    public Fraction multiply(Fraction b){
        if ((denominator == 0) || (b.denominator == 0)){
            throw new IllegalArgumentException("Invalid denominator");
        }
        Fraction product = new Fraction();
        product.numerator = numerator * b.numerator;
        product.denominator = denominator * b.denominator;
        product = product.reduce();
        return product;
    }
    public Fraction divide(Fraction b)
   {
      
      if ((denominator == 0) || (b.numerator == 0))
         throw new IllegalArgumentException("invalid denominator");
      
      Fraction result = new Fraction();
      
      result.numerator = numerator * b.denominator;
      result.denominator = denominator * b.numerator;
      
      result = result.reduce();
      return result;
   }
    public void input()
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Prosím vložte celé číslo pro čitatele: ");
      
      numerator = sc.nextInt();
       //System.out.println(zkouska + numerator);
      
      do {
         System.out.print("Vložte nenulové číslo pro jmenovatele: ");
         denominator = sc.nextInt();
         
         if (denominator == 0)
            System.out.println("Invalid value.  Please try again.");
      } while (denominator == 0);
   }
    public void output()
   {
       System.out.print(this);
   }
    @Override
    public String toString()
   {
       if(denominator != 1){
      String buffer = numerator + "/" + denominator;
      return buffer;
       }
       else{
          String buffer = numerator + "";
      return buffer; 
       }
       
   }
    private int lcd(int denom1, int denom2)
   {
      int factor = denom1;
      while ((denom1 % denom2) != 0)
         denom1 += factor;
      return denom1;
   }
    private int gcd(int denom1, int denom2)
   {
      int factor = denom2;
      while (denom2 != 0) {
         factor = denom2;
         denom2 = denom1 % denom2;
         denom1 = factor;
      }
      return denom1;
   }
    private Fraction convert(int common)
   {
      Fraction result = new Fraction();
      int factor = common / denominator;
      result.numerator = numerator * factor;
      result.denominator = common;
      return result;
   }
    private Fraction reduce()
   {
      Fraction result = new Fraction();
      int common = 0;
      // get absolute values for numerator and denominator
      int num = Math.abs(numerator);
      int den = Math.abs(denominator);
      // figure out which is less, numerator or denominator
      if (num > den)
         common = gcd(num, den);
      else if (num < den)
         common = gcd(den, num);
      else  // if both are the same, don't need to call gcd
         common = num;
      
      result.numerator = numerator / common;
      result.denominator = denominator / common;
      return result;
   }
}

