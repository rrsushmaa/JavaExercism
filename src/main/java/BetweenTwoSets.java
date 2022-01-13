package main.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

    public int find(List<Integer> setA, List<Integer> setB) {
        int count = 0;
        List<Integer> multipleFactors = deriveMultipleFactorsOfList(setB);

        if (isSizeOfSetAisOneAndValueIsOne(setA)) {
            return Math.addExact(multipleFactors.size(), setA.get(0));
        }

        count = countTheMultipleFactorsBetweenTwoSets(count, multipleFactors, setA);
        return count;
    }

    private boolean isSizeOfSetAisOneAndValueIsOne(List<Integer> setA) {
        return setA.size() == 1 && setA.get(0) == 1;
    }

    private int countTheMultipleFactorsBetweenTwoSets(int count, List<Integer> multiplicationFactorsOfSetB, List<Integer> setA) {
        for (Integer multiplicationFactorOfSetB : multiplicationFactorsOfSetB) {
            if (isSetAFactorOfMultiplicationFactorOfSetB(setA, multiplicationFactorOfSetB)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSetAFactorOfMultiplicationFactorOfSetB(List<Integer> setA, Integer multiplicationFactorOfSetB) {
        for (int number : setA) {
            if (!isDivisible(multiplicationFactorOfSetB, number)) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> deriveMultipleFactorsOfList(List<Integer> setB) {
        List<Integer> multipleFactors = new ArrayList<>();
        for (int i = 2; i <= setB.get(0); i++) {
            if (divideThroughList(setB, i)) {
                multipleFactors.add(i);
            }
        }
        Collections.sort(multipleFactors);
        Collections.reverse(multipleFactors);

        return multipleFactors;
    }

    private boolean divideThroughList(List<Integer> numbers, int divisor) {
        for (Integer number : numbers) {
            if (number % divisor != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isDivisible(int number1, int number2) {
        return number1 % number2 == 0;
    }

}
