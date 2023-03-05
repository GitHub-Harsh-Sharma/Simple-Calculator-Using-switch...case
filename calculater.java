import java.util.Scanner;
class Calculator
{
    public static void main(String args[])
    {
        int num1,num2;
        char choice;
        Scanner sr=new Scanner(System.in);
        System.out.println("Press + for sum");
        System.out.println("Press - for sub");
        System.out.println("Press * for multi");
        System.out.println("Press / for divide");
        System.out.println("Enter your choice");
        choice=sr.next().charAt(0);
        switch(choice)
        {
        case '+':
            System.out.print("Enter num:");
            num1=sr.nextInt();
            System.out.print("Enter num:");
            num2=sr.nextInt();
            int add=num1+num2;
            System.out.println(num1+"+"+num2+"="+add);
            break;
        case '-':
            System.out.print("Enter num:");
            num1=sr.nextInt();
            System.out.print("Enter num:");
            num2=sr.nextInt();
            int sub=num1-num2;
            System.out.println(num1+"-"+num2+"="+sub);
            break;
        case '*':
            System.out.print("Enter num:");
            num1=sr.nextInt();
            System.out.print("Enter num:");
            num2=sr.nextInt();
            int multi=num1*num2;
            System.out.println(num1+"*"+num2+"="+multi);
            break;
        case '/':
            System.out.print("Enter num:");
            num1=sr.nextInt();
            System.out.print("Enter num:");
            num2=sr.nextInt();
            int divide=num1/num2;
            System.out.println(num1+"/"+num2+"="+divide);
            break;
        default:
            System.out.print("ERROR");
            break;
        }
    }    
}