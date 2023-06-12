import java.util.*;
// N Queens solution
class Solution {

    public static void saveThis(char[][] chess, List<List<String>> ans){

        String row = "";
        List<String> ansChess = new ArrayList<>();
        for(int i = 0; i < chess.length ;i++){
            row = "";
            for(int j = 0; j<chess[0].length; j++){
                if(chess[i][j] == 'Q'){
                    row = row + 'Q';
                }
                else{
                    row = row + '.';
                }
            }
            ansChess.add(row);
        }
        ans.add(ansChess);
    }

    public static boolean isSafe(int row, int col, char[][] chess){

        for(int j = 0; j<chess.length; j++){
            if(chess[row][j] == 'Q'){
                return false;
            }
        }
        for(int i = 0; i<chess[0].length; i++){
            if(chess[i][col] == 'Q'){
                return false;
            }
        }
        //uapr left
        int r = row;
        for(int c = col; r>=0 && c>=0; c--, r--){
            if(chess[r][c] == 'Q'){
                return false;
            }
        }
        //upar right
        
        r = row;
        for(int c = col; r>=0 && c< chess[0].length; c++, r--){
            if(chess[r][c] == 'Q'){
                return false;
            }
        }
        //neeche right
        r = row;
        for(int c = col; r< chess.length && c< chess[0].length; c++, r++){
            if(chess[r][c] == 'Q'){
                return false;
            }
        }
        //neeche left
        r = row;
        for(int c = col; r< chess.length && c >= 0; c--, r++){
            if(chess[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }


    public static void helper (char [][] chess, List<List<String>> ans, int col){

        if(col == chess.length){
            saveThis(chess, ans);
        }

        for(int row = 0; row < chess.length; row++){
            if(isSafe(row, col, chess)){
                chess[row][col] = 'Q';
                helper(chess, ans, col+1);
                chess[row][col] = '.';
            }
        }
    }


    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] chess = new char[n][n];

        helper(chess, ans, 0);
        return ans;
    }


    public static void main(String [] args) {

        System.out.println(solveNQueens(5));
    }
}