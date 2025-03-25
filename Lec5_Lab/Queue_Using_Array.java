package T.Lec5_Lab;

public class Queue_Using_Array {

    int front;
    int rear;
    int count;
    int arr[] = new int[100005];

    Queue_Using_Array(){
        front=0;
        rear=0;
        count = 0;
    }

    void push(int a){
        if(count == arr.length)return;
        arr[rear%arr.length]=a;
        rear++;
        count++;
    }

    int pop(){
        if (count == 0)
            return -1;
        count--;
        return arr[front++];
    }
}
