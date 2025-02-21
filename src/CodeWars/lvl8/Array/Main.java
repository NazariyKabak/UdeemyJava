package CodeWars.lvl8.Array;

public class Main {
    public static void main(String[] args) {
        String[] queue1 = {"sheep", "sheep", "sheep", "wolf", "sheep"};
        String[] queue2 = {"sheep", "sheep", "wolf"};

        System.out.println(warnTheSheep(queue1));
        System.out.println(warnTheSheep(queue2));
    }

    public static String warnTheSheep(String[] array){
        int wolfIndex = -1;
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i].equals("wolf")) {
                wolfIndex = i;
                break;
            }
        }
        if (wolfIndex == array.length-1) {
            return "Pls go away and stop eating my sheep";
        }else {
            int sheepNumber = array.length - wolfIndex - 1;
            return "Oi! Sheep number " + sheepNumber + "! You are about to be eaten by a wolf!";
        }
    }
}
