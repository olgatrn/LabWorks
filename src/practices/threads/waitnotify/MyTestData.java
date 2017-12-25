package practices.threads.waitnotify;

public class MyTestData {
    private byte[] data;

    public void setData(byte[] data) {
        this.data = data;
    }

    public boolean ready() {
        return data != null;
    }
}
