package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int sumOfNines = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += 9 * Math.pow(10, i);
            sumOfNines += sum;
        }
        System.out.println(sumOfNines);
    }
}
