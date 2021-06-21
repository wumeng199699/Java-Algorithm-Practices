package RoutePlanner;

import java.util.*;

public class RoutePlanner1 {

    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,
                                      boolean[][] mapMatrix) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        if (!isReachable(fromRow, fromColumn, mapMatrix)) return false;
        Set<Integer> history = new HashSet<>();
        history.add(fromRow*mapMatrix[0].length + fromColumn);
        return routeExistsLoop(fromRow, fromColumn, toRow, toColumn, mapMatrix, history);
    }

    public static boolean routeExistsLoop(int fromRow, int fromColumn, int toRow, int toColumn,
                                          boolean[][] mapMatrix, Set<Integer> history){
        int[][] offset = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}}; // go left, go down, go right, go up
        if (fromRow == toRow && fromColumn == toColumn) return true;
        for (int i = 0; i < offset.length; i++){
            int curRow = fromRow + offset[i][0];
            int curCol = fromColumn + offset[i][1];
            if (isReachable(curRow, curCol, mapMatrix)){
                int location = curRow*mapMatrix[0].length + curCol;
                if (!history.contains(location)){
                    history.add(location);
                    boolean isExist = routeExistsLoop(curRow, curCol, toRow, toColumn, mapMatrix, history);
                    if (isExist) return true;
                }
            }
        }
        return false;
    }

    public static boolean isReachable(int curRow, int curCol, boolean[][] mapMatrix){
        return curRow >=0 && curCol >= 0 && curRow <= mapMatrix.length-1 && curCol <= mapMatrix[0].length-1 && mapMatrix[curRow][curCol];
    }

    public static void main(String[] args) {
        boolean[][] mapMatrix = {
                {true,  false, false},
                {true,  true,  false},
                {false, true,  true}
        };

        System.out.println(routeExists(0, 0, 2, 2, mapMatrix));
    }
}
