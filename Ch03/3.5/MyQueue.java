public class MyQueue<T> {
        Stack<T> olds,news;

        MyQueue() {
                olds = new Stack<T>();
                news = new Stack<T>();
        }

        public void add(T key) {
                news.push(key);
        }

        public void shift() {
                if (olds.isEmpty()) {
                        while(!news.isEmpty()) {
                                olds.push(news.pop());
                        }
                }
        }

        public T peek() {
                shift();
                return olds.peek();
        }

        public T remove() {
                shift();
                return olds.pop();
        }
}
