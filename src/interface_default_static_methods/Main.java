package interface_default_static_methods;

public class Main {
    public static void main(String[] args) {
        //Exercise One
        System.out.println("Exercise one");
        exerciseOne();
        System.out.println("--------------------");
        //Exercise Two
        System.out.println("Exercise two");
        exerciseTwo();
        System.out.println("--------------------");
        //Exercise Three
        System.out.println("Exercise three");
        exerciseThree();
        System.out.println("--------------------");
        //Exercise Four
        System.out.println("Exercise four");
        exerciseFour();
    }

    public static void exerciseOne() {
        /*
         Default Methods in Interfaces
         */
        new Dog().speak();
        new Cat().speak();
    }

    public static void exerciseTwo() {
        /*
         Static Methods in Interfaces
         */

        System.out.println(MatOperations.add(1, 1));
    }

    public static void exerciseThree() {
        /*
        Diamond Problem
         */

        new ClassC().printMessage();
    }

    public static void exerciseFour() {
        /*
        Combine Default and Static Methods
         */

        new Tesla().startEngine();
        System.out.println(Car.getFuelType());
    }
}

interface Animal {
    default void speak() {
        System.out.println("The animal speaks!");
    }
}

class Dog implements Animal {


    @Override
    public void speak() {
        System.out.println("The dog barks!");
    }
}

class Cat implements Animal {
}

interface MatOperations {
    static public int add(int a, int b) {
        return a + b;
    }
}

interface InterfaceA {
    default void printMessage() {
        System.out.println("Message from A");
    }
}

interface InterfaceB {
    int a = 0;

    default void printMessage() {
        System.out.println("Message from B");
    }
}

class ClassC implements InterfaceA, InterfaceB {
    @Override
    public void printMessage() {
        InterfaceA.super.printMessage();
        InterfaceB.super.printMessage();
    }
}

interface Car {
    default void startEngine() {
        System.out.println("Engine started!");
    }

    static String getFuelType() {
        return "Petrol";
    }

}

class Tesla implements Car {
    @Override
    public void startEngine() {
        System.out.println("Tesla engine started");
    }
}

interface interfaceX{
    default void showDetails(){
        System.out.println("show details from interface X");
    }
}