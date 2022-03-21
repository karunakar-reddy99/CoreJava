package work;

import java.util.Scanner;

class Rectangle_Program {
    int length; 
    int breadth; 
    int area; 
   
    public Rectangle_Program()
    {
    	length = 0;
    	breadth= 0;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }

    void calculate() {
        area = length * breadth;
        
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
       
    }

    public static void main(String args[]) {
        Rectangle_Program obj1 = new Rectangle_Program();
        obj1.input();
        obj1.calculate();
        obj1.display();
        System.out.println("****************************");
        Rectangle_Program obj2 = new Rectangle_Program();
        obj2.input();
        obj2.calculate();
        obj2.display();
        System.out.println("****************************");
        Rectangle_Program obj3 = new Rectangle_Program();
        obj3.input();
        obj3.calculate();
        obj3.display();
        System.out.println("****************************");
        Rectangle_Program obj4 = new Rectangle_Program();
        obj4.input();
        obj4.calculate();
        obj4.display();
        System.out.println("****************************");
        Rectangle_Program obj5 = new Rectangle_Program();
        obj5.input();
        obj5.calculate();
        obj5.display();
    }
}
