package main.Test;

import main.java.BetweenTwoSets;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoSetsTest {
    @Test
    void should_integer_between_sets_be_2_when_setA_is_2_6_setB_is_24_36(){
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
        List<Integer> setA = new ArrayList<>(Arrays.asList(2,6));
        List<Integer> setB = new ArrayList<>(Arrays.asList(24,36));

        int actual = betweenTwoSets.find(setA,setB);

        assertEquals(2,actual);
    }

    @Test
    void should_count_be_3_when_setA_2_4_and_setB_16_32_96() {
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
        List<Integer> setA = new ArrayList<>(Arrays.asList(2,4));
        List<Integer> setB = new ArrayList<>(Arrays.asList(16,32,96));

        int actual = betweenTwoSets.find(setA,setB);

        assertEquals(3,actual);
    }

    @Test
    void should_count_be_5_when_setA_3_4_and_setB_24_48() {
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
        List<Integer> setA = new ArrayList<>(Arrays.asList(3,4));
        List<Integer> setB = new ArrayList<>(Arrays.asList(24,48));

        int actual = betweenTwoSets.find(setA,setB);

        assertEquals(2,actual);
    }

    @Test
    void should_count_be_8_when_setA_1_and_setB_72_48() {
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
        List<Integer> setA = new ArrayList<>(Arrays.asList(1));
        List<Integer> setB = new ArrayList<>(Arrays.asList(72,48));

        int actual = betweenTwoSets.find(setA,setB);

        assertEquals(8,actual);
    }

    @Test
    void should_count_be_9_when_setA_1_and_setB_100() {
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
        List<Integer> setA = new ArrayList<>(Arrays.asList(1));
        List<Integer> setB = new ArrayList<>(Arrays.asList(100));

        int actual = betweenTwoSets.find(setA,setB);

        assertEquals(9,actual);
    }

    @Test
    void should_count_be_2_when_setA_2_3_6_and_setB_42_84() {
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
        List<Integer> setA = new ArrayList<>(Arrays.asList(2,3,6));
        List<Integer> setB = new ArrayList<>(Arrays.asList(42,84));

        int actual = betweenTwoSets.find(setA,setB);

        assertEquals(2,actual);
    }
}