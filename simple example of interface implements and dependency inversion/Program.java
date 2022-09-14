public class Program {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        display(eagle);
        flydisplay(eagle);
        Penguin penguin = new Penguin();
        display(penguin);
    }

    // dependency inversion
    public static void display(Bird bird) {
        bird.eat();
        bird.run();
    }

    public static void flydisplay(Flybird flyr) {
        flyr.fly();
    }
}
