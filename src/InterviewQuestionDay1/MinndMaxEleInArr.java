package InterviewQuestionDay1;

import java.util.Arrays;

public class MinndMaxEleInArr {
    //Uisng Stream API
	public static void main(String[] args) {
		
    int arr[]= {65,77,9,44,544,98};
    int max = Arrays.stream(arr).max().orElseThrow();
    int min = Arrays.stream(arr).min().orElseThrow();
    
    System.out.println("The max element is "+ max);
    System.out.println("The min element is "+min);
    
	}

}
