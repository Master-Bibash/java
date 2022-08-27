import java.util.ArrayList;

public class Showroom {
    String name;
    String address;
    String opening;
    String closing;
    ArrayList<Car> car;

//constructer
    public Showroom(String name, String address, String opening, String closing, ArrayList<Car> car) {
        this.name=name;
        this.address=address;
        this.opening=opening;
        this.closing=closing;
        this.car=car;

    }
    //method
    public void display(){
        System.out.println("name of showroom is "+name);
        System.out.println("address of showroom is "+address);
        System.out.println("opening of showroom is "+opening);
        System.out.println("closing of show room is "+closing);
        for(Car veh : car){
            veh.display();

        }
        
        System.out.println('\n');
    }


}
