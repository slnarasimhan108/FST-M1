package activities;

import java.util.*;
public class Activity2 {

	public static void main(String[] args) {
		int[] numbArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numbArr));
        
        
        int SearchNum = 10;
        int fixedSum = 30;

        
        System.out.println("Result: " + result(numbArr, SearchNum, fixedSum));
    }
	public static boolean result(int[] numbers, int SearchNum, int fixedSum) {
        int temp_sum = 0;
        
        for (int number : numbers) {
        
            if (number == SearchNum) {
        
                temp_sum += SearchNum;
            }

        
            if (temp_sum > fixedSum) {
                break;
            }
        }

        return temp_sum == fixedSum;
    }
}


