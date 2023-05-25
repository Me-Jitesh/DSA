package Mathematics;

public class Lcm {
    
    public static void findLcm(int num1, int num2){
        int res = (num1*num2)/EfficientEuclideanGcd.efficientEuclideanGcd(num1,num2);
        System.out.println("Lcm is : "+ res);
    }
}
