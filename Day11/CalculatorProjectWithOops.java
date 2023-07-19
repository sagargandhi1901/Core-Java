package Day11;

import java.util.Scanner;

abstract class Shape {
	
	float area;
	
	abstract void input();
	
	abstract void computeArea();
	
	void display() {
		System.out.println("Area is : " + area);
	}
}

class Rectangle extends Shape {
	private float length;
	private float breadth;
	
	@Override
	void input () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter length of rectangle : ");
		length = sc.nextFloat();
		
		System.out.println("Please enter breadth of rectangle : ");
		breadth = sc.nextFloat();
	}
	
	@Override
	void computeArea() {
		area = length * breadth;
	}
}

class Square extends Shape {
	float length;
	
	@Override
	void input () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter length of square : ");
		length = sc.nextFloat();
	}
	
	@Override
	void computeArea() {
		area = length * length;
	}
}

class Circle extends Shape {
	float radius;
	
	@Override
	void input () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter radius of circle : ");
		radius = sc.nextFloat();
	}
	
	@Override
	void computeArea() {
		area = 3.14F * radius * radius;
	}
}

class AreaCalculation {											// generic class to achieve polymorphism
	
	void doCalculation(Shape shape) {
		shape.input();
		shape.computeArea();
		shape.display();
	}
}

public class CalculatorProjectWithOops {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		Circle circle = new Circle();
		
		AreaCalculation calculation = new AreaCalculation();
		calculation.doCalculation(rectangle);
		calculation.doCalculation(square);
		calculation.doCalculation(circle);
	}
}
