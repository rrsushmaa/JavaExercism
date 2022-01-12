package main.Test;

import main.java.RepeatedString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedStringTest {
    @Test
    void shouldBe_0_when_input_is_test_and_sequence_is_2(){
        RepeatedString repeatedString = new RepeatedString();
        assertEquals(0, repeatedString.findNumberOfAlphaBet_A("test",2));
    }

    @Test
    void shouldBe_0_when_input_is_empty() {
        RepeatedString repeatedString = new RepeatedString();
        assertEquals(0,repeatedString.findNumberOfAlphaBet_A("",1));
    }

    @Test
    void shouldBe_0_when_input_has_alphabet_a_but_sequence_is_0() {
        RepeatedString repeatedString = new RepeatedString();
        assertEquals(0, repeatedString.findNumberOfAlphaBet_A("air",0));
    }

    @Test
    void should_be_2_with_string_a_sequence_2() {
        RepeatedString repeatedString = new RepeatedString();
        assertEquals(2,repeatedString.findNumberOfAlphaBet_A("a",2));
    }

    @Test
    void should_be_1_with_string_aba_sequence_1() {
        RepeatedString repeatedString = new RepeatedString();
        assertEquals(1, repeatedString.findNumberOfAlphaBet_A("aba",1));
    }

    @Test
    void should_be_7_when_input_aba_sequence_10() {
        RepeatedString repeatedString = new RepeatedString();
        assertEquals(7, repeatedString.findNumberOfAlphaBet_A("aba",10));
    }

    @Test
    void should_be_164280_when_input_gfcaaaecbg_seq_547602(){
        RepeatedString repeatedString = new RepeatedString();
        assertEquals(164280, repeatedString.findNumberOfAlphaBet_A("gfcaaaecbg",547602));
    }

    @Test
    void should_be_51574523448L_when_input_is_large_seq_736778906400L() {
        RepeatedString repeatedString = new RepeatedString();
        assertEquals(51574523448L, repeatedString.findNumberOfAlphaBet_A("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm",736778906400L
        ));
    }

    @Test
    void should_be_2_when_input_ababa_seq_3() {
        RepeatedString repeatedString = new RepeatedString();
        assertEquals(2, repeatedString.findNumberOfAlphaBet_A("ababa",3));
    }

    @Test
    void should_be_133_when_input_aba_seq_200() {
        RepeatedString repeatedString = new RepeatedString();
        assertEquals(133, repeatedString.findNumberOfAlphaBet_A("aba",200));
    }
}