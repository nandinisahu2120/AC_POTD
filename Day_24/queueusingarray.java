public class queueusingarray {
    
    int[] arr;
    int s,e;
    int currsize;
    int size;
    // Constructor
    public queueusingarray(int n) {
        // Define Data Structures
        arr=new int[n];
        s=-1;
        e=-1;
        size=n;
        currsize=0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return (currsize==0);
    }

    public boolean isFull() {
        // Check if queue is full
        return (currsize==size);
    }

    public void enqueue(int x) {
        // Enqueue
        if(s==-1)
        {
            s=0;
            e=0;
        }
        else
        e++;
        arr[e%size]=x;
        currsize++;
    }

    public void dequeue() {
        // Dequeue
        if(currsize==0)
        {
            s=-1;e=-1;
        }
        if(s>-1)
        {s++;
        currsize--;}
    }

    public int getFront() {
        // Get front element
        if(currsize==0)
        return -1;
        return (arr[s%size]);
    }

    public int getRear() {
        // Get last element
         if(currsize==0)
        return -1;
        return (arr[e%size]);
        
    }
}
