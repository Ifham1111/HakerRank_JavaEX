// We use the integers a, b, and ŉ to create the following series:

// (a +2° - b), (a + 2º · b + 2¹ · b), ..., (a + 2º · b + 2¹ · b + ... + 2″−1 . b)

// You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

// Input Format

// The first line contains an integer, q, denoting the number of queries. Each line i of the q subsequent lines contains three space-separated integers describing the respective a¡, b₁, and n values for that query.

// Constraints

// • 0q500

// 0 0a,b< 50

// • 1<n< 15

// Output Format

// For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

import java.util.Scanner;

public class JavaLoop2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for(int i=0; i<q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a;
        
            for(int j=0; j<n; j++) {
                s += Math.pow(2, j) * b;
                System.out.print(s + " ");
            }
        
            System.out.println();
        
        }

        //why is using in.closa coommand in java?
        in.close();    
 
    }
}