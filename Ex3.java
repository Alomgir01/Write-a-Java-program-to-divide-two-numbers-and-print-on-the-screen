import java.util.Scanner;
public class Ex3
{
    public static void main(String[]args)
    {
        System.out.print("Enter two  number: ");
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int divide= a/b;
        System.out.print(+divide);
    }
}
