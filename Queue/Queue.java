// Queue Class in Java to create integer Queues
public class Queue {
    // Class Attributes
    private int Queue[];
    private int Queue_Index = 0;

    // Constructor
    public Queue(int Queue_Size)
    {
        // initialising integer array;
        this.Queue = new int[Queue_Size];
    }

    // public method for adding elements to queue
    public void enqueue(int element)
    {
        // if the queue is full then display error message and return
        if(this.Queue.length == this.Queue_Index)
        {
            System.out.println("Queue is full! Element " + element + " not Enqueued");
            return;
        }

        // else add the element to queue and increase the queue index by 1
        this.Queue[this.Queue_Index] = element;
        this.Queue_Index++;
    }

    // public method for removing elements from queue
    public void dequeue()
    {
        // if the queue is empty then display error message and return
        if(this.Queue_Index == 0)
        {
            System.out.println("Queue is empty! Nothing to Dequeue!");
            return;
        }

        // else replace elements starting from 2 position of array [1st element is replaced by 2nd, 2nd element is replaced by 3rd.... till the queue index] and decrease queue index by 1
        for(int i = 1; i < this.Queue_Index; i++)
        {
            this.Queue[i-1] = this.Queue[i];
        }
        this.Queue_Index--;
    }

    // public method for displaying queue
    public void display()
    {
        // returns if the queue is empty
        if(this.Queue_Index == 0)
            return;

        // displays the queue if the queue is not empty
        System.out.println("--Back--");
        for(int i = this.Queue_Index - 1; i >= 0; i--)
        {
            System.out.println("| " + this.Queue[i] + " |");
        }
        System.out.println("--Front--");
    }
}
