package gameLotto;

import java.util.Set;

class AimedNumbers {
    long amountOfAimedNumbers(Set<Integer> numberFromUser, Set<Integer> generatedNumber) {
        return numberFromUser.stream()
                .filter(generatedNumber::contains)
                .count();
    }
}
