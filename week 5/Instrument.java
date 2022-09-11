public class Instrument {
    private int instrumentId;
    private String instrumentName;
    private String customerName;
    private String mobNum;
    private int pan;

    // constructor
    public Instrument(String instrumentName) {
        this.instrumentName = instrumentName;
        this.instrumentId = 0;
        this.customerName = "";
        this.mobNum = "";
        this.pan = 0;
    }

    public int getInstrumentId() {
        return instrumentId;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMobNum() {
        return mobNum;
    }

    public int getPan() {
        return pan;
    }

    // setter
    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public void setIntrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum;
        ;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    public void display() {
        System.out.println("instrument id " + instrumentId);
        System.out.println("instrument name is " + instrumentName);
        if (customerName != "" && mobNum != "" && pan != 0) {
            System.out.println("customer name is " + customerName);
            System.out.println("customer mobile num is " + mobNum);
            System.out.println("pan number is " + pan);
        }

    }

}