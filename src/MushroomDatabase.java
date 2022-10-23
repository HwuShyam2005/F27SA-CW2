/**
 * 
 * Software Development 1, Coursework 2.
 * 
 * Make sure you read the specification document on
 * Canvas in full before starting this assessment.
 * 
 */
import java.util.Scanner;
public class MushroomDatabase {
public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 
 int record;                         //NO OF RECORDS ENTERED
 String[] name;                      //NAME OF THE MUSHROOMS
 String[] colour;                    //COLOUR OF THE MUSHROOM
 String edib ;                   //EDIBILITY CONDITION
 String main;                             
 boolean[] edibility;                //MUSHROOM'S EDIBILITY
				            
 String mushroomColour;              //COLOUR CONDITION  

//WELCOME STATEMENT AND THE NO OF RECORDS TO BE ENTERED
 System.out.println("Welcome to Mushroom Database!");
 System.out.println("how many no of records do you wish to input?");
 record = scan.nextInt();
 System.out.println();

//ASSIGNING THE LENGTH OF EACH ARRAY
 name = new String[record];
 colour = new String[record];
 edibility = new boolean[record];

//ENTERING THE DETAILS OF MUSHROOM ACCORDING TO NO OF RECORDS ENTERED
for (int i = 1; i <= record; i++) {
 System.out.println("enter the records details" + i);
 System.out.println("Name : ");
 name[i - 1] = scan.next();
 System.out.println("Colour : ");
 colour[i - 1] = scan.next();
 System.out.println("Edibility (y/n) : ");
 edib = scan.next();

//EDIBILITY CONDITION		
if (edib.equalsIgnoreCase("y")) {
 edibility[i-1]= true;}
else {
 edibility[i-1]= false;
 System.out.println();
     }
}
				 
//LOOP CONDITION
while(true) {
 System.out.println("List (a)ll, search by (c)olour or (e)dibility, or (q)uit?");
 main = scan.next();

//NAME OF MUSHROOMS	 
if(main.equalsIgnoreCase("a")) {
 System.out.println("These are all the mushrooms in the database : \n" );
for(int i=0; i<name.length; i++) {
 System.out.println(name[i]);
 System.out.println();
	 }
}

//COLOUR OF MUSHROOMS			 
else if(main.equalsIgnoreCase("c")) {
 System.out.println("which colour?");
 mushroomColour = scan.next();
 System.out.println();
 System.out.println("these are the " + mushroomColour + "mushrooms present in the database");
boolean present = false;
for(int i=0; i<colour.length; i++) {
if(colour[i].equalsIgnoreCase(mushroomColour)) {
 System.out.println(name[i]);
 present = true;
	 }
}	 
if(present==false) {
 System.out.println("No "+mushroomColour+" exist in the database. ");
	 }
}
		
//EDIBILITY
if(main.equalsIgnoreCase("e")) {
 System.out.println("Search for (e)dible or (n)on-edible?");
 String condition = scan.next();
if(condition.equalsIgnoreCase("e")) {
 System.out.println("These all are the edible mushrooms in the database");
boolean found = false;
for(int i=0; i<edibility.length; i++) {
if(edibility[i]==true) {
 System.out.println(name[i]);
 found = true;
	 }	
}	
if(found==false) {
 System.out.println("Nothing exists in the database ");
	 }
}
else if(condition.equalsIgnoreCase("n")) {
 System.out.println("These all are the non-edible mushrooms in the database");
boolean found = true;
for(int i=0; i<edibility.length; i++) {
if(edibility[i]==false) {
 System.out.println(name[i]);
 found = false;
	 }	
}	
if(found==true) {
 System.out.println("Nothing exists in the database ");}
	 }
}
//QUITTING STATEMENT		
else if(main.equalsIgnoreCase("q")) {// The statement allows the user to quit the database program 
 System.out.println("Thank you for using Mushroom Database. ");
break;
	 }
	}
  }
}


