/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* SOURCE CODE: ArrayRandom.java
* AUTHOR NAME: Aranas, Michaela M.
* GITHUB URL: [github.com/michaela4]
* LAST UPDATE: [09/07/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
  private int array [];
  private int capacity;
  private int max = 0;
  private int sum =0;
  private float average = 0;
  
  public ArrayRandom(int size) {
     capacity = size;
     array = new int[capacity];
   }
  
  public void show (){
    System.out.println ("The numbers in the array are: ");
    for (int i = 0; i < capacity; i++){
       System.out.print ("\t" + array [i] );
    }
  }
  
  public void getSum(){
     for (int j = 0; j < array.length; j++){
      sum = sum + array [j];
      if ( max < array[j]){
        max = array[j];
      }
    } 
    System.out.println ("\nSum = " + sum);
  }
  
  public void getMax(){
    for (int j = 0; j < array.length; j++){
      if ( max < array[j]){
        max = array[j];
      }
    }
    System.out.println ("Max = " + max);
  }

  public void getAve(){
    average = sum / array.length;
    System.out.println ("Average = " + average);
  }
  
  public static void main (String args[]){
    Scanner input = new Scanner (System.in);
    
    System.out.println ("Please enter the array size:");
    int size =  input.nextInt();
    ArrayRandom storage = new ArrayRandom(size);
    
    System.out.println ("Initializing values.");
    for (int k = 0; k < size; k++){
       Random value = new Random();
       storage.array[k] = value.nextInt(1000);
    }
    
    storage.show();
    storage.getSum();
    storage.getAve();
    storage.getMax();
  }
}
