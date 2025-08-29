import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class GridPathfinder {

    // A record is a modern, concise way to create an immutable data-holder class.
    // It automatically generates a constructor, getters, equals(), hashCode(), and toString().
    record State(int row, int col, int dr, int dc, int moves) {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read grid dimensions
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Read the grid
        int[][] grid = new int[M][N];
        for (int i = 0; i < M; i++) {
            String rowStr = scanner.next();
            for (int j = 0; j < N; j++) {
                grid[i][j] = Character.getNumericValue(rowStr.charAt(j));
            }
        }

        // Read source, destination, and move rule
        int srcR = scanner.nextInt();
        int srcC = scanner.nextInt();
        int destR = scanner.nextInt();
        int destC = scanner.nextInt();
        int moveR = scanner.nextInt();
        int moveC = scanner.nextInt();

        // --- Call the solving function and print the result ---
        int result = findShortestPath(grid, srcR, srcC, destR, destC, moveR, moveC);
        System.out.println(result);
        
        scanner.close();
    }

    public static int findShortestPath(int[][] grid, int srcR, int srcC, int destR, int destC, int moveR, int moveC) {
        int M = grid.length;
        int N = grid[0].length;

        Queue<State> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        // Initial state: at the source, with the base move rule as the initial direction, 0 moves.
        State initialState = new State(srcR, srcC, moveR, moveC, 0);
        
        // The key for the visited set includes position AND direction of arrival.
        String initialKey = initialState.row() + "," + initialState.col() + "," + initialState.dr() + "," + initialState.dc();
        
        queue.add(initialState);
        visited.add(initialKey);

        // Standard BFS loop
        while (!queue.isEmpty()) {
            State current = queue.poll();

            // Goal check: If we've reached the destination, return the move count.
            if (current.row() == destR && current.col() == destC) {
                return current.moves();
            }

            // Generate the 4 possible next moves (Forward, Right, Left, Backward)
            int[] dr = {current.dr(), current.dc(), -current.dc(), -current.dr()}; // Fwd_r, Rgt_r, Lft_r, Bwd_r
            int[] dc = {current.dc(), -current.dr(), current.dr(), -current.dc()}; // Fwd_c, Rgt_c, Lft_c, Bwd_c

            for (int i = 0; i < 4; i++) {
                int nextDr = dr[i];
                int nextDc = dc[i];
                int nextRow = current.row() + nextDr;
                int nextCol = current.col() + nextDc;

                // --- Validation Checks ---
                // 1. Check if the next position is within the grid bounds.
                if (nextRow < 0 || nextRow >= M || nextCol < 0 || nextCol >= N) {
                    continue;
                }
                
                // 2. Check if we can move to the cell (must be 0).
                if (grid[nextRow][nextCol] == 1) {
                    continue;
                }

                // --- Check if this new state has been visited ---
                String nextKey = nextRow + "," + nextCol + "," + nextDr + "," + nextDc;
                if (visited.contains(nextKey)) {
                    continue;
                }

                // If all checks pass, it's a valid, new state.
                // Add it to the visited set and the queue.
                visited.add(nextKey);
                queue.add(new State(nextRow, nextCol, nextDr, nextDc, current.moves() + 1));
            }
        }

        // If the queue becomes empty and we haven't reached the destination, it's not possible.
        return -1;
    }
}