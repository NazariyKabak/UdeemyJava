package Boook;

public class Main {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x<4){//3<5
            e1.hello();//helloooo...//helloooo...//helloooo...//helloooo...
            e1.count = e1.count+1;//1//2//3//4
            if (x==3){//3==3
                e2.count = e2.count+1;//0+1=1
            }
            if (x>0){//3<4
                e2.count = e2.count+ e1.count;//0+1=1//1+2=3//3+3=6//6+4=10
            }
            x++;//1//2//3//4
        }
        System.out.println(e2.count);//3//6//10
    }
    // Output:
    // helloooo...
    // helloooo...
    // helloooo...

}
