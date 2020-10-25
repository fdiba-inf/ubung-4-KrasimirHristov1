package exercise4;

import java.util.Scanner;

public class ArrayOutput{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     int n = input.nextInt();
     int[] array = new int[n];
     String spaces = "";

     for(int i = 0; i < array.length; i++){
       array[i] = input.nextInt();
     }

     for(int i = 0; i < array.length; i++){
       if(i != 0){
         spaces += " ";
         System.out.println(spaces + array[i]);
       }
       else{
         System.out.println(array[i]);
       }
     }
   }
}
