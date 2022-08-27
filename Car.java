import java.util.ArrayList;

public class Car {
    String name;
    String brand;
    int gears;
    double manufactured_date;
    ArrayList<String> features;

    public Car(String name, String brand, int gears, double manufactured_date, ArrayList<String> features) {
        this.name = name;
        this.brand = brand;
        this.gears = gears;
        this.manufactured_date = manufactured_date;
        this.features = features;

    }

    public void display(){
        System.out.println("car name is "+name);
        System.out.println("car brand is "+brand);
        System.out.println("car gears "+gears);
        System.out.println("manufactured date is "+manufactured_date);
        for(String feat:features)
        {
            System.out.println("features of car are "+feat);
        }
        System.out.println('\n');
       

}
}