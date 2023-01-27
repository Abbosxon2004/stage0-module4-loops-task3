package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f1 = 0;
        int f2 = 1;
        if (lastFibonacci == 1) {
            System.out.println(f1);
            return;
        }
        System.out.println(f1);
        System.out.println(f2);
        lastFibonacci-=2;
        while (lastFibonacci>0){
            int temp=f1;
            f1=f2;
            f2=f1+temp;
            System.out.println(f2);
            lastFibonacci--;
        }

    }
}
