package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput{
 
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       int n = input.nextInt();

       int[] array = new int[n];

       for(int i = 0; i < array.length; i++){
          array[i] = input.nextInt();
       }

       String arrayAsString = Arrays.toString(array);
       System.out.println("Numbers: " + arrayAsString);
  }
}