import java.util.*;

public class Exercises {


	

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		
		// write your code here
		if(a[0] == b[0] || a[a.length-1] == b[b.length-1]){
			return true;
		}
		return false;	// default return value to ensure compilation
	}
	
	public String[] endsMeet(String[] values, int n) {
		// write your code here

		if ( n < 0 ) {
			return new String[0];
		}

		String[] result;
		result = new String[n*2];
		int counter = 0;

		if (values == null ||values.length < n || n < 0 || values.length == 0) {
			return new String[0];
		}

		
		System.out.println(result.length);

		for(int i = 0; i < n; i++){
			result[counter] = values[i];
			counter++;
		}
		for (int i = values.length - n; i < values.length; i++){
			result[counter] = values[i];
			counter++;
		}
		
		System.out.println(Arrays.toString(result));
		
		
		return result;	// default return value to ensure compilation
	}
	
	public int difference(int[] numbers) {
		// write your code here

		if ( numbers == null || numbers.length < 1) {
			return -1;
		}

		int bigger = numbers[0];
		int smaller = numbers[0];
		int difference;

		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] > bigger){
				bigger = numbers[i];
			}
			if(numbers[i] < smaller){
				smaller = numbers[i];
			}
		}

		difference = bigger - smaller;

		
		return difference;		// default return value to ensure compilation
	}
	
	public double biggest(double[] numbers) {
		// write your code here

		if ( numbers == null || numbers.length < 3 || numbers.length % 2 == 0) {
			return -1;
		}

		for(int i = 0; i < numbers.length -1; i++){
			if(numbers[i] < 0){
				return -1;
			}
		}

		

		double first = numbers[0];
		double middle = numbers[(numbers.length-1) / 2];
		double last = numbers[numbers.length-1];

		if(first > middle && first > last){
			return first;	
		} else if(middle > first && middle > last){
			return middle;
		} else if (last > middle && last > first){
			return last;
		} else {
			return first;
		}


		
				// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here

		if ( values == null || values.length < 3 || values.length % 2 == 0) {
			return new String[0];
		}
		
		for(int i = 0; i < values.length -1; i++){
			if(values[i] == null){
				return null;
			}
		}
		
		String first = values[((values.length-1) / 2) -1];
		String middle = values[(values.length-1) / 2];
		String last = values[((values.length-1) / 2)+ 1];

		String[] result;
		result = new String[3];

		result[0] = first;
		result[1] = middle;
		result[2] = last;



		
		return result;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		if ( numbers == null || numbers.length < 3) {
			return false;
		}

		for(int i = 0 ; i <= numbers.length-3 ; i++){
			int one = numbers[i];
			int two = numbers[i+1];
			int three = numbers[i+2];

			if(one < two && two < three){
				return true;
			}
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		if ( numbers == null || numbers.length < 1) {
			return false;
		}

		boolean continuity = false;

		for(int i = 0 ; i < numbers.length -2 ; i++){
			
			

			
			if(i == 0){
				if(numbers[i] == x){
					continuity = true;
				} else if (numbers[1] != x){
					return false;
				}
			} else if(numbers[i] == numbers[numbers.length-1]){
				if(numbers[i] == x){
					continuity =true;
				} else if (numbers[i-1] != x){
					return false;
				}

			} else if(numbers[i] == x){
				continuity = true;
			} else if (numbers[i] != x){
				if(numbers[i-1] == x || numbers[i+1] == x){
					continuity = true;
				} else {
					return false;
				}
			}


			



		}
		
		return continuity;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		if ( numbers == null || numbers.length <3) {
			return false;
		}
	
		for(int i = 0 ; i <= numbers.length-3 ; i++){
			int one = numbers[i];
			int two = numbers[i+1];
			int three = numbers[i+2];

			if(one % 2 == 0 && two % 2 == 0 && three % 2==0){
				return true;
			} else if (one % 2 == 1 && two % 2 == 1 && three % 2==1){
				return true;
			}
		}


		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		if ( numbers == null || numbers.length <2) {
			return false;
		}

		int[] newOne;
		newOne = new Int[numbers.length /2];
		int[] newTwo;
		newTwo = new Int[numbers.length /2];

		if(numbers.length % 2 == 0){

		}
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}

	public static void main(String[] args) 
    { 
		//System.out.println(endsMeet(new String[] {"one", "two", "three"}, 3));

	}
}
