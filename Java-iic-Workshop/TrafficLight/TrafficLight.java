import java.util.Scanner;

public class TrafficLight
{
    static Scanner sc = new Scanner(System.in);
  public void checkLight(String color){
      
      if(color=="red"){
        System.out.println("STOP!");
        }
        else if(color=="yellow"){
        System.out.println("WAIT!");
        }
        else if(color=="green"){
        System.out.println("GO!");
        }
        else{
        System.out.println("Invalid color");
        }
    
    } 
    public static void main(String[] args){
        
        System.out.println("Enter the name of color: ");
        String color;
        color = sc.nextLine();
        
        TrafficLight tf = new TrafficLight();
        
        tf.checkLight(color);
        
    
    }
  
}
