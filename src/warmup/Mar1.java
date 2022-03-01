package warmup;

import java.util.Arrays;

public class Mar1 {
    public static void main(String[] args) {
        int[] test = {2,4,8,5,1,2};
        System.out.println("addEvenOdd(test) = " + Arrays.toString(addEvenOdd(test)));
    }

    public static int[] addEvenOdd(int[] nums){
        int oddResult = 0;
        int evenResult = 0;
        int[] resultArr = new int[2];

        for(int num : nums){
            if(num % 2 == 0){
                evenResult += num;
            } else {
                oddResult += num;
            }
        }
        resultArr[0] = oddResult;
        resultArr[1] = evenResult;
        return resultArr;
    }
}
