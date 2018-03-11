import java.util.Scanner;


public class Vikas {

    public static void main(String args[])
    { 
        double[][] m = new double[3][3];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)           	
                m[i][j] = input.nextDouble();
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        
                               
        System.out.println(isMarkovMatrix(m) ? "The matrix is a positive Markov." : "The matrix is NOT positive Markov.");
          
    }

    public static boolean isMarkovMatrix(double[][] m) {

        for (int j = 0; j < m[0].length; j++) {
            double sum = 0;

            for (int i = 0; i < m.length; i++) {

                double num = m[i][j];
                if (num < 0) return false;
                sum += num;
            }
            if (sum != 1) return false;
        }

        return true;
    }
    
}
