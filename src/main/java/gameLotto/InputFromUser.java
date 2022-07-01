package gameLotto;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class InputFromUser implements Reciveable{
    final Scanner scanner;

    InputFromUser(Scanner scanner) {
        this.scanner = scanner;
    }

    public Set<Integer> receiveSixNumbers() {
        Set<Integer> setOfUserNumbers = new LinkedHashSet<>();
        while (setOfUserNumbers.size() < 6) {
            System.out.println("Gimme number from scope 1-49");
            String currentValueInputByUser = scanner.nextLine();
            checkTheNumberAndAddToSetOfUserNumbers(setOfUserNumbers, currentValueInputByUser);
        }
        return setOfUserNumbers;
    }

    private void checkTheNumberAndAddToSetOfUserNumbers(Set<Integer> setOfUserNumbers, String currentValueInputByUser) {
        int currentValue = 0;
        try {
            currentValue = Integer.parseInt(currentValueInputByUser);
        } catch (NumberFormatException exception) {
            System.out.println("Your number is not a number");
            return;
        }
        if (currentValue >= 1 && currentValue <= 49) {
            boolean addedNumber = setOfUserNumbers.add(currentValue);
            if (addedNumber) {
                System.out.println("You added number " + currentValue);
            } else {
                System.out.println("Number has been already added");
            }
        } else {
            System.out.println("Number is not in the scope");
        }
    }
}
