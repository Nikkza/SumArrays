import org.javatuples.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Logic implements SumArray {
    @Override
    public Pair<List<Integer>, Integer> CreateLIst(String value) {
        int numberOfItemInList = 0;
        int counter = 0;
        Pair<List<Integer>, Integer> listIntegerPair = null;

        var splitValue = value.split(",");
        if (splitValue.length == 2)
        {
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
            for (int i = 0; i < numberOfItemInList; i++)
            {
                listOfNumbers.add(getRandomIntegerWithinRange(1,9));
            }

            listIntegerPair = Pair.with(listOfNumbers,counter);

        }
        else
           System.out.println("Value can't be empty you must write like this ex 8,2");

        return listIntegerPair;
    }

    @Override
    public Pair<List<Integer>, List<Integer>> Spl(String value) {
        return null;
    }

    @Override
    public List<Integer> SumValueFromLists(List<Integer> listNew, int countRounds) {
        return null;
    }
    private static int getRandomIntegerWithinRange(int min, int max) {
        int spread = max - min;
        return new Random().nextInt(spread + 1) + min;
    }
}
