
public class Developer {
    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHour;

    public Developer(String platform,String interviewerName ,int workingHour){
        this.platform=platform;
        this.interviewerName=interviewerName;
        this.workingHour=workingHour;
        this.developerName="";


    }
    public String getPlatform(){
        return platform;
    }
    public String getinterviewerName(){
        return interviewerName;
    }
    public String getDeveloperName(){
        return developerName;
    }
    public int getWorkingHour(){
        return workingHour;
    }
    public void setPlatform(String platform){
        this.platform=platform;
    }
    public void setInterviewerName(String platform){
        this.platform=platform;
    }
    public void setDevelopername(String developer){
        this.developerName=developerName;
    }
    public void setworkingHour(int workingHour){
        this.workingHour=workingHour;
    }
   public void display(){
    System.out.println("platform"+platform);
    System.out.println("workin hours "+workingHour);
    System.out.println("interv name "+interviewerName);
    if(developerName!=""){
        System.out.println("developern name is "+developerName);


    }
   }


    

    
}
