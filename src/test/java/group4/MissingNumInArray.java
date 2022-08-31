package group4;

public class MissingNumInArray {

	public static void main(String[] args) {
		int[] arr={1,9,4,5,6,7,8,3};
		int n=arr.length+1;
		int sum=(n*(n+1)/2);
		for(int i=0; i<arr.length; i++){
			sum=sum-arr[i]; 
		}
System.out.println("missing no is "+sum);
	}

}
