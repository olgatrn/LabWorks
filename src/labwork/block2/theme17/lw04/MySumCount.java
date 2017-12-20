package labwork.block2.theme17.lw04;

public class MySumCount implements Runnable {
    private int startIndex;
    private int stopIndex;
    private int[] array;
    private long resultSum;

    public long getResultSum() {
        return resultSum;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    @Override
    public void run() {
        for (int i = getStartIndex(); i <= getStopIndex(); i++) {
            resultSum += array[i];
        }
    }
}
