package chapter12;

public class FastFib {

    public long fastFibonacci(int n, long[] fibList) {
        long fibNum = 0;
        if(fibList[n - 1] == 0) {
            if(n < 3) {
                return 1;
            } else {
                fibList[n - 1] = fastFibonacci(n - 1, fibList) + fastFibonacci(n - 2, fibList);
                fibNum = fibList[n - 1];

//                for(long f : fibList) {
//                    if(fibNum == f) {
//                        return f;
//                    }
//                }
            }
        }
        return fibList[n - 1];
    }

    public long slowFibonacci(int n) {
        if(n < 2) {
            return n;
        } else {
            return slowFibonacci(n - 1) + slowFibonacci(n - 2);
        }
    }
}
