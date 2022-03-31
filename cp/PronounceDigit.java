package cp;

public class PronounceDigit {

    public void pronounceDigit(int num, String[] pron) {

        // Base Case
        if (num == 0) {
            return;
        }

        // Processing
        int digit = num % 10;
        num = num / 10;

        // Recursive Call
        pronounceDigit(num, pron);

        // Print
        System.out.print(pron[digit] + "\t");
    }
}
