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

public class LinearSearch {
  private int array [];
  private int capacity;
  
  public LinearSearch(int size) {
     capacity = size;
     array = new int[capacity];
   }
  
   public void toSearch(int search){
    int i;
    for (i = 0; i < capacity; i++){
      if ( array [i] == search ){
        System.out.println("FOUND: " + search + " is at array["+ i +"]");
        break;
      }
    }
    if (i == capacity){
      System.out.println("NOT FOUND: " + search + " is not in the array.");    
    }
  }
  
  public static void main (String args[]){
    Scanner input = new Scanner (System.in);
    
    System.out.print ("Enter array size: ");
    int size =  input.nextInt();
    LinearSearch implement = new LinearSearch(size);
    for (int k = 0; k < size; k++){
       Random rand = new Random();
       implement.array[k] = rand.nextInt(1000);
    }
    
    System.out.print ("Enter number to find: ");
    int search = input.nextInt();
    implement.toSearch(search); 
  }
}
