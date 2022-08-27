import java.util.ArrayList;

public class Main{
public static void main(String[] args) {
    ArrayList<String> carsdisc=new ArrayList<>();
    carsdisc.add("speed");
    carsdisc.add("light weight");
    carsdisc.add("cheap");
    carsdisc.add("stylish");
    System.out.println('\n');
    Car lambo=new Car("Lamborghini Aventador", "Aventador", 4, 1902, carsdisc);
    //lambo.display();

    carsdisc.clear();
    carsdisc.add("speed");
    carsdisc.add("light weight");
    carsdisc.add("durable");
    carsdisc.add("Safe");
    Car tesla=new Car( "Model S Plaid", "S Plaid", 4, 1921, carsdisc);
    //tesla.display();

    carsdisc.clear();
    carsdisc.add("safe");
    carsdisc.add("durable");
    carsdisc.add("Stylish");
    Car toyota=new Car("Toyota", "Prius", 4, 1920, carsdisc);
    //toyota.display();

    ArrayList<Car> car=new ArrayList<>();
    car.add(lambo);
    Showroom lambor=new Showroom("lambo shoroom", "Sindhuli", "1:0 clcok", "5'o clock", car);
    lambor.display();
    car.clear();
    car.add(tesla);
    Showroom teslr=new Showroom("Tesla", "dharan", "12'o clcock", "6'o clock", car);
    teslr.display();
    car.clear();
    car.add(toyota);
    Showroom tototr=new Showroom("Toyota", "Janakpur", "1'o clcock", "10'o clock", car);
    tototr.display();



}

    
}