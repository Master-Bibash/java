public class InstrumentToSell extends Instrument {
    private double price;
    private String sellDate;
    private double discountPercent;
    private boolean isSold;

    // constr
    public InstrumentToSell(String instrumentName, double price) {
        super(instrumentName);
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;

    }

    // getter
    public double getprice() {
        return price;
    }

    public String getSellDate() {
        return sellDate;
    }

    public double getDiscount() {
        return discountPercent;
    }

    public boolean getIsSold() {
        return isSold;
    }

    // setter
    public void setPrice(double price) {
        if (isSold == false) {
            this.price = price;
        } else {
            System.out.println("price cannot be changed");

        }

    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }

    // method to sell the instrument
    public void sellInstrument(String customerName, String mobNum, int pan, String sellDate, double discountPercent) {
        if (isSold == false) {
            System.out.println("customer details \n customer name is " + customerName + "\n mobile num is " + mobNum);
        } else {
            this.sellDate = sellDate;
            this.discountPercent = discountPercent;
            this.isSold = true;
        }
        super.setCustomerName(customerName);
        super.setMobNum(mobNum);
        super.setPan(pan);
        this.price = price - discountPercent;

    }

    public void display() {
        super.display();
        if (isSold == true) {
            System.out.println("sold date is " + sellDate);

        } else {
            System.out.println("/n");
        }

    }

}
