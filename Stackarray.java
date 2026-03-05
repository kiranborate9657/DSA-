class StackExample {

    static int stack[] = new int[5];
    static int top = -1;

    static void push(int value){
        if(top == stack.length - 1){
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    static void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    public static void main(String args[]){
        push(10);
        push(20);
        push(30);
        pop();
        pop();
    }
}
