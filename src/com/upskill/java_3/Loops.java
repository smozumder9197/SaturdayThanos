package com.upskill.java_3;

public class Loops {
/*
 Type of Loops
 1. For Loop
 2. While Loop
 3. Do While Loop
 4. Infinite Loop
 */
	public static void main(String[] args) {
		practiseForLoop();
		practiceWhileLoop();
        practiceDoWhileLoop();
        practiceInfiniteLoop();
} 
	public static void practiseForLoop(){  //For Loop - Do again and again upto upper limit
		int i;                             //Initialize the variable
		for (i = 1; i<=10;i++){            //Setting lower 
			
			System.out.println("For Loops number = " + i); //Statement

		}
}
public static void practiceWhileLoop() {      //While Loop - Do again and again upto condition match
	int i = 1;                                //Initialize the variable
	while(i<=10) {                            //Setting Condition
		System.out.println("While Loops number = " + i); //Statement
	i++;                                                 //Increment or decrement
	 
}
}
public static void practiceDoWhileLoop() {              //Do While Loop - Do again and again upto condition match
	int i = 1;                                          //Initialize the variable
	do {
		System.out.println("While Loops number = " + i); //Statement
	    i++;                                             //Increment or decrement
	} while (i<=0);                                      //Checking condition
}

public static void practiceInfiniteLoop(){                   //Infinite Loop - never ending Loop
	int i;                                                   //Initialize the variable
	for(i=1; ; i++) {                                        //Setting No Upper limit
		System.out.println("Infinite Loops number = " + i);  //Statement
	
	}
}
public static void practiseNestedForLoop() {
int i;
int j;
for(i=1; i<=10; i++){
	for(j=i; j<=10; j++){
		int multiplicationTable = i * j;
				System.out.println(multiplicationTable + " ");
	
}
}
}
}

