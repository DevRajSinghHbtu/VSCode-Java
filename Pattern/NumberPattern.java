public class NumberPattern {
    public static void main(String[] args) {
        int n = 5;  // Number of rows
        int leftNum = 1;  // Starting number for the left side
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            int rightNum = leftNum + (i - 1); // Starting number for the right side
            
            // Loop for printing the increasing left side numbers
            for (int j = 0; j < i; j++) {
                System.out.print(leftNum + " ");
                leftNum++;
            }
            
            // Adjust rightNum for the next part (right side)
            rightNum--;
            
            // Loop for printing the decreasing right side numbers
            for (int j = 1; j < i; j++) {
                System.out.print(rightNum + " ");
                rightNum--;
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
