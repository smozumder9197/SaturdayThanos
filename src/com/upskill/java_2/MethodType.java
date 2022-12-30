package com.upskill.java_2;

public class MethodType {
/* Types of Methods
 1. Void Method
 2. Static Method
 3. Return Type Method
 */ 
	public static int hourlyIncome = 65;
	public static void main(String[]args) {
		MethodType obj = new MethodType();
		obj.annualIncome();
		weeklyIncome();
		System.out.println("My Monthly Income = " + obj.monthlyIncome());
		rasel();
		obj.rasel2();
		System.out.println(obj.rasel3());
}
	
		
	
	//void method
	public void annualIncome() {
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	//static Method
	public static void weeklyIncome(){
        int calculateWeeklyIncome = hourlyIncome * 40;
        System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	//return type method
	public int monthlyIncome(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
		
		}
	
public static void rasel(){       //method
String name ="Rasel Alam";        //variable
int age = 30;
System.out.println(name);
	}
public void rasel2(){       //method
String name ="Rasel Alam";        //variable
int age = 30;
System.out.println(name);
}
public int rasel3(){       //method
String name ="Rasel Alam"; //variable
int age = 30;
System.out.println(name);
return age;
}
}
	