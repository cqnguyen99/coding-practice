import java.util.Scanner;
class Fibonacci
{
    //Find the  n'th term of the Fibonacci sequence
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.println("n'th term of the Fibonacci sequence: ");
        n = input.nextInt();
        System.out.println(fib(n));
        input.close();
    }

    public static long fib(int n)
    {
        long oneBack=1, twoBack=0, cur=0;
        if (n<2) return n;
        else
            for (int i=2; i<=n; ++i)
            {
                cur = oneBack+twoBack;
                twoBack=oneBack;
                oneBack=cur;
            }
        return cur;
    }
}