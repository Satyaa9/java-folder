import java.util.*;
class Solution{
	public double average(int[] arr){
		int minSalary = Integer.MAX_VALUE;
		int maxSalary = Integer.MIN_VALUE;

		int sum =0;

		for(int s : arr){
			sum += s;
			if(s<minSalary){
				minSalary=s;
			}
			if(s>maxSalary){
				maxSalary=s;
			}
		}
		sum = sum - minSalary - maxSalary;
		int remaining = arr.length-2;
		return (double) sum/remaining;
	}
}
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee count :");
		int n =sc.nextInt();

		int [] arr = new int[n];
		System.out.print("Enter salary of employee :");

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		Solution solution = new Solution();
		double avg = solution.average(arr);

		System.out.print("Average of employee salary is :"+avg);
		sc.close();
	}
}

/*
OUTPUT:
Enter employee count :6
Enter salary of employee :1000 4000 2000 6000 7500 2500
Average of employee salary is :3625.0
*/






