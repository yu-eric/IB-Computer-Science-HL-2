package chapter12;

public class FastFib {

    public long fibonacci(int n, long[] fibList) {
        long fibNum = 0;
        if(fibList[n - 1] == 0) {
            if(n < 3) {
                fibNum = 1;
                return 1;
            } else {
                fibList[n - 1] = fibonacci(n - 1, fibList) + fibonacci(n - 2, fibList);
                fibNum = fibList[n - 1];

                for(long f : fibList) {
                    if(fibNum == f) {
                        return f;
                    }
                }
            }
        }
        return fibList[n - 1];
    }
}
