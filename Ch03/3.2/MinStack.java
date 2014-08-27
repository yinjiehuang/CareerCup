public class MinStack extends Stack<Integer> {
        Stack<Integer> s2;
        MinStack() {
                s2 = new Stack<Integer>();
        }
		
        public void push(int x) {
                if (x <= min()) {
                        s2.push(x);
                }
                super.push(x);
	}
		
        public Integer pop() {
                int temp = super.pop();
                if (temp == min()) {
                        s2.pop();
                }
                return temp;
	}

        public Integer min() {
                if (s2.empty()) {
                        return Integer.MAX_VALUE;
                } else {
                        return s2.peek();
                }
	}
}
