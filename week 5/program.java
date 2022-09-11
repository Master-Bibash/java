public class program {
    public static void main(String[] args) {
        Instrument madal=new Instrument("madal");
        madal.display();
        System.out.println();
        InstrumentToRent tanab=new InstrumentToRent("dammaru", 12);
        tanab.display();
        InstrumentToSell damma=new InstrumentToSell("murli", 1400);
        damma.display();
    }
}
