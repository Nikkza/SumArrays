import org.javatuples.Pair;

import java.util.List;

public interface SumArray
{
    Pair<List<Integer>, Integer> CreateLIst(String value);
    int[][] splitArray(int[] array);
    int[] SumValueFromLists(int[] array, int countRounds);
}
