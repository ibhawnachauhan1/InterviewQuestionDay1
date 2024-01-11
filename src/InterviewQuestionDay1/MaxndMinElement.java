package InterviewQuestionDay1;

public class MaxndMinElement {

	public static void main(String[] args) {
		int arr[] = {2,4,7,8,9,10};
		int max =arr[0];
		int min = arr[0];
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] > max) {
				 max = arr[i];
			}
			
			
		}
	
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("The max of the element is "+ max);
		System.out.println("The min of the element is "+min);
		}
	}


