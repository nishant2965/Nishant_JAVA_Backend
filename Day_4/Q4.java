package Day_4;




final class Q4 {

    protected final int k = 10;

    final void finalValue(){
        System.out.println(k);
    }

    public static void main(String[] args){
        Q4 fObj = new Q4();
        fObj.finalValue();
    }

    
    
}
