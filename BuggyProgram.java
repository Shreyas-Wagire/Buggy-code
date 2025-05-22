public class BuggyProgram {
    public static void main(String[] args) { 
        // FIXED: Corrected method signature from 'String args' to 'String[] args'

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("The sum is: " + calculateSum(numbers));
    }

    static int calculateSum(int[] nums) { 
        // FIXED: Changed parameter from 'int nums' to 'int[] nums'

        int sum = 0;
        for (int i = 0; i < nums.length; i++) { 
            // FIXED: Changed loop condition from 'i <= nums.length' to 'i < nums.length'

            sum += nums[i];
        }
        return sum;
    }
}
