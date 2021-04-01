package singleresponsibility.violating;

class  Robot{

    String name;
    private double price;

    Robot(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void generateBill(){
        System.out.println("Total cost to be paid:" + price);
    }

}

public class ViolatingPrinciples {
    public static void main(String[] args) {

        Robot robot = new Robot("RegularRobo", 1500.0);
        robot.generateBill();

    }
}

