package RoutePlanner;

public class RoutePlanner2 {

    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,
                                      boolean[][] mapMatrix) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        if (mapMatrix == null) return false;
        if (fromColumn < 0 || fromRow < 0 || toColumn < 0 || toRow < 0) return false;
        if (toRow >= mapMatrix.length || toColumn >= mapMatrix[0].length || fromColumn >= mapMatrix.length || fromRow >= mapMatrix[0].length) return false;
        if (!mapMatrix[fromRow][toColumn] || !mapMatrix[toRow][toColumn]) return false;
        if (fromColumn == toColumn && fromRow == toRow) return true;
        // Go right
        boolean exist = routeExists(fromRow,fromColumn+1,toRow,toColumn,mapMatrix);
        // Go down
        if (!exist) exist = routeExists(fromRow+1,fromColumn,toRow,toColumn,mapMatrix);
        return exist;
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
