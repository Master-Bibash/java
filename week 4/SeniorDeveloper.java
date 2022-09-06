
public class SeniorDeveloper extends Developer {

   private String salary;
   private String joiningdate;
   private double staffRoomNumber;
   private int contractperiod;
   private double advancesalary;
   private boolean appointed;
   private boolean terminated;

   // constructor
   public SeniorDeveloper(String platform, String interviewername, int workinghour, String salary, int contractperiod) {
      super(platform, interviewername, workinghour);
      this.salary = salary;
      this.contractperiod = contractperiod;
      this.joiningdate = "";
      this.staffRoomNumber = 0.0;
      this.appointed = false;
      this.terminated = false;
   }

   // getter
   public String getSalary() {
      return salary;
   }

   public String getJoiningdate() {
      return joiningdate;
   }

   public double getStaffroomnumber() {
      return staffRoomNumber;
   }

   public double getadvanceSalary() {
      return advancesalary;
   }

   public boolean getAppointed() {
      return appointed;
   }

   public boolean getterminated() {
      return terminated;
   }

   // setter
   public void setSalary(String salary) {
      this.salary = salary;
   }

   public void setJoiningdate(String joiningdate) {
      this.joiningdate = joiningdate;
   }

   public void setStaffRoomNumber(double staffroomnumber) {
      this.staffRoomNumber = staffroomnumber;
   }

   public void setAdvancesalary(double advancesalary) {
      this.advancesalary = advancesalary;
   }

   public void setAppointed(boolean appointed) {
      this.appointed = appointed;
   }

   public void setTerminated(boolean terminated) {
      this.terminated = terminated;
   }

   // method hire method
   public void hiredeveloper(String developerName, String joiningdate, int advancesalary, double staffRoomNumber) {
      if (appointed == true) {
         System.out.println("developer name is " + developerName);
         System.out.println("room number is " + staffRoomNumber);
      } else {
         super.setDevelopername(developerName);
         this.joiningdate = joiningdate;
         this.staffRoomNumber = staffRoomNumber;
         this.advancesalary = advancesalary;
         appointed = true;
         terminated = false;
      }
   }

   // method for developer contact termination
   public void contractermination() {
      if (terminated == true) {
         System.out.println("devellper is terminated");

      } else {
         super.setDevelopername("");
         joiningdate = "";
         advancesalary = 0.0;
         appointed = false;
         terminated = true;
      }

   }

   // displaying platform intername and deverlopername
   public void display1() {
      System.out.println("platform is " + super.getPlatform());
      System.out.println("interviwere name is " + super.getinterviewerName());
      System.out.println("developer salary " + salary);
   }

   // emthod to dispay develoepr details
   public void display() {
      super.display();
     //check if appointed
     if(appointed==true){
      System.out.println("termiantion status is"+terminated);
      System.out.println("joining date is "+joiningdate);
      System.out.println("advance salary "+advancesalary);
      System.out.println("developer name is "+super.getDeveloperName());

     }
   }

}