import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(Node x){
        adjacencyList.put(x, new LinkedList<>());
    }

    public void addEdge(Node source, Node destination){
        List<Node> tetanggaSource = adjacencyList.get(source);
        tetanggaSource.add(destination);

        List<Node> tetanggaDestination = adjacencyList.get(destination);
        tetanggaDestination.add(source);
    }

    public List<Node> daftarTetangga(Node x){
        return adjacencyList.get(x);
    }
}
