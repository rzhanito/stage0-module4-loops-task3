package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstNumber = 0, secondNumber = 1;
        System.out.println(firstNumber);
        for(int i = 1; i < lastFibonacci; i++){
            System.out.println(secondNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
