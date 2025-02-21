public class Main {
    public static void main(String[] args) {
//        Main main = new Main();
//        main.run();
//        int x;
//        int y;
//        int sum;
//
//        x=9;
//        y=11;
//
//        sum=x+y;
//        System.out.println("x="+x);
//
//        int numberOfSeconds=0;
//        int hour,min,sec;
//        int saveNumberOfSeconds=numberOfSeconds;
//        numberOfSeconds=3405;
//        saveNumberOfSeconds=numberOfSeconds;
//
//        if ((numberOfSeconds>86400) || (numberOfSeconds<0)){
//            System.out.println("Invalid value");
//            return;
//        }
//
//        hour=numberOfSeconds/3600;
//        numberOfSeconds=numberOfSeconds-hour*3600;
//        min=numberOfSeconds/60;
//        numberOfSeconds=numberOfSeconds-min*60;
//        sec=numberOfSeconds;
//        System.out.println("In "+saveNumberOfSeconds+" seconds: "+hour+" h "+min+" minutes and "+sec+" seconds");

//        int a = 16, b = 18, c = 11, d = 3;
//
//        int count = 0;
//
//        if (a % 2 == 0) {
//            count++;
//        }
//
//        if (b % 2 == 0) {
//            count++;
//        }
//
//        if (c % 2 == 0) {
//            count++;
//        }
//
//        if (d % 2 == 0) {
//            count++;
//        }
//
//        if (count >= 2) {
//            System.out.println("YES. There are more than two even numbers in the sequence.");
//
//        } else {
//            System.out.println("NO. There are no more than two even numbers in the sequence.");
//        }
        int i = 0;
        outer: while (i++ < 3) {
            int j = 0;
            while (j++ < 5) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }

    }
    private void run() {
        int n = 6;
        for (int y = -n; y <= 2 * n; y++) {
            for (int x = -2 * n; x <= 2 * n; x++)
                if ((y <= 0 &&
                        ((int) Math.sqrt((x + n) * (x + n) + y * y) <= n
                                || (int) Math.sqrt((x - n) * (x - n) + y * y) <= n))
                        || (y > 0 && Math.abs(x) <= 2 * n - y))
                    System.out.print("♥ ");
                else
                    System.out.print("♡ ");
            System.out.println();
        }
    }


    public static void task1(){


    }



}