

public class trial {

    public static int helper(int i, int j, int m, int n){
        if(i == m || j== n){
            return 0;
        }

        if(i == m-1 && j == n-1){
            return 1;
        }
        int right = helper(i+1, j, m, n);

        int down = helper (i, j+1, m, n);
        return right + down;
    }
    public static void main (String [] args){
        
        System.out.println(helper(0,0,4,4));
       
    }
    
}