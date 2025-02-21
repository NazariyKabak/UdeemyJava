package CodeWars.lvl8.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
    public static void main(String[] args) {
        Algorithms algorithms = new Algorithms();
        algorithms.run();

    }
    private void run() {
        String str1 = "Hello World";
        System.out.println(reverseWords(str1));
    }
    public int Liters(double time)  {

        return (int) Math.floor(time * 0.5);
    }
    public static int[] between(int a, int b) {
        List<Integer> result = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            result.add(i);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int getAverage(int[] marks){
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (int) (sum / marks.length);
    }

    /**Ти ведеш свого сина в ліс до мавп.
     *  Ви знаєте, що там є певне число (n), але ваш син занадто малий, щоб просто оцінити повне число,
     *  він повинен почати рахувати їх з 1.
     Як хороший батько, ти будеш сидіти і рахувати з ним. Маючи число (n),
     заповнити масив усіма числами до цього числа включно, але за винятком нуля.**/
    public static int[] monkeyCount(final int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i+1;
        }
        return result;
    }
    /**Завершіть рішення так, щоб воно перевернуло всі слова в переданому рядку.
     Слова розділені рівно одним пробілом, без пробілів на початку або в кінці.
     Приклад (введення --> вихід):
     "Найбільша перемога - це та, яка не вимагає битви" --> "битва не вимагає, яка найбільша перемога"**/
    public static String reverseWords(String str){
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    /**Ви в зоопарку... всі сурикати виглядають дивно. Щось пішло не так - хтось пішов і помінявся головою!
     Врятуйте тварин, повернувши їх назад.
     Вам буде надано масив, який матиме три значення (хвіст, тіло, голова).
     Ваше завдання — переставити масив таким чином, щоб тварина розташувалася правильно (голова, тіло, хвіст).
     Те ж саме стосується всіх інших масивів/списків, які ви отримаєте в тестах:
     ви повинні змінити позиції елементів за тією самою точною логікою**/
    public static String[] fixTheMeerkat(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[2] = temp;
        return arr;
    }

    /**Огляд завдання
     Дано невід’ємне ціле число b, напишіть функцію, яка повертає ціле число d,
     щоб двійкове представлення b було таким самим, як десяткове представлення d.
     приклади:
     n = 1 має повернути 1
     n = 5 має повернути 101
     n = 11 має повернути 1011**/
    public static int toBinary(int n) {
        String binaryStr = Integer.toBinaryString(n);
        return Integer.parseInt(binaryStr);
    }

    /**Виконайте функцію, яка приймає два аргументи та повертає всі числа, які діляться на заданий дільник.
     *  Перший аргумент — це масив чисел, а другий — дільник.
     Приклад (Вхід 1, Вхід 2 --> Вихід)
     [1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]**/
    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % divider == 0) {
                result.add(number);
            }
        }
        int [] resultArray = new int [result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
    private static final double G =6.67e-11;
    public static double solution(double[] arrVal, String[] arrUnit) {
        double mass1 = convertMassToKg(arrVal[0],arrUnit[0]);
        double mass2 = convertMassToKg(arrVal[1],arrUnit[1]);
        double distance = convertDistanceToMeters(arrVal[2],arrUnit[2]);

        return G*(mass1*mass2)/(distance*distance);

    }

    public static double convertMassToKg(double mass, String unit) {
        switch (unit) {
            case "kg":return mass;
            case "g": return mass/1000.0;
            case "mg":return mass/1_000_000.0;
            case "ug": return mass/1_000_000_000.0;
            case "lb": return mass*0.453592;
            default: throw new IllegalArgumentException("Unknown unit: " + unit);
        }
    }

    public static double convertDistanceToMeters(double distance, String unit){
        switch (unit){
            case "m": return distance;
            case "cm": return distance / 100.0;
            case "mm": return distance / 1000.0;
            case "μm": return distance / 1_000_000.0;
            case "ft": return distance * 0.3048;
            default: throw new IllegalArgumentException("Unknown unit: " + unit);
        }
    }

    /**Дано три цілі числа a, b і c, повернути найбільше число, отримане після вставлення операторів +,
     *  * і круглих дужок ().
     *  Іншими словами, спробуйте кожну комбінацію a, b і c з операторами,
     *  не змінюючи порядок операндів, і поверніть максимальне значення.

     приклад
     З числами 1, 2 і 3 ось кілька можливих виразів:

     1 * (2 + 3) = 5
     1 * 2 * 3 = 6
     1 + 2 * 3 = 7
     (1 + 2) * 3 = 9
     Максимальне значення, яке можна отримати – 9.

     Примітки
     Числа завжди додатні, в діапазоні 1 ≤ a, b, c ≤ 10.
     Ви можете використовувати ту саму операцію кілька разів.
     Не обов'язково використовувати всі оператори або круглі дужки.
     Ви не можете поміняти операнди місцями. Наприклад, із заданими числами не можна отримати вираз (1 + 3) * 2 = 8.
     Приклади введення та виведення
     expressionsMatter(1, 2, 3) ==> 9, оскільки (1 + 2) * 3 = 9.
     expressionsMatter(1, 1, 1) ==> 3, оскільки 1 + 1 + 1 = 3.
     expressionsMatter(9, 1, 1) ==> 18, тому що 9 * (1 + 1) = 18.**/
    public static int expressionsMatter(int a, int b, int c)
    {
        int result1 = a*(b+c);
        int result2 = a*b*c;
        int result3 = a+b*c;
        int result4 = (a+b)*c;
        int result5 = a+b+c;
        return Math.max(result1, Math.max(result2, Math.max(result3, Math.max(result4, result5))));
    }

    /**Дано 2 рядки, a і b, повернути рядок у формі короткий+довгий+короткий,
     * з коротшим рядком назовні та довшим усередині. Рядки не будуть однакової довжини,
     * але вони можуть бути порожніми (нульова довжина).
     Підказка для користувачів R:
     Довжина рядка не завжди збігається з кількістю символів
     Наприклад: (Вхід1, Вхід2) --> вихід
     ("1", "22") --> "1221"
     ("22", "1") --> "1221"
     ShortLongShort.solution("1", "22"); // повертає "1221"
     ShortLongShort.solution("22", "1"); // повертає "1221"**/
    public static String solution(String a, String b) {
       if (a.length() >b.length()) {
           return b+a+b;
       }else {
           return a+b+a;
       }

    }

    /**«Точкове відображення» або «точкова симетрія» — це базове поняття в геометрії,
     * де дана точка P у заданому положенні відносно середньої точки Q має відповідну точку P1,
     * яка знаходиться на тій самій відстані від Q, але в протилежний напрямок.
     завдання
     Дано дві точки P і Q, виведіть симетричну точку точки P відносно Q.
     Кожен аргумент є двоелементним масивом цілих чисел, що представляють координати X і Y точки.
     Вихідні дані мають бути в тому самому форматі, вказуючи координати X і Y точки P1.
     Вам не потрібно перевіряти введені дані.

     На цю ката натхненно змагання Hackerrank Find Point**/
    public static int[] reflectPoint(int[] p, int[] q) {
        int x1=2*q[0]-p[0];
        int x2=2*q[1]-p[1];

        return new int[]{x1,x2};
    }

    /**Іноді мені хочеться швидко перетворити милі на імперський галон (mpg) у кілометри на літр (kpl).
     Створіть програму, яка відображатиме кількість кілометрів на літр (вихід) на основі кількості миль на імперський галон (вхід).
     Не забудьте округлити результат до двох знаків після коми.
     Деякі корисні асоціації, що стосуються цієї ката:
     1 імперський галон = 4,54609188 літрів
     1 миля = 1,609344 кілометрів**/
    public static float mpgToKPM(final float mpg) {
        double milesToKilometers = 1.609344;
        double gallonToLiters = 4.54609188;
        double kpl = (mpg * milesToKilometers) / gallonToLiters;
        return (float) (Math.round(kpl * 100.0) / 100.0);
    }

    /**напишіть мені функцію stringy, яка приймає розмір і повертає рядок із чергуванням 1 і 0.
     рядок має починатися з 1.
     рядок із розміром 6 має повернути: "101010".
     із розміром 4 має повернути: "1010".
     із розміром 12 має повернути: "101010101010".
     Розмір завжди буде додатним і використовуватиме лише цілі числа.**/
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i%2==0){
                sb.append("1");
            }else {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    /**Напишіть метод, який отримуватиме масив цілих чисел як параметр і оброблятиме кожне число з цього масиву.
     Поверніть новий масив, обробивши кожне число вхідного масиву так:
     Якщо число має цілий квадратний корінь, візьміть його, інакше підведіть число.
     приклад
     [4,3,9,7,2,1] -> [2,9,3,49,4,1]
     Примітки
     Вхідний масив завжди міститиме лише додатні числа і ніколи не буде порожнім або нульовим.**/
    public static int[] squareOrSquareRoot(int[] array) {
        int [] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int num=array[i];
            double sqrt = Math.sqrt(num);
            if (sqrt == (int)sqrt) {
                result[i] = (int)sqrt;
            }else {
                result[i] = num*num;
            }
        }
        return result;
    }

    /**
     798 / 5 000
     Гіпотеза Коллатца (також відома як гіпотеза 3n+1) — це гіпотеза про те, що,
     застосовуючи наступний алгоритм до будь-якого числа, ми завжди досягнемо одиниці:
     [Це написано в псевдокоді]
     якщо (число парне) число = число / 2
     якщо (число непарне) число = 3*число + 1
     #Завдання

     Ваше завдання полягає в тому, щоб створити функцію hotpo, яка приймає позитивне n як вхідні дані та повертає кількість разів,
     які вам потрібно виконати цей алгоритм, щоб отримати n = 1.**/
    public static int hotpo(int n) {
        int steps =0;
        while (n!=1){
            if (n%2==0){
                n/=2;
            }else {
                n=3*n+1;
            }
            steps++;
        }
        return steps;
    }

    /**Повертає N-е парне число
     Приклад (введення --> вихід)
     1 --> 0 (перше парне число 0)
     3 --> 4 (третє парне число 4 (0, 2, 4))
     100 --> 198
     1298734 --> 2597466**/
    public static int nthEven(int n) {
        return 2*(n-1);
    }

    /**У вас є багато даних, якими потрібно керувати, і, звичайно,
     *  ви використовуєте невід’ємні ідентифікатори від нуля, щоб зробити кожен елемент даних унікальним!

     Тому вам потрібен метод, який повертає найменший невикористаний ідентифікатор для вашого наступного нового елемента даних...

     Примітка. Наведений масив використаних ідентифікаторів може бути несортованим.
     Для перевірки можуть існувати дублікати ідентифікаторів, але вам не потрібно їх знаходити чи видаляти!**/

    public static int nextId(int[] ids) {
        Arrays.sort(ids);
        int smallest = 0;
        for (int id : ids) {
            if (id==smallest){
                smallest++;
            }
        }
        return smallest;
    }


}
