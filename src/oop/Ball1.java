package oop;

public class Ball1 {
    public static void main(String[] args) {
        Ball ballOne = new Ball();
        System.out.println("Characteristic of ball: ");
        ballOne.color = "BLUE";
        ballOne.price = 10;
        ballOne.producer = "China";
        ballOne.radius = 5;
        ballOne.weight = 200;

        System.out.println("Color: " + ballOne.color + "\n" +
                "Price: " + ballOne.price + "\n" +
                "Producer Country: " + ballOne.producer + "\n" +
                "Radius: " + ballOne.radius +"\n" +
                "Weight: " + ballOne.weight + " gram");

        System.out.println();
        System.out.println();

        Ball ballTwo = new Ball();
        System.out.println("Characteristic of ball: ");
        ballTwo.color = "RED";
        ballTwo.price = 20;
        ballTwo.producer = "Germany";
        ballTwo.radius = 10;
        ballTwo.weight = 250;

        System.out.println("Color: " + ballTwo.color + "\n" +
                "Price: " + ballTwo.price + "\n" +
                "Producer Country: " + ballTwo.producer + "\n" +
                "Radius: " + ballTwo.radius +"\n" +
                "Weight: " + ballTwo.weight + " gram");

        System.out.println();
        System.out.println();

        Ball ballThree = new Ball();
        System.out.println("Characteristic of ball: ");
        ballThree.color = "GREEN";
        ballThree.price = 15;
        ballThree.producer = "Japan";
        ballThree.radius = 7.5;
        ballThree.weight = 225;

        System.out.println("Color: " + ballThree.color + "\n" +
                "Price: " + ballThree.price + "\n" +
                "Producer Country: " + ballThree.producer + "\n" +
                "Radius: " + ballThree.radius +"\n" +
                "Weight: " + ballThree.weight + " gram");
    }
}
