

public class juniorDeveloper  extends Developer{
    private int salary;
    private String appointedDate;
    private String evolutionPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;

    //constructor
    public juniorDeveloper(String platform,String interviewerName,int workingHour,String appointedBy,String terminationDate){
        super(platform,interviewerName,workingHour);
        this.appointedBy=appointedBy;
        this.terminationDate="";
        this.salary=salary;
        this.specialization="";
        this.evolutionPeriod="";
        this.joined=false;

    }
    //gertter
    public int getSalary(){
        return salary;
    }
    public String getAppointedDate(){
        return appointedDate;
    }
    public String getEvolutionPeriod(){
        return evolutionPeriod;
    }
    public String getterminationDate(){
        return terminationDate;
    }

    public String getSpecialization(){
        return specialization;
    }

    public String getAppointedBy(){
        return appointedBy;
    }

    public boolean getJoined(){
        return joined;
    }

  //setter
  public void setSalary(int salary){
    if(joined=false){
    this.salary=salary;
  }else{
    System.out.println("not possible to change salary");
  }
}
//   public void setApponyedDate(String appointedDate){
//     this.appointedDate=appointedDate;
//   }
//   public void setEvolutionPeriod(String evolutionPeriod){
//     this.evolutionPeriod=evolutionPeriod;
//   }
// public void setSpecialization(String specialization){
//     t
//   }
//   public void setTerminationDate(String terminationDate){
//   
//   }

// public void setAppointedBy(String appointedBy){
//     this.appointedBy=appointedBy;
//   }

// public void setJoined(boolean joined){
//     this.joined=joined;
  
  //appoint developer method
  public void appdeveloper(String developername,boolean appointedDate,String terminationDate,String specliazation){
    if(joined==false){
        super.setDevelopername(developername);
        joined=true;
    }else{
        System.out.println("develoer already appointed on date "+appointedDate);
        //remaining parameters assigned to attributes
        this.terminationDate=terminationDate;
        this.specialization=specialization;
        this.terminationDate=terminationDate;
    }}

    //method to display details of developer
    public void diplay(){
        super.display();
        if(joined==true){
            System.out.println("appointed date is "+appointedDate);
            System.out.println("developer salary is "+super.getDeveloperName());
            System.out.println("evoultion period "+evolutionPeriod);
            System.out.println("termination date is "+terminationDate);
            System.out.println("developer salary "+salary);
            System.out.println("developer specializtion is "+specialization);
            System.out.println("developer appointed by "+appointedBy);

        }
    }
    
  }
  