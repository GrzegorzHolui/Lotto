package gameLotto;

import java.util.Set;

class ReciveableImplTest implements Reciveable {
    final Set<Integer> numberFromUser;

    public ReciveableImplTest(Set<Integer> numberFromUser) {
        this.numberFromUser = numberFromUser;
    }

    @Override
    public Set<Integer> receiveSixNumbers() {
        return numberFromUser;
    }
}
