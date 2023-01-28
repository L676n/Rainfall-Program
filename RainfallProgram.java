
package assigment7;

import java.util.Scanner;

public class RainfallProgram {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
       
        final int limit = 12;
        double[] months = new double[limit];
        
        System.out.println("Enter the rate of rainfall for 12 months: ");
        for(int i = 0; i < months.length; ++i){
        System.out.printf("Enter %d number: ", i);
        months[i] = keyboard.nextDouble();
        
        }
        
        Rainfall rateArray = new Rainfall(months);
        
       System.out.println("\nThe total rainfall for the year: " + rateArray.getTotalRain());
       System.out.printf("The average monthly rainfall: %.2f" , rateArray.getAverageRain());
       System.out.println("\nThe month with the most rain: " + rateArray.getMost() +
                          "\nThe month with the least rain: " + rateArray.getLeast());
        
    }
    
    
}
