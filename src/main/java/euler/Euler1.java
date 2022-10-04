package euler;

import java.util.stream.IntStream;

public class Euler1 {


    public int getResult(int limit) {
        return IntStream.range(0, limit).filter(i -> i % 3 == 0 || i % 5 == 0).sum();
    }

}
