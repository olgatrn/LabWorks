package practices.threads.mypract;

public class Parent implements Print{
    int a;

    public Parent(int a) {
        this.a = a;
    }

    @Override
    public void print(int a) {
        System.out.println(a);
    }
}
