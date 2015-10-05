import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static long changeMaker(int money, int[] coins){
        long[] table = new long[money + 1];
 
    	// Base case (If given value is 0)
    	table[0] = 1;
 
    	// Pick all coins one by one and update the table[] values
    	// after the index greater than or equal to the value of the
    	// picked coin
    	for(int coin : coins)
        	for(int j = coin; j <= money; j++){
        		table[j] += table[j - coin];
        	}
            	
    	return table[money];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int money  = input.nextInt();
        int n_coins = input.nextInt();

        int[] coins = new int[n_coins];
        for(int i = 0; i < n_coins; i++){
            coins[i] = input.nextInt();
        }
        Arrays.sort(coins);
        System.out.print(changeMaker(money, coins));
    }
}
