/* Aranas, Michaela M.
 * BSIS - 2
 * Output No. 1 in DSA
 * 07-17-16
 */

public class ArrayQueueQuiz {
  private static int size = 5;
  int array[] = new int[size];
  int index = -1;
  int rear = 0;
  int flag = 0;

  public void enqueue(int num) {
    System.out.println("--------*--------*--------*--------*--------*--------*");
    System.out.println("Trying to Enqueue " + num + "...");
   
    if (isFull() == false){
      index++;
      flag++;
      array[index] = num;
      System.out.println( array[index] + " is added to queue. \n");
      showArrangeQueue();
    } else {
      System.out.println("Failed to Enqueue " + num);  
    }
  }

  public void dequeue() {
    System.out.println("--------*--------*--------*--------*--------*--------*");
    System.out.println("Trying to Dequeue ...");
    if (isEmpty() == false) {
      rear++;
      flag--;
      System.out.println("Dequeueing is done. \n");
      showArrangeQueue();
    } 
  }
  
  public boolean isFull(){
    if(flag == size){
      System.out.println("Queue is full");
      return true;
    } else { return false;}
  }
  
  public boolean isEmpty(){
    if(flag == 0){
      System.out.println("Queue is empty. Failed to Dequeue.");
      return true;
    } else { return false;}
  }
  
  public void showArrangeQueue(){
    
      System.out.println("Elements in Queue : ");
      for (int i = rear; i <= index; i++) {
        System.out.println(array[i]);
      }
  }
  
  void peekFront(){
    System.out.println ("--------*--------*--------*--------*--------*--------*");
    System.out.println ("Peek Front: " + array[rear]);
  }

  void peekRear(){
    System.out.println ("--------*--------*--------*--------*--------*--------*");
    System.out.println ("Peek Rear: " + array[index]);
  }
  
  public static void main(String[] args) {
    ArrayQueueQuiz simulation = new ArrayQueueQuiz();
    simulation.enqueue(13);
    simulation.enqueue(23);
    simulation.enqueue(2);
    simulation.enqueue(97);
    simulation.enqueue(8);
    simulation.enqueue(73);
    simulation.peekFront();
    simulation.dequeue();
    simulation.dequeue();
    simulation.peekRear();
    simulation.dequeue();
    simulation.dequeue();
    simulation.dequeue();
    simulation.dequeue();
  }
  
}
