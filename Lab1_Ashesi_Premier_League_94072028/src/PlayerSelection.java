import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[]args){
    //Declaration of variable names for player details
    String name;
    int age;
    double height;
    double weight;
    int jerseyNumber;
    String position;
    String elegibility;
    String attackerJersey;
    String lineupDecision = "N/A";
    String finalDecision;
    Scanner input= new Scanner(System.in);
    
    //input for player details
    //Player name
    System.out.println("Please Enter your name: ");
    name = input.nextLine();
    //player age
    System.out.println("Please Enter your age ");
    age = input.nextInt();
    //player height
    System.out.println("Please Enter your height in meters ");
    height = input.nextDouble();
    //player weight
    System.out.println("Please Enter your weight in pounds ");
    weight = input.nextDouble();
    //player jersey number
    System.out.println("Please Enter your jersey number: ");
    jerseyNumber = input.nextInt();

    //
    switch(jerseyNumber){
        case 1:
        position = "Goalkeeper";
        attackerJersey = "No";
        break;

        case 2,5:
        position = "defender";
        attackerJersey = "No"; 
        break;

        case 6,8:
        position = "midfielder";
        attackerJersey = "No";
        break;

        case 7,11:
        position = "Winger";
        attackerJersey = "Yes";
        break;

        case 9:
        position = "Striker";
        attackerJersey = "Yes";
        break;

        case 10:
        position = "Playmaker";
        attackerJersey = "No";
        break;

        default:
        position = "default";
        attackerJersey = "N/A";
        System.out.println("Player position not known");
    }    

    //Eligibility
    if (age >= 18 && weight < 90){
        elegibility = "Eligible";
    }else{
        elegibility = "Not Eligible";
    }    
    if(age < 18 || weight > 90){
        elegibility = "Player has a problem(either too young or too heavy)";
    }
    
    //Lineup Decision
    if(age >=20){
        if(weight < 80){
            lineupDecision = name +" you have been selected for the starting line up";
        }
        }else{
            lineupDecision = "Please take a seat on the bench";
        }
    
    //Final decision
    String finalStatus = (age >= 18 && weight < 90) ? "Play": "Rest";
       finalDecision = finalStatus;

    //Player Report
    System.out.println("Player: " + name +"\n" + "Age: " +age + "\n" + "Height: " + height + "\n" + "Weight: " + weight + "\n" + "Jersey: " + jerseyNumber + "\n" + "Position: " + position + "\n" + "Attacker jersey: " + attackerJersey + "\n" + "Eligibility: " + elegibility + "\n" + "Lineup Decision: " + lineupDecision + "\n" + "Final Decision: " + finalDecision);
 } 
    
}
    

