/*

Q. 36 valid sudoku 9x9 sudoku

-------------------------
// calculate gridNo
if (i >= 0 && i <= 2) {
    gridNo = j/3     // since it's int it would be type casted e.g. 2/3 = 0
} else if (i>=3 && i<=5) {
    gridNo = j/3 + 3;     since j is from 0 to 8, j/3  [ranges (0, 2)]
} else i from 6 to 8 {
    j/3 + 6;
}
---------------------------
//generalize gridNo
gridNo = j/3 + (i/3)*3


 */


import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // allocate an regular array of set items, bcz we can easily see, if our current cell
        // is already present in row, col or grid set.
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];


        for( int i = 0; i <9; i++){
            for(int j = 0; j <9; j++){
                int gridNo = (i/3)*3 + j/3;

                // if cell empty, do nothing. we only do something with non empty cell
                // if the cell is not empty, check if present in row or col or grid.
                // only then its valid sudoku cell

                if(board[i][j] != '.'){ // if cell is not empty, then

                    // check if row, col, grid set contains the current cell
                    boolean isPresetnInRow = rowSet[i].contains(board[i][j]);
                    boolean isPresetnInRow = colSet[i].contains(board[i][j]);
                    boolean isPresetnInGridSet = gridSet[gridNo].contains(board[i][j]);

                    //if current cell present in any one, then its invalid sudoku
                    if(isPresetnInGridSet || isPresetnInRow || isPresetnInGridSet){
                        return false;
                    }

                    //since the current element passed the test of not present in r c g,
                    // add to sets, so we'd easily know if it repeats
                    // since sets have no order, we just need to see if its repeating
                    rowSet[i].add(board[i][j]); // add to ith row, the current cell.

                    colSet[j].add(board[i][j]);

                    //create a theoretical gridSet, of 9 grid numbers.
                    gridSet[gridNo].add(board[i][j]);


                    // we add to sets cause next time they would quickly tell if cell is already in the corresponding row / cell / gridset

                }

            }
        }

        //finally since no element are unique in rows, cols and sets
        return true;

    }
}
