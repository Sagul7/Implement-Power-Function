import java.util.Scanner;

public class ImplementPowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(pow(A,B,C));
    }
    public static int pow(int a,int b,int c)
    {
        if(b==0)
        {
            return 1;
        }
        if(b==1)
        {
            return a;
        }
        int p = pow(a,b/2,c) % c;
        if(b%2==0)
        {
            return (p * p)%c;
        }
        return  (p * p * a)%c;
    }
}
/*
 Implement Power Function
Implement pow(A, B) % C. In other words, given A, B and C, Find (AB % C).
Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.

Input 1:
A = 2
B = 3
C = 3
Input 2:
A = 3
B = 3
C = 1

Output 1:
2
Output 2:
0
 */