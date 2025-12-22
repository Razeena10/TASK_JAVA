import java.util.*;

class Calculator{
    static int addition(int num1,int num2){
        return num1+num2;
    }
    static int subtraction(int num1,int num2){
        return num1-num2;
    }
    static int multiplication(int num1,int num2){
        return num1*num2;
    }
    static int division(int num1,int num2){
        if(num2==0){
            System.out.println("Error");
            return 0;
        }
        return num1/num2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int num2 = sc.nextInt();
        int solution = 0;
        switch(op){
            case '+' :
                solution = addition(num1,num2);
                break;
            case '-' :
                solution = subtraction(num1,num2);
                break;
            case '*' :
                solution = multiplication(num1,num2);
                break;
            case '/' :
                solution = division(num1,num2);
                break;
            default :
                System.out.println("Invalid Operator");
                return;
        }
        System.out.println("Solution = " + solution);
    }
}