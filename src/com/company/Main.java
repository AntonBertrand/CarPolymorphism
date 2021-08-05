package com.company;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

}

class TwoSeries extends Car{

    public TwoSeries(){
        super("BMW 2 Series",4);
    }

    @Override
    public String startEngine() {
        return "BMW 2 Series -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMW 2 Series -> accelerate()";

    }

    @Override
    public String brake() {
        return "BMW 2 Series -> brake()";
    }
}

class Fiesta extends Car{

    public Fiesta(){
        super("Ford Fiesta",4);
    }

    @Override
    public String startEngine() {
        return "Ford Fiesta -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford Fiesta -> accelerate()";

    }

    @Override
    public String brake() {
        return "Ford Fiesta -> brake()";
    }
}

class Ibiza extends Car{

    public Ibiza(){
        super("Seat Ibiza",3);
    }

    @Override
    public String startEngine() {
        return "Seat Ibiza -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Seat Ibiza -> accelerate()";

    }

    @Override
    public String brake() {
        return "Seat Ibiza -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        TwoSeries twoSeries = new TwoSeries();
        System.out.println(twoSeries.startEngine());
        System.out.println(twoSeries.accelerate());
        System.out.println(twoSeries.brake());

        Ibiza ibiza = new Ibiza();
        System.out.println(ibiza.startEngine());
        System.out.println(ibiza.accelerate());
        System.out.println(ibiza.brake());

        Fiesta fiesta = new Fiesta();
        System.out.println(fiesta.startEngine());
        System.out.println(fiesta.accelerate());
        System.out.println(fiesta.brake());
    }


}
