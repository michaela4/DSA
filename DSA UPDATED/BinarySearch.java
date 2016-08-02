// Name: Aranas, Michaela M.
// Course, Year: BSIS - 2
// Binary Search
// Date: 07/26/16

import java.util.Random;

public class BinarySearch {
  
   public static void main (String [] args){
    Random num = new Random();
    int target = 1 + num.nextInt(45); // the range is 45 so that if target is not on elements 1-40, the else statement, "Target not found", will be printed
    int index;
    int array [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
    System.out.println( "Target number to be found in 40 elements:  " + target);
    
    index = search (array, target);
    
    if (index != -1){
      System.out.println ("Target found at index number " + index);
    } else {
      System.out.println ("Target not found.");
    }
   }
    
   public static int search (int [] arry, int t){
      int low = 1, high = arry.length - 1, middleNum;
      while (low <= high){
         middleNum = (low + high) / 2;
         if (arry [middleNum] == t){
           return middleNum;
         } else if (arry[middleNum] < t){
           low = middleNum + 1;
         } else {
           high = middleNum - 1;
         }
      }    
      return -1; 
   }
}