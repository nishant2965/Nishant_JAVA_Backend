public class wordReverse {
    

    public static void main(String [] sadff){
        String str = "this is an example";
        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : strArray) {
            int high = s.length() - 1;
            StringBuilder sbTemp = new StringBuilder();

            while (high >= 0) {
                sbTemp.append(s.charAt(high--));
            }
            sb.append(sbTemp).append(" ");

        }
        System.out.println(sb.toString().trim());
    }
}
