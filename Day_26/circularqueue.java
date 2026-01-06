public class circularqueue {
    
int start,end,currentsize,size;
int[] arr;
    public MyCircularQueue(int k) {
    start=-1;
    end=-1;
    currentsize=0;
    size=k;
    arr=new int[k];
    
    }
    
    public boolean enQueue(int value) {
        if(currentsize==size)
        return false;
        if(start==-1&&end==-1){
            start=0;
            end=0;
        }
        else
        end++;
        arr[end%size]=value;
        currentsize++;
        return true;
    }
    
    public boolean deQueue() {
       if(currentsize==0)
        return false;
        if(currentsize==1){
            start=-1;
            end=-1;
        }
        else
        start++;
        //arr[end%size]=value;
        currentsize--;
        return true; 
    }
    
    public int Front() {
        if(currentsize==0)
        return -1;
        else
        return arr[start%size];
    }
    
    public int Rear() {
         if(currentsize==0)
        return -1;
        else
        return arr[end%size];
    }
    
    public boolean isEmpty() {
        return (currentsize==0);
    }
    
    public boolean isFull() {
         return (currentsize==size);
       
    }
}
