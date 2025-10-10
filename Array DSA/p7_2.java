import java.util.*;

class Solution {
    public double average(int[] salary) {
        // Find the minimum and maximum salaries
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        
        int sum = 0;  // Variable to store sum of all salaries
        
        // Loop through the salary array to find min, max, and sum
        for (int s : salary) {
            sum += s;
            if (s < minSalary) {
                minSalary = s;
            }
            if (s > maxSalary) {
                maxSalary = s;
            }
        }
        
        // Exclude the minimum and maximum salary and calculate the average
        sum = sum - minSalary - maxSalary;
        
        // The number of remaining salaries after removing min and max
        int remainingCount = salary.length - 2;
        
        // Return the average, cast to double to ensure precision
        return (double) sum / remainingCount;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask for the size of the array
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        // Create an array of size n
        int[] salary = new int[n];
        
        // Ask for the salaries of each employee
        System.out.print("Enter the salaries: ");
        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }
        
        // Create a Solution object and calculate the average
        Solution solution = new Solution();
        double avg = solution.average(salary);
        
        // Print the result with 5 decimal places
        System.out.printf("Average salary excluding min and max: %.5f\n", avg);
        
        // Close the scanner
        sc.close();
    }
}
