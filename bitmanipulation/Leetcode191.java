package bitmanipulation;

public class Leetcode191 {
    public void numberOfOneBits(int num) {

        int occurence = 0;

        while (num != 0) {

            // Checking last Bit
            int bit = num & 1;
            if (bit == 1) {
                occurence++;
            }

            // removing last bit
            num = num >> 1;
        }

        System.out.println("Number Of 1 Bits in Given Number is : " + occurence);
    }
}
