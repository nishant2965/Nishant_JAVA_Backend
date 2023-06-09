public class checkAnagram {

    public static boolean check(String s , String s1){

        int[][] arr = new int[26][2];    
        for(int i = 0; i<s.length(); i++){
            arr[s.charAt(i) - 'a'][1] ++;
        }
        for(int i = 0; i<s1.length(); i++){
            arr[s1.charAt(i) - 'a'][1] --;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i][1] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        String s1 = "checkforthis";
        String s = "thisforcheck";

        System.out.println(check(s, s1)); 

    }
    
}
