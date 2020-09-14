import org.javatuples.Pair;

import java.util.List;

public interface SumArray {
    Pair<List<Integer>, Integer> CreateLIst(String value);
    Pair<List<Integer>, List<Integer>> Spl(String value);
    List<Integer> SumValueFromLists(List<Integer> listNew, int countRounds);
}
