package Prac.Arr;

public class Main {
    public static void main(String[] args) {
        int [][] arr = {
                {2, 1, 7, 10},
                {51, 26, 17, -34},
                {-9, 110, -11, 123},
                {23, 216, 125, 143}
        };
        int [][] result = task1(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

//    {1, 2, 7, 10},
//    {26, 17, 51, -34},
//    {-9, 110, -11, 123},
//    {23, 143, 125, 216}

    public static int [][] task1(int [][] arr){
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr[i].length/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length-1-j];
                arr[i][arr[i].length-1-j] = temp;
            }
        }
        return arr;
    }

    public static int[] task2(int [][] arr){
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j){
                    leftDiagonal+=arr[i][j];
                }
                if (i+j==arr.length-1){
                    rightDiagonal+=arr[i][j];
                }
            }
        }
        return new int[]{leftDiagonal, rightDiagonal};
    }

    
}
