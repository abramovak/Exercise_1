import java.util.Scanner;
import java.lang.Math;

public class BirthdayClassCandles {
    public static void main ( String args[]){
        Scanner age = new Scanner(System.in);
        System.out.println("Please enter the child's age: ");

        int n = age.nextInt();
        System.out.println("Number of candles is: " + n);

        int[] heights = new int[n];
        System.out.println("Enter the heights of the candles: ");
        int w=0;
        for(int i=0; i<n; i++)
        {   heights[i]=age.nextInt();
            if((heights[i]>=1) && (heights[i]<=Math.pow(10,3)))
            { w++;
            continue;
            }
            else{System.out.println("You entered a wrong height, try again! "); break;}
        }

        if (w==n)
        {System.out.println(birthdayClassCandles(heights));}
}
   static int birthdayClassCandles(int[] candles){
    int x=0;
    int max=0;
    for(int i=0; i<candles.length; i++) {
        if (max < candles[i]) {
            max = candles[i];
            x = 1;
        }
        else if (max == candles[i]) {
            x++;
        }
    }

    return x;
    }
}