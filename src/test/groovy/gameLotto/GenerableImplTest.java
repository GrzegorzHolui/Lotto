package gameLotto;

import java.util.Set;

 class GenerableImplTest implements Generable {
    final Set<Integer> numbers;

    public GenerableImplTest(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Set<Integer> generateSixNumbers() {
        return numbers;
    }
}
