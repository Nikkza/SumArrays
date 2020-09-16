import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Logic implements SumArray {
    @Override
    public Pair<List<Integer>, Integer> CreateLIst(String value) {
        int numberOfItemInList = 0;
        int counter = 0;
        Pair<List<Integer>, Integer> listIntegerPair = null;
        if (value.chars().anyMatch(x -> x == ','))
        {
            var splitValue = value.split(",");
            try
            {
                numberOfItemInList = Integer.parseInt(splitValue[0]);
                counter = Integer.parseInt(splitValue[1]);
            }
            catch (Exception e)
            {
                System.out.println("Value must be a number from 1 - 9");
            }

            List<Integer> listOfNumbers = new ArrayList<Integer>();
            for (int i = 0; i < numberOfItemInList; i++) {
                listOfNumbers.add(getRandomIntegerWithinRange(1, 9));
            }
            listIntegerPair = Pair.with(listOfNumbers, counter);
        }
        else
        System.out.println("Value can't be empty you must write like this ex 8,2");

        return listIntegerPair;
    }

    @Override
    public int[][] splitArray(int[] array)
    {
        int n = array.length;
        int[] a = Arrays.copyOfRange(array, 0, (n) / 2);
        int[] b = Arrays.copyOfRange(array, (n) / 2, n);
        int[][] newArray = new int[][]{a, b};
        return newArray;
    }

    @Override
    public int[] SumValueFromLists(int[] array, int countRounds)
    {
        int[] firstArray = new int[]{};
        int[] secondArray = new int[]{};
        int cntArray1 = 0;
        int cntArray2 = 0;
        int[][] arrays;

        if (countRounds != 0) {
            int countWhileLoop = 0;
            arrays = splitArray(array);
            firstArray = arrays[0];
            secondArray = arrays[1];
            cntArray1 = firstArray.length;
            cntArray2 = secondArray.length;

            while ((countWhileLoop < countRounds))
            {
                for (int i = 0; i < cntArray2; i++)
                {
                    if (cntArray1 > i) {
                        secondArray[i] += firstArray[i];
                    }
                }
                countWhileLoop++;

                if (countWhileLoop < countRounds)
                {
                    arrays = splitArray(secondArray);
                    firstArray = arrays[0];
                    secondArray = arrays[1];
                    cntArray1 = firstArray.length;
                    cntArray2 = secondArray.length;
                }
            }
        }
        return secondArray;
    }

    private static int getRandomIntegerWithinRange(int min, int max)
    {
        int spread = max - min;
        return new Random().nextInt(spread + 1) + min;
    }
}
