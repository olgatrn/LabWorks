public class LabWork146 {
    public static void main(String[] args){
        byte var1 = 0b00101;
        byte var2 = 0b01100;
        byte resultAndOperation = (byte)(var1 & var2);
        byte resultOrOperation = (byte) (var1 | var2);
        byte resultNotOperation = (byte)~var2;
        byte resultXorOperation = (byte) (var1 ^ var2);
        System.out.println("var1 = " + var1 + ", and var2 = " + var2);
        System.out.println("The result of AND operation is: " + resultAndOperation);
        System.out.println("The result of OR operation is: " + resultOrOperation);
        System.out.println("The result of NOT operation for var2 is: " + resultNotOperation);
        System.out.println("The result of XOR operation is: " + resultXorOperation);
    }
}
