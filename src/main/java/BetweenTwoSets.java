package main.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

    public int find(List<Integer> setA, List<Integer> setB) {
        int count = 0;
        List<Integer> multipleFactors = new ArrayList<>();


        deriveMultipleFactorsOfList(setB, multipleFactors);

        if(setA.get(0) == 1){
            return multipleFactors.size() + 1;
        }

        count = countTheMultipleFactorsBetweenTwoSets(count, multipleFactors, setA);
        return count;
    }

    private int countTheMultipleFactorsBetweenTwoSets(int count, List<Integer> multipleFactors , List<Integer> setA) {
        boolean isAllNumbersOfSetAFactorOfNumber = true;
        for(Integer multipleFactor: multipleFactors){
           for(int number: setA){
               isAllNumbersOfSetAFactorOfNumber = true;
               if(!isDivisible(multipleFactor, number)){
                   isAllNumbersOfSetAFactorOfNumber = false;
                   break;
               }
           }
            if(isAllNumbersOfSetAFactorOfNumber){
                count++;
            }
        }
        return count;
    }

    private void deriveMultipleFactorsOfList(List<Integer> setB, List<Integer> multipleFactors) {
        for(int i = 2; i<= setB.get(0); i++){
            if(divideThroughList(setB,i)){
                multipleFactors.add(i);
            }
        }
        Collections.sort(multipleFactors);
        Collections.reverse(multipleFactors);
    }

    private boolean divideThroughList(List<Integer> numbers, int divisor) {
        for(Integer number: numbers){
            if(number % divisor != 0){
                return false;
            }
        }
        return true;
    }

    private boolean isDivisible(int number1, int number2) {
        return number1 % number2 == 0;
    }

}
