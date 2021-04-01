package singleresponsibility.following;

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
}

class Bill{

    public void generateBill(Robot robot){
        System.out.println("Total bill to be paid for "+ robot.name+" : " + robot.getPrice());
    }

}


public class FollowingPrinciples {
    public static void main(String[] args) {
        Robot robot = new Robot("General Robot", 1600);
        Bill bill = new Bill();
        bill.generateBill(robot);

        Robot robo = new Robot("Express Robot", 2000);
        Bill bill2 = new Bill();
        bill2.generateBill(robo);

    }
}
