import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void displayPathtoPrincess(int n, String [] grid){
        int center = n/2;
        char upper_left  = grid[0].charAt(0);
        char upper_right = grid[0].charAt(n-1);
        char lower_left  = grid[n-1].charAt(0);
        char lower_right = grid[n-1].charAt(n-1);
        for(int i = center; i > 0 & upper_left == 'p'; i--){
            System.out.println("UP\nLEFT");
        }
        for(int i = center; i > 0 & upper_right == 'p'; i--){
            System.out.println("UP\nRIGHT");
        }
        for(int i = center; i > 0 & lower_left == 'p'; i--){
            System.out.println("DOWN\nLEFT");
        }
        for(int i = center; i > 0 & lower_right == 'p'; i--){
            System.out.println("DOWN\nRIGHT");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
    }
}
