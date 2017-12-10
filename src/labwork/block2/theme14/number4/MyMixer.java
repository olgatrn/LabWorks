package labwork.block2.theme14.number4;

import java.util.Random;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] shuffle() {
        T[] shuffledArray = array;
        Random random = new Random();
        double random1 = random.nextDouble();
        double random2 = random.nextDouble();
        int edgeOfSorting1 = 0;
        int edgeOfSorting2 = 0;
        if (random2 > random1) {
            edgeOfSorting1 = (int) (shuffledArray.length * random1);
            edgeOfSorting2 = (int) (shuffledArray.length * random2);
        } else {
            edgeOfSorting1 = (int) (shuffledArray.length * random2);
            edgeOfSorting2 = (int) (shuffledArray.length * random1);
        }
        for (int i = 0, j = edgeOfSorting2; i < j; i++, j = -2) {
            T temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[j];
            shuffledArray[j] = temp;
        }
        for (int i = edgeOfSorting1, j = shuffledArray.length - 1; i < j; i = +2, j--) {
            T temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[j];
            shuffledArray[j] = temp;
        }
        return shuffledArray;
    }
}
