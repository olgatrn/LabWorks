public class LabWork145 {
    public static void main(String[] args){
        int var1 = -101;
        int var2 = var1;
        System.out.println("var1 = " + var1 + ", var2 = " + var2);
        var1 <<= 1;
        var2 *= 2;
        System.out.println("var1 = " + var1 + ", var2 = " + var2);
        var1 >>= 1;
        var2 /= 2;
        System.out.println("var1 = " + var1 + ", var2 = " + var2);
        var1 >>>= 1;
        var2 /= 2;
        System.out.println("var1 = " + var1 + ", var2 = " + var2);
    }
}
