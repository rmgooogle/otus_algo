package lect17_Dijkstra;

import java.util.Arrays;

public class DijkstrasAlgorithmTest {
    private static final Integer[][] GRAPH = new Integer[][]{
            {0, 2, 3, 6, null, null, null},
            {2, 0, 4, null, 9, null, null},
            {3, 4, 0, 1, 7, 6, null},
            {6, null, 1, 0, null, 4, null},
            {null, 9, 7, null, 0, 1, 5},
            {null, null, 6, 4, 1, 0, 8},
            {null, null, null, null, 5, 8, 0},
    };

    public static void main(String[] args) {
        DijkstrasAlgorithm algorithm = new DijkstrasAlgorithm(GRAPH, 0);

        Edge[] edge = new Edge[]{
                new Edge(0, 2, 3),
                new Edge(2, 3, 1),
                new Edge(3, 5, 4),
                new Edge(5, 4, 1),
                new Edge(4, 6, 5),
        };
        System.out.println(Arrays.equals(edge, algorithm.getShortestPath(6)));
    }

}
