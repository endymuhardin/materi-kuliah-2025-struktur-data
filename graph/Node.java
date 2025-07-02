public class Node {
    String label;

    Node(String x){
        label = x;
    }

    public String getLabel(){
        return label;
    }

    // Penjelasan : https://g.co/gemini/share/c3e6e28e79a1
    @Override
    public boolean equals(Object lain){
        if(lain == this) return true;
        if(lain == null) return false;
        if(!(lain instanceof Node)) return false;
        Node nodeLain = (Node) lain;
        return this.label.equals(nodeLain.label);
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }

    

}
