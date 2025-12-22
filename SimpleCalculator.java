//Create a simple calculator that takes two numbers and an operator as input(hardcode the value), then performs the operation using if-else statements.
public class SimpleCalculator {
    public static void main(String[] args) {
        int num1 = 42;
        int num2 = 24;
        char op = '/';
        int sol = 0;
        if(op == '+'){
            sol = num1 + num2;
        }
        else if(op == '-'){
            sol = num1 - num2;
        }
        else if(op == '*'){
            sol = num1 * num2;
        }
        else if(op == '/'){
            if(num2 == 0){
                System.out.println("Error");
                sol = 0;
            }
            else{
                sol = num1 / num2;
            }
        }
        else{
            System.out.println("Invalid Operator");
        }
        System.out.println("Solution : "+sol);
    }
}
