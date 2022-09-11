public class InstrumentToRent extends Instrument {
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;

    // constr
    public InstrumentToRent(String instrumentName, int chargePerDay) {
        super(instrumentName);
        this.chargePerDay = chargePerDay;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;

    }

    // getter
    public int getChargePerDay() {
        return chargePerDay;
    }

    public String getDateOfRent() {
        return dateOfRent;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public boolean getIsRented() {
        return isRented;
    }

    // setter
    public void setChargePerDay(int chargePerDay) {
        this.chargePerDay = chargePerDay;
    }

    public void setDateOfRent(String dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    public void rentOut(String customerName, String mobNum, int pan, String dateOfRent, String dateOfReturn,
            int noOfDays) {
        if (isRented == false) {
            System.out.println("customer name " + customerName);
            System.out.println("phone number is " + mobNum);
            System.out.println("return date is " + dateOfReturn);
        } else {
            super.setCustomerName(customerName);
            super.setMobNum(mobNum);
            super.setPan(pan);
        }
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
        this.isRented = true;
        System.out.println("customer details " + customerName + "\n rented quantity 0" + "return date " + dateOfReturn
                + "\n date of renting " + dateOfRent + "\n number of days " + noOfDays + "\n total charge is "
                + (noOfDays * chargePerDay));
    }

    // method to return isntrumrnt
    public void retInst() {
        if (isRented == false) {
            System.out.println("instrument not rented");
        } else {
            super.setCustomerName("");
            super.setPan(0);
            super.setMobNum("");
            this.dateOfReturn = "";
            this.dateOfRent = "";
            this.noOfDays = 0;
            this.isRented = false;

        }
    }

    public void display() {
        super.display();
        if (isRented == true) {
            System.out.println("renting date is " + dateOfRent);
            System.out.println("return date is " + dateOfReturn);
        }

    }

}
