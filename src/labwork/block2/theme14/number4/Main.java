package labwork.block2.theme14.number4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayOfIntegers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arrayOfString = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        MyMixer<Integer> myMixerForIntegers = new MyMixer(arrayOfIntegers);
        MyMixer<String> myMixerForStrings = new MyMixer(arrayOfString);
        System.out.println(Arrays.toString(myMixerForIntegers.shuffle()));
        System.out.println(Arrays.toString(myMixerForStrings.shuffle()));
    }
}
