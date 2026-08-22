# Digit Sum + Product Divisibility Check 🏹

Intuition

We need to check whether the original number n is divisible by the sum of its digits plus the product of its digits.

To get each digit, we use:

n % 10 → gives the last digit
n / 10 → removes the last digit

I store the original number in org because n becomes 0 after the loop.

Approach
Initialize sum = 0 and product = 1.
Extract each digit using n % 10.
Add the digit to sum.
Multiply the digit with product.
Remove the last digit using n / 10.
Calculate sum + product.
Check whether the original number org is divisible by this value.
Complexity
Time complexity: O(d), where d is the number of digits in n.
Space complexity: O(1)
Code
class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0;
        int product = 1;
        int org = n;

        while (n != 0) {
            int dig = n % 10;

            sum = sum + dig;
            product = product * dig;

            n = n / 10;
        }

        int res = sum + product;

        if (org % res == 0) {
            return true;
        }

        return false;
    }
}