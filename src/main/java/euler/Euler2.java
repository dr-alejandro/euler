package euler;

import java.util.ArrayList;
import java.util.List;

public class Euler2 {
    public List<Integer> getListOfFibonacciNumbersUpTo(int limit) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        for (int i = 0; i < limit; i++) {
            int nextNumber = result.get(i) + result.get(i + 1);
            if (nextNumber > limit) {
                break;
            }
            result.add(nextNumber);
        }
        return result;
    }

    public int filterForEvenValuedTermsAndSumUp(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).filter(i -> i%2 ==0).sum();
    }
}
