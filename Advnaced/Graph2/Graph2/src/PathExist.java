public class PathExist {


    static boolean pathExistRec(int[][] grid, int s, boolean[] visited) {


        visited[s] = true;
        if (s == 2) {
            return true;
        }

        for (int v : grid[s]) {
            pathExistRec(grid, v, visited);
        }

        return false;
    }


    static boolean pathExist(int[][] grid, int V) {
        boolean[] visited = new boolean[V];

        if (!visited[1]) {
            if (pathExistRec(grid, 1, visited)) {
                return true;
            }
        }

//        for (int i = 1; i <= grid.length; i++) {
//
//        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3}, {3, 2}};

        boolean exist = pathExist(grid, 5);
        System.out.println(exist);
    }

}
