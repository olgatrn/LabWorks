package labwork27_1_2_3_5;

public class Monitor extends Device {
    protected int resolutionX;
    protected int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return resolutionY == monitor.resolutionY;
    }
}
