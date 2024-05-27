public class Edge implements Comparable<Edge> {


    int source;
    int distination;
    int weight;


    public Edge(int s, int d, int w) {
        source = s;
        distination = d;
        weight = w;
    }

    @Override
    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }

}
