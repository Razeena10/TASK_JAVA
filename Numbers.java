//Write a program that prints numbers from 1 to 100, but for multiples of 3 print "Fizz" and for multiples of 5 print "Buzz". 

class Numbers{
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
            System.out.println(i);
            }
        }
    }
}