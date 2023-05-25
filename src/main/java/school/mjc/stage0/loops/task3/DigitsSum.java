package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String str = "" + t;
        int sum = 0;
        for(int i=0;i<str.length();i++){
            int digit = str.charAt(i) - '0';
            sum += digit;
        }
        System.out.println(sum);
    }
}
