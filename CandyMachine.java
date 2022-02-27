package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyMachine {

public static void main(String [] args) 
{
 //Candy Machine
Scanner scanner = new Scanner(System.in);

//Given products:

//intro
System.out.println("[BSIT-CANDY MACHINE]");
System.out.println("\nList of categories:\n");

ArrayList Items = new ArrayList();
Items.add("\tCandies");
Items.add("\tChips");
Items.add("\tGums");
Items.add("\tCookies");
System.out.println(Items);

String candies = ("Potchi(1), Choc Nut(2), Flat Tops(3)");
String chips = ("Piattos(16), Chippy(8), V-Cut(28)");
String gums = ("Judge(6), Bubble Joe(5), Double Mint(15)");
String cookies = ("Chocolate Chip(26), Chips Delight(11), Iced Gems(10)");

System.out.println("\nPlease select a category.");
String c = scanner.nextLine();

  if (c.equalsIgnoreCase("candies")){
  System.out.println("\nHere are the available products:\n " + "\n" + candies);
  } else if(c.equalsIgnoreCase("chips"))
    System.out.println("\nHere are the available products.\nEnter the price to select the product:\n " + "\n" + chips);
   else if(c.equalsIgnoreCase("gums"))
    System.out.println("Here are the available products:\nEnter the price to select the product:\n " + "\n" + gums);
   else if(c.equalsIgnoreCase("cookies"))
    System.out.println("\nHere are the available products:\nEnter the price to select the product:\n " + "\n" + cookies);
   else
    System.out.println("The category you selected is not on the selection. \nPlease try again.");
  
  
// Candies 
  int Pochi = 1;
  int ChocNut = 2;
  int FlatTops = 3;
  
// Chips
  int Piattos = 16;
  int Chippy = 8;
  int Vcut = 28;

// Gums
  int Judge = 6;
  int BubbleJoe = 5;
  int DoubleMint = 15;

// Cookies
  int ChocolateChip = 26;
  int ChipsDelight = 11;
  int IcedGems = 10;

// Selecting product

  System.out.print("");
  int p = scanner.nextInt();

  if (p == 1 ){
  System.out.println("\nPotchi is " + Pochi + " peso." + "\nProceed purchase? (Yes/No)");
  } 
  else if (p == 2 )
  System.out.println("\nChoc Nut is " + ChocNut + " peso. " + "\nProceed purchase? (Yes/No)");
   else if (p == 3 )
  System.out.println("\nFlat Tops is " + FlatTops + " pesos." + "\nProceed purchase? (Yes/No)");
   else if (p == 16 )
  System.out.println("\nPiattos is " + Piattos + " pesos. " + "\nProceed purchase? (Yes/No)");
   else if (p == 8 )
  System.out.println("\nChippy is " + Chippy + " pesos. " + "\nProceed purchase? (Yes/No)");
   else if (p == 28 )
  System.out.println("\nV-Cut is " + Vcut + " pesos. " + "\nProceed purchase? (Yes/No)");
   else if (p == 6 )
  System.out.println("\nJudge is " + Judge + " peso. " + "\nProceed purchase? (Yes/No)");
   else if (p == 5 )
  System.out.println("\nBubble Joe is " + BubbleJoe + " peso. " + "\nProceed purchase? (Yes/No)");
   else if (p == 15 )
  System.out.println("\nDouble Mint is " + DoubleMint + " pesos. " + "\nProceed purchase? (Yes/No)");
   else if (p == 26 )
  System.out.println("\nChocolate Chip is " + ChocolateChip + " pesos. " + "\nProceed purchase? (Yes/No)");
   else if (p == 11 )
  System.out.println("\nChips Delight is " + ChipsDelight + " pesos. " + "\nProceed purchase? (Yes/No)");
   else if (p == 10 )
  System.out.println("\nIced Gem is " + IcedGems + " pesos. " + "\nProceed purchase? (Yes/No)");
   else 
    System.out.println("The number you entered is not on the selection.");
  

//Payment and Releasing of product


  
  System.out.println("");
  String answer = scanner.next();
  
  String pay = "Yes";
  String cancel = "No";
  
  
  if (answer.equalsIgnoreCase(pay)){
    System.out.println("Please input your payment(0-50): ");
  } else if (answer.equalsIgnoreCase(cancel)){
    System.out.println("Thank You. Have a nice day!");
  } else{
    System.out.println("The characters you entered is not on the selection. Please try again.");
  }
    
//Payment processing   
  
  System.out.println("");
 int payment = scanner.nextInt();
  
  if (payment >= 0 && payment <= 50){
   System.out.println("Item Released!Thank you for purchasing this item.\nYour change: " + (payment - p));
  } else{
   System.out.println("We cannot process this amount.");
  }
  
}
}
