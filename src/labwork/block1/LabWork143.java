package labwork.block1;

public class LabWork143 {
    public static void main(String[] args){
        boolean myBoolean1 = 5 > 7;
        boolean myBoolean2 = 0b100000 > 25;
        boolean resultAndOperation = myBoolean1 & myBoolean2;
        boolean resultOrOperation = myBoolean1 | myBoolean2;
        boolean resultNotOperation = !myBoolean2;
        boolean resultXorOperation = myBoolean1 ^ myBoolean2;
        System.out.println("myBoolean1 is: " + myBoolean1 + ", and myBoolean2 is: " + myBoolean2);
        System.out.println("The result of AND operation is: " + resultAndOperation);
        System.out.println("The result of OR operation is: " + resultOrOperation);
        System.out.println("The result of NOT operation for myBoolean2 is: " + resultNotOperation);
        System.out.println("The result of XOR operation is: " + resultXorOperation);
    }
}
