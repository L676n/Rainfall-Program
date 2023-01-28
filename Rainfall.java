
package assigment7;

public class Rainfall {
    
    private double[] months;
    private double total = 0;
    private double average;
    
    
    public Rainfall(double[] m){
        months = new double[m.length];
        for (int i = 0; i < m.length; ++i)
            months[i] = m[i];
        
    }
    
    
    
    public double getTotalRain(){
        for(int t = 0; t < months.length; ++t){
            total += months[t];
        }
        return total;
    }
    
    
    public double getAverageRain(){
        for (int a = 0; a < months.length; ++a){
            average = total / months.length;
        }
        return average;
    }
    
    public double getMost(){
        double most = months[0];
        for(int m = 1; m < months.length; ++m){
            if(months[m] > most)
                most = months[m];
        }
        return most;
    }
    
    public double getLeast(){
        double least = months[0];
        for(int m = 1; m < months.length; ++m){
            if(months[m] < least)
                least = months[m];
        }
        return least;
    }
}
