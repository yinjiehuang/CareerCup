// Given a directed graph, design an algorithm to find out whether there is a route between two nodes
//

import java.util.*;

class isRoute {
        public static void main(String[] args) {
                System.out.println("CareerCup 4.2!!!");
                Graph g = new Graph(4);
                g.addEdge(0,1);
                g.addEdge(1,3);
                g.addEdge(2,3);

                isRoute ir = new isRoute();
                System.out.println(ir.run(g,0,3));
        }

        public boolean run(Graph g, int n1, int n2) {
                // This is a bfs based search (starting from n1), if we have found n2 on the way, return true
                Queue<Integer> q = new LinkedList<Integer>();
                Boolean[] visted = new Boolean[g.v];
                Arrays.fill(visted, false);
                q.add(n1);
                visted[n1] = true;
                while (!q.isEmpty()) {
                        int i = q.remove();
                        Iterator<Integer> it = g.adj.get(i).iterator();
                        while (it.hasNext()) {
                                int temp = it.next();
                                if (visted[temp] == false) {
                                        if (temp == n2) {
                                                return true;
                                        } else {
                                                q.add(temp);
                                                visted[temp] = true;
                                        }
                                }
                        }
                }
                return false;
        }
}

class Graph {
        public int v;
        public HashMap<Integer, LinkedList<Integer>> adj;

        public Graph(int v) {
                this.v = v;
                this.adj = new HashMap<Integer, LinkedList<Integer>>();
                for (int i = 0; i < v; i++) {
                        adj.put(i, new LinkedList<Integer>());
                }
        }

        public void addEdge(int i, int j) {
                adj.get(i).add(j);
        }
}
