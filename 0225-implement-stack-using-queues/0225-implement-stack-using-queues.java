public class MyStack {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    public MyStack() {

    }

    public void push(int x) {
        queue1.offer(x);
        for (int i =  queue1.size()-1; i > 0; i--) {
            queue2.offer(queue1.poll());
            queue1.offer(queue2.poll());
        }

    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}