import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


// Penjelasan : https://g.co/gemini/share/7ce3f81908e8
public class GraphDemo {
    public static void main(String[] args) {
        Node a = new Node("A");
        Graph myGraph = inisialisasiGraph(a);
        bfsTraversal(myGraph, a);
    }

    public static void bfsTraversal(Graph g, Node start){
        Set<Node> sudahVisit = new HashSet<>();
        Queue<Node> akanDikunjungi = new LinkedList<>();

        sudahVisit.add(start);
        akanDikunjungi.offer(start);

        while(!akanDikunjungi.isEmpty()) {
            Node palingDepan = akanDikunjungi.poll();
            System.out.println("Node saat ini : "+palingDepan.getLabel());

            for(Node tetangga : g.daftarTetangga(palingDepan)) {
                if(!sudahVisit.contains(tetangga)){
                    sudahVisit.add(tetangga);
                    akanDikunjungi.offer(tetangga);
                }
            }
        }
        System.out.println("\n");
    }

    public static Graph inisialisasiGraph(Node a){
        // ini graphnya
        Graph graph = new Graph();
        
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node i = new Node("I");
        Node j = new Node("J");
        Node k = new Node("K");

        // masukkan node ke graph
        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        graph.addNode(e);
        graph.addNode(f);
        graph.addNode(g);
        graph.addNode(h);
        graph.addNode(i);
        graph.addNode(j);
        graph.addNode(k);

        // setting tetangga
        graph.addEdge(a, b);
        graph.addEdge(a, c);
        graph.addEdge(a, d);

        graph.addEdge(b, e);
        graph.addEdge(e, f);

        graph.addEdge(c, g);
        graph.addEdge(c, h);

        graph.addEdge(h, i);

        graph.addEdge(d, j);
        graph.addEdge(d, k);

        return graph;
    }
}