/*

Example
Input : Number = 18
Output : Yes, It's an Abundant Number
Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
Now the sum of the factors except the number itself is :
1 + 2 + 3 + 6 + 9 = 21
as the number 21>18 , the number itself.
It's an abundant number.

*/


import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int n = sc.nextInt();
	int sum = 0;

	for(int i = 1 ; i < n ; i++){
		if(i % n == 0){
			sum += i;
			}
		}
	if(n > sum){
		System.out.print("Yes, It's an Abundant Number");
		}
	else{
		System.out.print("No, It's Not Abundant Number");
		}
	}
}

/*

OUTPUT :

Enter a number : 18
Yes, It's an Abundant Number

*/