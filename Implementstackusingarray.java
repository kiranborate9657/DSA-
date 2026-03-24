class QueueArray {

    int queue[];
    int front, rear, size;

    QueueArray(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;

            rear++;
            queue[rear] = value;
            System.out.println("Inserted: " + value);
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted: " + queue[front]);
            front++;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println
