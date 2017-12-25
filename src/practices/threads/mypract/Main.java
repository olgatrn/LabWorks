package practices.threads.mypract;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(5);
        Child child = new Child(5, 6);
        child.print(6);

    }
}
