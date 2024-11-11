package DFS;

public class DFSMaze {

    public static void main(String[] args) {
         
        int[][] maze = {
            {0, 1, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 1, 0},
            {0, 0, 0, 0, 1},
            {1, 1, 1, 0, 0}
        };

        boolean[][] visited = new boolean[maze.length][maze[0].length];

        dfs(0, 0, maze, visited);

    }

    public static boolean dfs(int row, int col, int[][] maze, boolean[][] visited) {

        System.out.println("Currently at: (" + row + ", " + col + ")");

        if(row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) { System.out.println("Can't move that way (OOB) !"); return false; } //If current position is out of bounds return false
        if(maze[row][col] == 1 || visited[row][col] == true) { System.out.println("Cant move that way (Visited / Wall) !"); return false; }  //If current position is a wall, or has been visited, return false
        if(row == maze.length - 1 && col == maze[0].length - 1) { System.out.println("Path Found!"); return true; }    //if the current position is the bottom right of the maze return true

        visited[row][col] = true;

        //Move up
        System.out.println("Moving Up\n"); 
        if (dfs(row - 1, col, maze, visited)) { return true;}

        //Move down
        System.out.println("Moving Down\n"); 
        if (dfs(row + 1, col, maze, visited)) { return true;}

        //Move left 
        System.out.println("Moving Left\n"); 
        if (dfs(row, col - 1, maze, visited)) { return true;}

        //Move right
        System.out.println("Moving Right\n"); 
        if (dfs(row, col + 1, maze, visited)) { return true;}

        return false;

    }
    
}
