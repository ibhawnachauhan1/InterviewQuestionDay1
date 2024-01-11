package InterviewQuestionDay1;

public class MinndMaxFinder {
      // Using enhanced loop
	public static void main(String[] args) {
		int arr[] = {1,23,54,67,88,98};
		int max =arr[0];
		int min = arr[0];
		for(int element : arr) {
			if(element > max)
			{
				max = element;
			}
		}
		for(int element : arr) {
			if(element < min)
			{
				min = element;

	}

}
		System.out.println("The max element is "+ max);
		System.out.println("The max element is "+ min);

	}
}
