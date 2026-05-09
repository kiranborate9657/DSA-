class Queue {
    int front = 0, rear = -1;
    int size = 5;
    int arr[] = new int[size];

    void enqueue(int data) {
        if(rear == size - 1) {
            System.out.println("Queue Full");
        } else {
            rear++;
            arr[rear] = data;
            System.out.println(data + " inserted");
        }
    }

    void dequeue() {
        if(front > rear) {
            System.out.println("Queue Empty");
        } else {
            System.out.println(arr[front] + " deleted");
            front++;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();
    }
}
