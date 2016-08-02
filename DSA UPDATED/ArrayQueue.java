/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* DESCRIPTION: 
*
* A QUEUE is an ADT (abstract data type) in FIFO order (first in, first out).
* It has 2 main operations: (1) ENQUEUE for adding, and (2) DEQUEUE for removing elements.
* It is a protected SINGLY LINKED LIST where ENQUEUE and DEQUEUE are only allowed on the top front or last element in the queue.
* You may also PEEK to show the front element.
* Implementation can either be in ARRAY or LINKED LIST.
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* TODO: 
* 
* Implement a QUEUE using ARRAY that can hold a maximum of 10 string values.
* Create operations ENQUEUE, DEQUEUE, and PEEK.
* Allow PUSH only if the queue is not yet full.
* Allow DEQUEUE only if the queue is not yet empty.
* Allow PEEK to see the front element.
* Show the updated ARRAY QUEUE everytime you ENQUEUE or DEQUEUE.
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* PSEUDOCODE:
* 
* START PROGRAM
* 
*  SET capacity, head, tail, storage[]
* 
*  PROCEDURE show
*   FOR EACH element IN queue.capacity
*    PRINT queue[element]
* 
*  PROCEDURE isEmpty
*   IF queue[0] == null
*    PRINT queue is empty
*    return TRUE
*
*  PROCEDURE isFull
*  IF head == capacity
*    PRINT queue is full
*    return TRUE
* 
*  PROCEDURE enqueue
*   IF isFull
*    PRINT add failed. element did not enqueue.
*   ELSE
*    Queue temp = new Queue(element)
*     temp.next = head
*     head = temp
* 
*  PROCEDURE dequeue
*   IF isEmpty
*    PRINT remove failed. no element to dequeue.
*   ELSE
*    temp = head
*    head = head.next
*    remove temp
*   
*  PROCEDURE peek
*   IF isEmpty
*    PRINT 0
*   ELSE 
*    PRINT top
* 
*  PROCEDURE main
*  show that queue is empty
*  push 10 string until queue is full
*  show updated queue
*  try to enqueue again, return error message
*  dequeue head element
*  peek head element
*  dequeue all elements until stack is empty
*  show updated queue
*  try to enqueue again, return error message
* 
* END PROGRAM 
* 
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* SOURCE CODE: ArrayQueue.java
* AUTHOR NAME: Aranas, Michaela M.
* GITHUB URL: [github.com/michaela4]
* LAST UPDATE: [07/28/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/

public class ArrayQueue {
 private int capacity;
 private int rear, front = 0;
 private String[] storage;
 
  // constructor = initialize an object instance of the class
  public ArrayQueue(int size) {
     // assign the value of size to capacity
     capacity = size;
     storage = new String[capacity];
   }

  public void show() {
      // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
     for (int i = 0; i <= capacity - 1; i++) {
         System.out.println("queue [" + i + "] =    " + storage [i]);
     }
    
     System.out.println();
    }
   
   private boolean isEmpty() {
     if (storage[0] == null) {
       System.out.println("Queue is Empty.");         // print error message
       return true;
     } 
     return false;
   }

   private boolean isFull() {
     if ((rear-front) == capacity) {
       System.out.println("Queue is Full.");          // print error message
       return true;
     } 
     return false;
   }

   public void enqueue(String value) {
     if (isFull()) {
       System.out.println("Failed to add "+ value );        // print error message
       System.out.println();
     } else {
        System.out.println("... trying to enqueue on Queue[" + (rear-front) + "] ...");
        storage[rear-front] = value;
        /* increment or decrement top*/;
        rear++;
        System.out.println(value + " was successfully added.");
        System.out.println();
     }
   }

   public void dequeue() {
     if (isEmpty()) {
       System.out.println("Remove failed."); // print error message
     } else {
       System.out.println("... trying to dequeue[" + 0 + "] ...");
       /* increment or decrement top*/;
       System.out.println(storage[front] + " was successfully removed.");
       front++;
       for ( int j = 0; j < rear; j++ ){
         storage [j] = storage [j+front];
       }
       System.out.println();
     }
   }

   public void peek() {
     if (storage[front] == storage[0]) {
       System.out.println("PEEK TOP = " + storage[front]);
       System.out.println();
     } else {
       System.out.println("PEEK TOP = " + storage[0]);
       System.out.println();
     }
   }
   
   public static void main(String[] args) {
     ArrayQueue storage = new ArrayQueue(10);
     // construct a new array queue and assign 10 as the integer value for the size limit of the stack
     System.out.println("STORAGE CAPACITY = " + storage.capacity );
     System.out.println();
     storage.show(); // show empty stack
     storage.dequeue(); // try removing on an empty stack
     storage.peek(); // peek top element of an empty stack
     storage.enqueue("one");
     storage.show(); // show the updated stack
     storage.peek(); // peek if top element is "one"
     storage.enqueue("two");
     storage.show(); // show the updated stack
     storage.peek(); // peek if top element is "two"
     storage.enqueue("three");
     storage.show(); // show the updated stack
     storage.peek(); // peek if top element is "three"
     storage.enqueue("four");
     storage.show(); // show the updated stack
     storage.enqueue("five"); 
     storage.show(); // show the updated stack
     storage.dequeue(); // try removing "one"
     storage.show(); // FOR CHECKING PURPOSES, REMOVE ME LATER.......
     storage.enqueue("six"); 
     storage.enqueue("seven"); 
     storage.enqueue("eight"); 
     storage.enqueue("nine");    
     storage.enqueue("ten"); 
     storage.show();  // show the updated stack
     storage.peek(); // peek if top element is "ten"
     storage.enqueue("eleven");    // try adding "eleven"
     storage.enqueue("twelve");    // try adding "twelve"
     storage.show(); // show the updated stack
   }  
}
