
import java.util.Scanner;

class CalculatorInterface{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation cal = new Calculator();
        int num1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int num2 = sc.nextInt();
        switch (op) {
            case '+':
                System.out.println( cal.addition(num1,num2));
                break;
            case '-':
                System.out.println( cal.subtraction(num1, num2));
                break;
            case '*':
                System.out.println( cal.multiplication(num1, num2));
                break;
            case '/':
                System.out.println( cal.division(num1, num2));
                break;
            default:
                System.out.println("Invalid Operator");;
        }
    }
}
interface Calculation{
    int addition(int num1, int num2);
    int subtraction(int num1,int num2);
    int multiplication(int num1, int num2);
    int division(int num1, int num2);
}
class Calculator implements Calculation{
    public int addition(int num1, int num2){
        return num1+num2;
    }
    public int subtraction(int num1, int num2){
        return num1-num2;
    }
    public int multiplication(int num1, int num2){
        return num1*num2;
    }
    public int division(int num1, int num2){
        if(num2==0){
            System.out.println("Error");
            return 0;
        }
        return num1/num2;
    }
}