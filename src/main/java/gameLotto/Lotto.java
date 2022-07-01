package gameLotto;

import java.util.Set;

class Lotto {
    private final Generable numberGenerator;
    private final Reciveable inputFromUser;
    private final AimedNumbers aimedNumbers;

    public Lotto(Generable numberGenerator, Reciveable inputFromUser, AimedNumbers aimedNumbers) {
        this.numberGenerator = numberGenerator;
        this.inputFromUser = inputFromUser;
        this.aimedNumbers = aimedNumbers;
    }

    LottoResult start() {
        Set<Integer> generatedNumbers = numberGenerator.generateSixNumbers();
        Set<Integer> numbersOfUser = inputFromUser.receiveSixNumbers();
        long amountOfAimedNumbers = aimedNumbers.amountOfAimedNumbers(numbersOfUser, generatedNumbers);
        return new LottoResult("You aimed " + amountOfAimedNumbers);
    }
}