package CodeWars.lvl8.ASCIIART;

public class Main {
    public static void main(String[] args) {
        System.out.println(draw(3));

    }

    public static String draw(int n){
        StringBuilder str = new StringBuilder();
        for (int i = 0;i<n;i++){
            str.append(" ".repeat(i)).append("I");
            if (i<n-1) str.append("\n");
        }

        return str.toString();
    }
}
