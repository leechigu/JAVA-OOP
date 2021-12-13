import java.util.ArrayList;

public class PrimeObservableThread implements Runnable {
    private static final int SLEEPTIME = 500;

    private int primeNumber;
    private int numCount;
    private boolean first = true;
    private boolean stopRunning = false;

    public PrimeObservableThread() {
    }

    public int getPrimeNumber() {
        return primeNumber;
    }

    public void stopRunning() {
        stopRunning = true;
    }

    public void startRunning() {
        stopRunning = false;
        run();
    }

    private void generatePrimeNumber() {
        while (stopRunning == false) {
            if (first) {
                first = false;
                primeNumber = 2;  
                System.out.println(primeNumber);
                numCount = 1; 
            } else {
                numCount += 2; ‚¬
                if (isPrimeNumber(numCount)) {
                    primeNumber = numCount;
                    System.out.println(primeNumber);
                }
            }
            try {
                Thread.sleep(SLEEPTIME); 
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        generatePrimeNumber();
    }
}
