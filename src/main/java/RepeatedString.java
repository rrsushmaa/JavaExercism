package main.java;

public class RepeatedString {

    public long findNumberOfAlphaBet_A(String s, long instance) {
        long no_of_alphabet_a;
        long quotient, reminder;
        if (!s.contains("a")) {
            return 0;
        }
        if (instanceIsInvalid(instance)) {
            return 0;
        }

        if (isStringAnAlphabet_A(s)) {
            return instance;
        }

        if (instance <= s.length()) {
            s = s.substring(0, (int) instance);
            return countAlphabetAInGivenString(s);
        }

        quotient = instance / s.length();
        reminder = instance % s.length();
        no_of_alphabet_a = countAlphabetAInGivenString(s) * quotient;

        if (reminder > 0) {
            s = s.substring(0, (int) reminder);
            no_of_alphabet_a += countAlphabetAInGivenString(s);
        }

        return no_of_alphabet_a;
    }

    private boolean isStringAnAlphabet_A(String s) {
        return s.equalsIgnoreCase("a");
    }

    private boolean instanceIsInvalid(long instance) {
        return instance <= 0;
    }

    private long countAlphabetAInGivenString(String s) {
        long no_of_alphabet_a = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'A') {
                no_of_alphabet_a++;
            }
        }
        return no_of_alphabet_a;
    }

}
