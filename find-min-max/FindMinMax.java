/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* SOURCE CODE: FindMinMax.java
* AUTHOR NAME: Aranas, Michaela M.
* GITHUB URL: [github.com/michaela4]
* LAST UPDATE: [09/21/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/

public class FindMinMax {
  public static void main (String[] args){
    int[] numbers = { 88, 33, 55, 23, 64, 123};
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++){
      if (numbers[i] < min){
        min = numbers[i];
      }
      if (numbers[i] > max){
        max = numbers[i];
      }
    }
    System.out.println("Smallest number is " + min);
    System.out.println("Largest number is " + max);
  }
}