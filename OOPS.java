// public class OOPS {

//     public static void main(String args[]) {
//     //     Pen p1 = new Pen(); //created a pen object called p1
//     //     p1.setColor("Blue");
//     //     System.out.println(p1.getColor);
//     //     p1.setTip(5);
//     //     System.out.println(p1.getTip);
//     //     // p1.setColor("Yellow");
//     //     p1.setColor(newColor); "Yellow";
//     //     System.out.println(p1.getColor); 


//     //     BankAccount myAcc = new BankAccount();
//     //     myAcc.username = 'shradhaKhapra';
//     //     myAcc.setPassword("abcdefghi");
//     // }


// }



// class BankAccount {
//     public String username; 
//     private String password;
//     public void setPassword(String pwd) {
//         password = pwd;
//     }
// }



// class Pen {
//     private String Color;
//     private int tip;

//     String getColor() {
//         return this.color;
//     }

//     int getTip() {
//         return this.tip;
//     }

//     void setColor(String newColor) {
//         this.color = newColor;
//     }

//     void setTip(int newTip){
//         this.tip = newTip;
//     }
// }

// class Student {
//     String name;
//     int age;
//     float percentage; //cgpa

//     void calcPercentage(int phy, int chem, int math) {
//         percentage = (phy + chem + math) / 3;
//     }
// }

// public class OOPS {

//     public static void main(String args[]) {
//         // Student s1 = new Student("Shradha");
//         // System.out.println(s1.name);
//         // Student s1 = new Student();
//         // Student s2 = new Student("shradha");
//         // Student s3 = new Student(123);

//         // Fish shark = new Fish();
//         // shark.eat();
//         Dog dobby = new Dog();
//         dobby.eat();
//         dobby.legs = 4;
//         System.out.println(dobby.legs);
//     }
// }

//Base class
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// class Mammal extends Animal {
//     void walk() {
//         System.out.println("walks");
//     }
// }

// class Fish extends Animal {
//     void swim() {
//         System.out.println("swim");
//     }
// }

// class Bird extends Animal {
//     void fly() {
//         System.out.println("fly");
//     }
// }

//Derived Class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swim in water"); 
//     }
// }



// class Student {
//     String name;
//     int roll;

//     Student() {
//         System.out.println("constructor is called...");

//     }

//     Student(String name) {
//         this.name = name;
//     }
//     Student(int roll) {
//         this.roll = roll;
//     }
// }

// public class OOPS {
//     public static void main(String args[]) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum((float)1.5, (float)2.5));
        // System.out.println(calc.sum(1, 2, 3));
        // Deer d = new Deer();
        // d.eat();
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(h.color);

        // Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang

        // Animal a = new Animal();    `
        // Queen q = new Queen();
        // q.moves();
        // Student s1 = new Student();
        // s1.schoolName = "JMV";

        // Student s2 = new Student();
        // System.out.println(s2.schoolName);

        // Student s3 = new Student()
        //     s3.schoolName = "ABC";
//         Horse h = new Horse();
//         System.out.println(h.color);  
        
//     }
// }

// class Animal {
//     String color;
//     Animal() {
//         System.out.println("animal constructor is called");
//     }
// }

// class Horse extends Animal {
//     Horse() {
//         super.color = "brown";
//         System.out.println("horse constructor is called");
//     }
// }



// class Student {
//     static int returnPercentage(int math, int phy, int chem) {
//         return (math + phy + chem) / 3;
//     }



//     String name;
//     int roll;

//     static String schoolName;

//     void setName(String name) {
//         this.name = name;
//     }
//     String getName() {
//         return this.name;
//     }
// }

// interface Herbivore {

// }

// interface Carnivore {

// }

// interface Bear implements Herbivore, Carnivore {

// }




// interface ChessPlayer {
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right, diagonal (in all 4 dirns)");
//     }
// }

// class Rook implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right");
//     }
// }

// class King implements ChessPlayer {
//     public void moves() { 
//         System.out.println("up, down, left, right, diagonal - (by 1 step)");
//     }
// }


// class Animal {
//     void eat() {
//         System.out.println("eats anything");
//     }
// }

// abstract class Animal {
//     String color;

//     Animal() {
//         System.out.println("animal constructor called"); 
//     }

    // Animal() {
    //     color = "brown";
    // }

//     void eat() {
//         System.out.println("animal eats");
//     }

//     abstract void walk();
// }

// class Horse extends Animal {
//     Horse() {
//         System.out.println("Horse constructor called");
//     }

//     void changeColor() {
//         color = "dark brown";  
//     }

//     void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }

// class Mustang extends Horse {
//     Mustang() {
//         System.out.println("Mustang constructor called");
//     }
// }

// class Chicken extends Animal {
//     void changeColor() {
//         color = "yellow";
//     }

//     void walk() {
//         System.out.println("walks on 2 legs");
//     }
// }

// class Deer extends Animal {
//     void eat() {
//         System.out.println("eats grass");
//     }
// }




// class Calculator {
//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }

//                                                  OOPS Solutions 


// import java.util.*;

// public class OOPS {
//     static class Complex {   // Make it static so main() can access it directly
//         int real;
//         int imag;

//         public Complex(int r, int i) {
//             real = r;
//             imag = i;
//         }

//         public static Complex add(Complex a, Complex b) {
//             return new Complex((a.real + b.real), (a.imag + b.imag));
//         }

//         public static Complex diff(Complex a, Complex b) {
//             return new Complex((a.real - b.real), (a.imag - b.imag));
//         }

//         public static Complex product(Complex a, Complex b) {
//             return new Complex(((a.real * b.real) - (a.imag * b.imag)),
//                                ((a.real * b.imag) + (a.imag * b.real)));
//         }

//         public void printComplex() {
//             if (real == 0 && imag != 0) {
//                 System.out.println(imag + "i");
//             } else if (imag == 0 && real != 0) {
//                 System.out.println(real);
//             } else {
//                 System.out.println(real + "+" + imag + "i");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Complex c = new Complex(4, 5);
//         Complex d = new Complex(9, 4);

//         Complex e = Complex.add(c, d);
//         Complex f = Complex.diff(c, d);
//         Complex g = Complex.product(c, d);

//         e.printComplex();
//         f.printComplex();
//         g.printComplex();
//     }
// }

// 2. 


// Error in the program

// import java.util.*;

// public class OOPS {
//     class Automobile {
//         private String drive() {
//             return "Driving vehicle";
//         }
//     }

//     class Car extends Automobile {
//         protected String drive() {
//             return "Driving car";
//         }
//     }

//     public class ElectricCar extends Car {

//         @Override
//         public final String drive() {
//             return "Driving electric car";
//         }

//         public static void main(String[] wheels) {
//             final Car car = new ElectricCar();
//             System.out.print(car.drive());
//         }
//     }
// }

// import java.util.*;

// public class OOPS {
//     class Automobile {
//         protected String drive() {   // fixed: was private
//             return "Driving vehicle";
//         }
//     }

//     class Car extends Automobile {
//         @Override
//         protected String drive() {
//             return "Driving car";
//         }
//     }

//     public class ElectricCar extends Car {

//         @Override
//         public final String drive() {
//             return "Driving electric car";
//         }

        
//     }

//     public static void main(String[] wheels) {
//             final Car car = new OOPS().new ElectricCar();
//             System.out.print(car.drive()); // prints "Driving electric car"
//         }
// }

// import java.util.*;

// public class OOPS {
//     // Shape.java
//     public class Shape {
//         protected void display() {
//             System.out.println("Display-base");
//         }
//     }
//     // Circle.java
//     public class Circle extends Shape { <
//         < access - modifier > void display() {
//             System.out.println("Display-derived");
//         }

//     }
// }

// import java.util.*;

// public class OOPS {
//     abstract class Car {
//         static {
//             System.out.print("1");
//         }

//         public Car(String name) {
//             super();
//             System.out.print("2");
//         }

//         {
//             System.out.print("3");
//         }
//     }

//     public class BlueCar extends Car {
//         {
//             System.out.print("4");
//         }

//         public BlueCar() {
//             super("blue");
//             System.out.print("5");
//         }

//         public static void main(String[] gears) {
//             // new BlueCar();
//         }
//     }
// }


// import java.util.*;

// public class OOPS {
//     // Static abstract class
//     static abstract class Car {
//         static {
//             System.out.print("1");
//         }

//         public Car(String name) {
//             super();
//             System.out.print("2");
//         }

//         {
//             System.out.print("3");
//         }
//     }

//     // Static subclass
//     public static class BlueCar extends Car {
//         {
//             System.out.print("4");
//         }

//         public BlueCar() {
//             super("blue");
//             System.out.print("5");
//         }

//         public static void main(String[] gears) {
//             new BlueCar();
//         }
//     }
// }



public class OOPS {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[0]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}


  