import java.util.Scanner;;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter scissor or papper or rock");
        String user=sc.nextLine();
        Random random=new Random();
        //String computerMove;
        int randomNumber=random.nextInt(3);
        
        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
    
        System.out.println("Computer chose " + computerMove + "!");
        if(computerMove.equals(user)){
            System.out.println("there has been a tie");
        }else if(playerWins(user,computerMove)){
            System.out.println("user wins");
        }else{
            System.out.println("computer wins");
        }

        }

    

    static boolean playerWins(String user,String computerMove){
if(user.equals("rock")){
    return computerMove.equals("scissors");
}else if(user.equals("paper")){
    return computerMove.equals("rock");
}else{
    return computerMove.equals("paper");
}

    }
}