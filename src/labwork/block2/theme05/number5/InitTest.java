package labwork.block2.theme05.number5;

public class InitTest {
    private int id;
    private static int nextId;

    static {
        nextId = (int) (100 * Math.random());
    }

    {
        nextId++;
        id = nextId;
    }

    public InitTest() {
//        System.out.println("nextId: " + nextId);
//        System.out.println("Id: " + id);
    }

    public int getId() {
        return id;
    }
}
