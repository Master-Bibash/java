public class Eagle implements Bird,Flybird {
    //interface bird must be overrided in eagle class
    public void run(){
        System.out.println("eagle can run");
    }
    public void eat(){
        System.out.println("eagle can eat");
    }
   public void fly(){
    System.out.println("eagle can fly");
   }
}
