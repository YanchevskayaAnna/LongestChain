public class Calculator {

    public static String searchLongestChain (char[] sequence){
        int max = 0; int current = 0;
        for (char c: sequence) {
            if (c =="0".charAt(0)) {
                if (current > max) {max = current;}
                current = 0;
            }
            else current++;
        }
        return "" + max;
    }
}
