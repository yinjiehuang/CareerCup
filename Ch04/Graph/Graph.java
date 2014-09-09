import java.util.*;

class Graph {
        public int v;
        public HashMap<Integer, LinkedList<Integer>> adj;

        public Graph(int v) {
                // v is the total number of vertices in the Graph
                this.v = v;
                this.adj = new HashMap<Integer, LinkedList<Integer>>();
                for (int i = 0; i < v; i++) {
                        adj.put(i, new LinkedList<Integer>());
                }
        }

        public void addEdge(int i, int j) {
                adj.get(i).add(j);
        }

        public void removeEdge(int i, int j) {
                Iterator<Integer> it = adj.get(i).iterator();
                while (it.hasNext()) {
                        if (it.next() == j) {
                                it.remove();
                        }
                }
        }

        public void printAdj() {
                // This function is used to print adj list
                for (int i = 0; i < v; i++) {
                        System.out.print("Node "+i+ ": ");
                        Iterator<Integer> it = adj.get(i).iterator();
                        while (it.hasNext()) {
                                System.out.print(" "+it.next()+" ");
                        }
                        System.out.println();
                }
        }

        public void bfs(Graph g, int r) {
                Boolean[] visted = new Boolean[v];
                Arrays.fill(visted, false);
                Queue<Integer> q = new LinkedList<Integer>();
                q.add(r);
                System.out.print(" "+r+" ");
                visted[r] = true;
                while (!q.isEmpty()) {
                	int i = q.remove();
                	Iterator<Integer> it = adj.get(i).iterator();
                	while (it.hasNext()) {
                		int temp = it.next();
                		if (visted[temp] == false) {
                			System.out.print(" "+temp+" ");
                			q.add(temp);
                			visted[temp] = true;
                		}
                	}
                }
        }
        
        public void dfs(Graph g, int r) {
        	Boolean[] visted = new Boolean[v];
        	Arrays.fill(visted, false);
        	Stack<Integer> s = new Stack<Integer>();
        	s.push(r);
        	System.out.print(" "+r+" ");
        	visted[r] = true;
        	while (!s.isEmpty()) {
        		int i = s.pop();
        		Iterator<Integer> it = adj.get(i).iterator();
        		while (it.hasNext()) {
        			int temp = it.next();
        			if (visted[temp] == false) {
        				System.out.print(" "+temp+" ");
            			s.push(temp);
            			visted[temp] = true;
            			break;
        			}
        		}
        	}
        }

        public static void main(String[] args) {
                System.out.println("A simple implementatioin of Graph!!");
                Graph g = new Graph(12);
                g.addEdge(0,1);
                g.addEdge(1,0);
                g.addEdge(1,2);
                g.addEdge(2,1);
                g.addEdge(2,3);
                g.addEdge(3,2);
                g.addEdge(0,4);
                g.addEdge(4,0);
                g.addEdge(1,5);
                g.addEdge(5,1);
                g.addEdge(1,6);
                g.addEdge(5,2);
                g.addEdge(2,6);
                g.addEdge(6,2);
                g.addEdge(3,7);
                g.addEdge(7,3);
                g.addEdge(4,5);
                g.addEdge(5,4);
                g.addEdge(5,6);
                g.addEdge(6,5);
                g.addEdge(6,7);
                g.addEdge(7,6);
                g.addEdge(4,8);
                g.addEdge(8,4);
                g.addEdge(5,9);
                g.addEdge(9,5);
                g.addEdge(6,10);
                g.addEdge(10,6);
                g.addEdge(7,11);
                g.addEdge(11,7);
                g.addEdge(8,9);
                g.addEdge(9,8);
                g.addEdge(9,10);
                g.addEdge(10,9);
                g.addEdge(10,11);
                g.addEdge(11,10);
                g.printAdj();
                System.out.println("BFS:");
                g.bfs(g,0);
                System.out.println();
                System.out.println("DFS");
                g.dfs(g, 0);
        }
}
