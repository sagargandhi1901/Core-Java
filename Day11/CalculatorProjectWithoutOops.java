package Day11;

import java.util.Scanner;

class Rectangle1 {
	float length;
	float breadth;
	float area;
	
	void input () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter length of rectangle : ");
		length = sc.nextFloat();
		
		System.out.println("Please enter breadth of rectangle : ");
		breadth = sc.nextFloat();
	}
	
	void computeArea() {
		area = length * breadth;
	}
	
	void display() {
		System.out.println("Area of rectangle : " + area);
	}
}

class Square1 {
	float length;
	float area;
	
	void input () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter length of square : ");
		length = sc.nextFloat();
	}
	
	void computeArea() {
		area = length * length;
	}
	
	void display() {
		System.out.println("Area of sqaure : " + area);
	}
	
}

class Circle1 {
	float radius;
	float area;
	
	void input () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter radius of circle : ");
		radius = sc.nextFloat();
	}
	
	void computeArea() {
		area = 3.14F * radius * radius;
	}
	
	void display() {
		System.out.println("Area of circle : " + area);
	}
}

public class CalculatorProjectWithoutOops {
	public static void main(String[] args) {
		
		Rectangle1 rectangle = new Rectangle1();
		Square1 square = new Square1();
		Circle1 circle = new Circle1();
		
		rectangle.input();
		rectangle.computeArea();
		rectangle.display();
		
		square.input();
		square.computeArea();
		square.display();
		
		circle.input();
		circle.computeArea();
		circle.display();
	}
}
