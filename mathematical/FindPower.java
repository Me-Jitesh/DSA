package mathematical;

public class FindPower {

    public void findPowerMetod1(int base, int expo) {
        int ans = 1;
        for (int i = 1; i <= expo; i++) {
            ans = ans * base;
        }
        System.out.println("Answer is : " + ans);
    }
}
