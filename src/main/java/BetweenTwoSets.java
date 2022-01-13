package main.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

    public int find(List<Integer> firstList, List<Integer> secondList) {
        int count = 0;
        List<Integer> multipleFactors = deriveMultipleFactorsOfList(secondList);

        if (isSizeOfListOneAndValueIsOne(firstList)) {
            return Math.addExact(multipleFactors.size(), firstList.get(0));
        }

        count = countTheFactors(count, multipleFactors, firstList);
        return count;
    }

    private boolean isSizeOfListOneAndValueIsOne(List<Integer> list) {
        return list.size() == 1 && list.get(0) == 1;
    }

    private int countTheFactors(int count, List<Integer> multiplicationFactorsOfSecondList, List<Integer> firstList) {
        for (Integer multiplicationFactor : multiplicationFactorsOfSecondList) {
            if (isGivenListAFactorOfGivenNumber(firstList, multiplicationFactor)) {
                count++;
            }
        }
        return count;
    }

    private boolean isGivenListAFactorOfGivenNumber(List<Integer> listOfNumbers, Integer number) {
        for (int numberFromList : listOfNumbers) {
            if (!isDivisible(number, numberFromList)) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> deriveMultipleFactorsOfList(List<Integer> list) {
        List<Integer> multipleFactors = new ArrayList<>();
        for (int i = 2; i <= list.get(0); i++) {
            if (isGivenNumberFactorOfList(list, i)) {
                multipleFactors.add(i);
            }
        }
        Collections.sort(multipleFactors);
        Collections.reverse(multipleFactors);

        return multipleFactors;
    }

    private boolean isGivenNumberFactorOfList(List<Integer> listOfNumbers, Integer divisor) {
        for (int number : listOfNumbers) {
            if (!isDivisible(number, divisor)) {
                return false;
            }
        }
        return true;
    }

    private boolean isDivisible(int number1, int number2) {
        return number1 % number2 == 0;
    }

}
