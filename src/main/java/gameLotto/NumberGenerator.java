package gameLotto;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

class NumberGenerator implements Generable {
    Random random;

    public NumberGenerator(Random random) {
        this.random = random;
    }

    public Set<Integer> generateSixNumbers() {
        Set<Integer> setOfSixNumbers = new LinkedHashSet<>();
        while (setOfSixNumbers.size() < 6) {
            int valueToSetOfSixNumbers = random.nextInt(1, 50);
            setOfSixNumbers.add(valueToSetOfSixNumbers);
        }
        return setOfSixNumbers;
    }
}
