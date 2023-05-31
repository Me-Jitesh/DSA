package BitManipulation;

public class CheckSetBit {

  public static boolean isBitSet(int num, int bit) {
    int res = num & (1 << bit);
    boolean ans = (res == 0) ? false : true;
    System.out.println("Is Set Bit : " + ans);
    return ans;
  }
}
