package Activity2;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyMachine {

   public static void main(String[] args) {

   //CandyMachine
   Scanner scanner = new Scanner(System.in);
   System.out.println();

   System.out.println("Welcome to Gabelo's Candy Machine");
   System.out.println("List of Products Category");

System.out.println();
System.out.println("Cookies");
System.out.println("Candies");
System.out.println("Chips");
System.out.println("Gums");
System.out.println();

   String cookies = ("(10)   Shortbread, (15)   Macaron,  (12)   Biscoti, (13)  Gingerbread");
   String candies = ("(1)Snober,  (1)Dynamite,  (2)Frutos,  (1)Max");
   String Chips = ("(17)Nova,  (16)Piatos,   (7)Tortillos,  (8)Cheetos");

   String Gums = ("(5)Doublemint,  (3)Eclipse,  (6)Chewsy,  (1)Orbit");

      System.out.println("Select a Category:");
      String c = scanner.nextLine();

if (c.equalsIgnoreCase("cookies")){
  System.out.println("\nHere are the available products:\n " + "\n" + cookies);
  } else if(c.equalsIgnoreCase("candies"))
    System.out.println("\nHere are the available products.\nEnter the price to select the product:\n " + "\n" + candies);
   else if(c.equalsIgnoreCase("chips"))
    System.out.println("Here are the available products:\nEnter the price to select the product:\n " + "\n" + Chips);
   else if(c.equalsIgnoreCase("Gums"))
    System.out.println("\nHere are the available products:\nEnter the price to select the product:\n " + "\n" + Gums);
   else
    System.out.println("The category you selected is not on our selection.");


          //Cookies
          int Shortbread  = 10;
          int Macaron = 14;
          int Biscotti = 12;
          int Gingerbread = 13;

          //Candies
          int Snober = 1;
          int Dynamite = 1;
          int Frutos = 2;
          int Max = 1;

          //Chips
          int Nova = 17;
          int Piatos = 16;
          int Tortillos = 7;
          int Cheetos = 8;

          //Gums
          int Doublemint = 5;
          int Eclipse = 3;
          int Chewsy = 6;
          int Orbit = 1;

          //Selecting a Products
System.out.print("");
int p = scanner.nextInt();

    if (p == 10) {
    System.out.println("\nShortbread is " + Shortbread + " peso." + "\nProceed purchase? (Y/N)");
    }
    else if (p == 14)
  System.out.println("\nMacaron is " + Macaron + " peso. " + "\nProceed purchase? (Y/N");
    else if (p == 12)
  System.out.println("\nBiscotti is " + Biscotti + " peso. " + "\nProceed purchase? (Y/N)");
    else if (p == 15)
  System.out.println("\nGingerbreadis " + Gingerbread+ " peso. " + "\nProceed purchase? (Y/N)");
    else if (p == 1)
  System.out.println("\nSnober is " + Snober+ " peso. " + "\nProceed puschase? (Y/N)");
    else if (p == 1)
  System.out.println("\nDynamite is " + Dynamite + " peso. " + "\nProceed puschase? (Y/N)");
    else if (p == 2)
  System.out.println("\nFrutos is " + Frutos + " peso. " + "\nProceed puschase? (Y/N)");
    else if (p == 1)
  System.out.println("\nMax is " + Max + " peso. " + "\nProceed puschase? (Y/N)");
    else if (p == 17)
  System.out.println("\nNova is " + Nova + " peso. " + "\nProceed purchase? (Y/N)");
    else if (p == 16)
  System.out.println("\nPiatos is " + Piatos + " peso. " + "\nProceed purchase? (Y/N)");
    else if (p == 7)
  System.out.println("\nTortillos is " + Tortillos + " peso. " + "\nProceed purchase? (Y/N)");
    else if (p == 8)
  System.out.println("\nCheetos is " + Cheetos + " peso. " + "\nProceed purchase? (Y/N)");
    else if (p == 5)
  System.out.println("\nDoublemint is " + Doublemint + " peso. " + "\nProceed purchase? (Y/N)");
    else if (p == 2)
  System.out.println("\nEclipse is " + Eclipse + " peso. " + "\nProceed purchase? (Y/N)");
    else if (p == 6)
  System.out.println("\nChewsy is " + Chewsy + " peso. " + "\nProceed purchase? (Y/N)"); 
    else if (p == 1)
  System.out.println("\nOrbit is " + Orbit + " peso. " + "\nProceed purchase? (Y/N)");
    else
     System.out.println("The number you entered is not on our selection");

//Payment cost
//Releasing the purchased
System.out.println();
String response = scanner.next();

  String payment = "Y";
  String cancel = "N";

if (response.equalsIgnoreCase(payment)){
    System.out.println("Please input your payment(0-50): ");
  } else if (response.equalsIgnoreCase(cancel)){
    System.out.println("Thank You!");
  } else{
    System.out.println("The characters you entered is not on our selection.");
  }

  //Payment cost processing

System.out.println("");
   int Payment = scanner.nextInt();

    if (Payment >= 0 && Payment <= 50){
    System.out.println("Product purchase Released!Thank you!\nYour change: " + (Payment - p));
    } else {
    System.out.println("Sorry we can't process this amount");
}}}