package labwork.block1;

public class LabWork144 {
    public static void main(String[] args){
        byte b = 0b0101;
        short s = 033;
        int i = 0x064;
        long l = 765_876_983_896L;
        System.out.println("b = " + b + ", s = " + s + ", i = " + i + ", l = " + l);
        byte resultPrefInc = ++b;
        long resultPrefDec = --s;
        byte resultPostInc = (byte)i++;
        long resultPostDec = l--;
        System.out.println("++b : " + resultPrefInc + ", --s : " + resultPrefDec + ", i++ : " + resultPostInc +
                            ", l-- : " + resultPostDec);
        System.out.println("b = " + b + ", s = " + s + ", i = " + i + ", l = " + l);
    }
}
