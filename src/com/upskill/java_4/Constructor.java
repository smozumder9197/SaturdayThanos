package com.upskill.java_4;

public class Constructor {
String studentName;
int studentAge;

public Constructor(String name, int age) {
	studentName = name;

	studentAge = age;

}
public Constructor(String name) {
studentName = name;

}
public Constructor(int age){
	studentAge = age;

}

public static void main(String[]args) {
	Constructor obj1 = new Constructor("Badsah", 25);
	System.out.println(obj1.studentAge);
	System.out.println(obj1.studentName);
	Constructor obj2 = new Constructor("Tasnin");
	System.out.println(obj2.studentName);

	Constructor obj3 = new Constructor(21);
	System.out.println(obj3.studentAge);

}
}
