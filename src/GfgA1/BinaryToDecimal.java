package GfgA1;

public class BinaryToDecimal {
    public static String decimalToBinary(int n){
        String binary="";
        while (n>0){
            binary+=n%2;
            n=n/2;
        }
        return binary;
    }
    public static void main(String[] args) {
        System.out.println("output"+decimalToBinary(+2));
    }
}
