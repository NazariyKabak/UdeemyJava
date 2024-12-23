//package Udemy.oop;
//
//import Udemy.oop.Workbook7_8.Airline;
//import Udemy.oop.task1.Movie;
//import Udemy.oop.task1.Store;
//
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//import static Udemy.loops.BlackJack.scanner;
////Інкапсуляція - це ключовий принцип об'єктно-орієнтованого програмування,
//// який передбачає обмеження прямого доступу до деяких компонентів об'єкта,
//// тобто його полів або змінних. Це досягається шляхом оголошення полів закритими,
//// що означає, що до них не можна отримати прямий доступ або змінити.
//// Для взаємодії з цими полями ми використовуємо загальнодоступні методи,
//// відомі як «геттери» (які дозволяють отримати значення поля) та «сеттери» (які дозволяють змінити значення).
//// Це не тільки забезпечує цілісність даних, але й підвищує безпеку,
//// оскільки не дозволяє зовнішньому коду змінювати значення полів у небажаний спосіб.
//
//public class Main {
//    static Scanner scan = new Scanner(System.in);
//    static Store store = new Store();
//
//    }
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.run4();
//        scan.close();
////        String [] parts1={"engine", "wheel", "door"};
////        System.out.println(Arrays.toString(parts1));
////        Car car = new Car("Kia",180_000,2013,"silver",new String[]{"door", "wheel"});
////        System.out.println(car);
////        System.out.println("Original parts in car1: "+Arrays.toString(car.getParts()));
////
////        System.out.println(Arrays.toString(parts1));
////        System.out.println("Parts in car1 after modifying parts1: " + Arrays.toString(car.getParts()));
////
////        Car car2= new Car(car);
////        car2.setParts(new String[]{"battery", "tire"});
////        System.out.println("Parts in car1 after modifying car2 parts: " + Arrays.toString(car.getParts()));
////        System.out.println("Parts in car2: " + Arrays.toString(car2.getParts()));
//
////        Car2 car21 = new Car2("Toyota", 20000, 2020, "red", parts1);
////        System.out.println("Original parts in car1: "+Arrays.toString(car21.getParts()));
////        parts1[0]="new engine";
////        System.out.println("Parts in car1 after modifying parts1: " + Arrays.toString(car21.getParts()));
////        Car2 car22= new Car2(car21);
////        car22.setParts(new String[]{"battery", "tire"});
////        System.out.println("Parts in car1 after modifying car2 parts: " + Arrays.toString(car21.getParts()));
////        System.out.println("Parts in car2: " + Arrays.toString(car22.getParts()));
//
//
////        car.drive();
////        car2.drive();
////        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
////        person.setPassport(new String[]{person.getName(), person.getNationality(), person.getDateOfBirth()});
////        if (person.applyPassport()){
////            System.out.println("Congratulations "+ person.getName()+". Your passport was approved!" + Arrays.toString(person.getPassport()));
////        }else {
////            System.out.println("We are sorry " + person.getName() + ". We cannot process your application."+Arrays.toString(person.getPassport()));
////        }
////        Dessert cake = new Dessert(4.99);
////
////        cake.setIngredients(new String[]{"Eggs", "Flower", "Baking Powder"});
////        Dessert pie = new Dessert(cake);
////        System.out.println(Arrays.toString(cake.getIngredients()));
////        System.out.println(Arrays.toString(pie.getIngredients()));
//
//    }
//    private void run() {
//        Scanner scanner = new Scanner(System.in);
//        Car[] cars = new Car[] {
//                new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
//                new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
//                new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
//                new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
//                new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
//        };
//        Dealership dealership = new Dealership(cars);
//        Car carAtIndex0=dealership.getCar(0);
//        System.out.println("Original make: "+carAtIndex0.getMake());
//
//        carAtIndex0.setMake("Toyota");
//        System.out.println("Modified make: "+carAtIndex0.getMake());
//        System.out.println("Dealership car make: " +dealership.getCar(0).getMake());
//        Car newCar= new Car("BMW", 10000, 2018,"silver", new String[] {"tires", "keys"});
//        dealership.setCar(1, newCar);
//        System.out.println(dealership.getCar(1));
//        newCar.setMake("Audi");
////        System.out.println(dealership);
////        int index =scanner.nextInt();
////        dealership.sell(index);
//    }
//
//    private void run2(){
//        Person[] people = new Person[] {
//                new Person("Cleopatra", "Egypt", "69 BC", 1),
//                new Person("Alexander the Great", "Macedon", "356 BC", 2),
//                new Person("Julius Caesar", "Rome", "100 BC", 3),
//                new Person("Hannibal", "Carthage", "247 BC", 4),
//                new Person("Confucius", "China", "551 BC", 5),
//                new Person("Pericles", "Greece", "429 BC", 6),
//                new Person("Spartacus", "Thrace", "111 BC", 7),
//                new Person("Marcus Aurelius", "Rome", "121 AD", 8),
//                new Person("Leonidas", "Greece", "540 BC", 9),
//                new Person("Sun Tzu", "China", "544 BC", 10),
//                new Person("Hammurabi", "Babylon", "1750 BC", 11),
//        };
//        Airline airline = new Airline();
//
//        for (int i = 0; i < people.length; i++) {
//            if (people[i].applyPassport()){
//                people[i].setPassport(new String[]{"Passport ID", "Country", "Expiration Date"});
//                airline.createReservation(people[i]);
//            }else {
//                System.out.println(people[i].getName() + " could not get a passport.");
//            }
//            }
//        System.out.println(airline.getPeople(1));
//        System.out.println(airline.getPeople(4));
//        System.out.println(airline.getPeople(9));
//        }
//
//
//    private void run3(){
//        Movie[] movie = new Movie[]{
//                new Movie("The Shawshank Redemption", "BlueRay", 9.2),
//                new Movie("The Godfather", "BlueRay", 9.1),
//                new Movie("The Godfather: Part II", "DVD", 9.0),
//                new Movie("The Dark Knight", "BlueRay", 9.0),
//                new Movie("Schindler's List", "DVD", 8.9),
//                new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
//                new Movie("Pulp Fiction", "DVD", 8.8),
//                new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
//
//        };
//
//        for (int i = 0; i < movie.length; i++) {
//            store.setMovie(i, movie[i]);
//        }
//        store.getMovie(4);
//
//    }
//
//    public static void userInput(){
//        Scanner scanner = new Scanner(System.in);
//        String status = "continue";
//        while (status.equals("continue")){
//            System.out.println("\nPlease choose an integer between 0 - 9: ");
//            int choice =scanner.nextInt();
//            Movie movie = store.getMovie(choice);
//            System.out.println("Set a new rating for " + movie.getName()+": ");
//            double rating = scanner.nextDouble();
//            movie.setRating(rating);
//            store.setMovie(choice, movie);
//            printStore();
//            System.out.println("To edit another rating, type: 'continue': ");
//            status = scanner.next();
//        }
//    }
//
//    private static void printStore() {
//
//    }
//
//    public void run4(){
//
////        Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01");
////        Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02");
////        Contact contact3 = new Contact("Charlie", "345-678-9012", "1994-03-03");
////        Contact contact4 = new Contact("David", "456-789-0123", "1996-04-04");
////        Contact copyContact1 = new Contact(contact1);
////        for (Contact contact : new Contact[]{contact1, contact2, contact3, contact4,copyContact1}) {
////            System.out.println(contact);
////        }
//        Contact [] initialContacts=contactData();
//        ContactManeger contactManeger = new ContactManeger(initialContacts);
//        dysplayContacts(contactManeger);
//        while (true){
//            System.out.println("Do you want to continue? Type 'continue' to edit a contact or 'exit' to quit:");
//            String input = scan.next();
//            if (input.equalsIgnoreCase("exit")){
//                break;
//            }
//            if (input.equalsIgnoreCase("continue")){
//                System.out.println("Enter the index of the contact you want to edit (0 to "
//                        + (initialContacts.length - 1) + "): ");
//                int index = scan.nextInt();
//                scan.nextLine();
//                Contact updateContact=editedContact(scan);
//                contactManeger.setContact(index, updateContact);
//                dysplayContacts(contactManeger);
//            }
//        }
//    }
//    public static void dysplayContacts(ContactManeger contactManeger){
//        System.out.println("Contact List:");
//        for (int i = 0; i < contactManeger.getContactsLength(); i++) {
//            System.out.println(i+": "+contactManeger.getContact(i));
//
//        }
//    }
//
//    public static Contact editedContact(Scanner scan){
//        System.out.print("Enter the new name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter the new phone number: ");
//        String phoneNumber = scanner.nextLine();
//
//        System.out.print("Enter the new birth date (yyyy-MM-dd): ");
//        String birthDate = scanner.nextLine();
//
//        // Створюємо та повертаємо новий об'єкт Contact
//        return new Contact(name, phoneNumber, birthDate);
//    }
//}
//
