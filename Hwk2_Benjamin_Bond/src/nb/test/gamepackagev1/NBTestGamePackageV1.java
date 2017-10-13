
package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import javax.swing.JOptionPane; //for problem 2 and 3
import java.text.DecimalFormat; //for Problem 4
import java.awt.Graphics; //for problem 5
import java.awt.Font; //for problem 5

public class NBTestGamePackageV1 extends DrawableAdapter
{   static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
    static GameBoard gb = new GameBoard(ge, "Benjamin Bond, coded on 9/14/2017");
    static int counter = 0; //variable for problem 5
    
    public static void main(String[] args) 
    {
        //Begin problem 1
        System.out.println("Micronesia is made up of many small islands, including: \n Mariana Islands \n Wake Island \n Caroline Island");
        //end Problem 1
        
        //Begin problem 2
        int integer1;
        int integer2;
        double dub;
        
        integer1 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        integer2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another integer"));
        dub = Double.parseDouble(JOptionPane.showInputDialog("This time enter a double"));
        
        System.out.println("1. " + integer1 + " divided by " + integer2 + " equals " + integer1/integer2);
        System.out.println("2. " + integer1 + " divided by " + integer2 + " equals " + (double)integer1/integer2);
        System.out.println("3. " + integer1 + " divided by " + dub + " equals " + integer1/dub);
        //end problem 2
        
        //Begin problem 3
        String firstName;
        String lastName; 
        
        firstName = JOptionPane.showInputDialog("Enter your first name");
        lastName = JOptionPane.showInputDialog("Enter your last name");
        JOptionPane.showMessageDialog(null, firstName + " " + lastName);
        //end Problem 3 
        
        //Begin problem 4
        double rand = Math.random();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(rand));

        double price;
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price"));
        
        price *= rand;
        
        DecimalFormat ddf = new DecimalFormat("###,###.00");
        
        System.out.println("Your price is: " + ddf.format(price));
        //end problem 4
        
        
        showGameBoard(gb); //displays game board for problem 5
       
    }
    
    //Begin problem 5 methods 
    public void draw(Graphics g){
      g.setFont(new Font("Arial", Font.BOLD, 30));
      g.drawString("Counter variable: " + counter, 80, 250);

    }
    public void timer1(){
        counter += 10;
    }
    //end problem 5
}
