package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m=input.nextInt();
        char[] numbers = new char[m];
        char[] b=new char[m];
        int l=numbers.length-1;
        
        for (int index = 0; index < numbers.length; index++) {
          numbers[index] = input.next().charAt(0);
        }
        
        for (int j=0;j < b.length;j++) {
          b[j]=numbers[l];
          l--;
        }
        String bs = Arrays.toString(b);
        System.out.println("Reversed symbols: "+ bs );
    }
      
      

}