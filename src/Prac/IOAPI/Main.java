package Prac.IOAPI;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        File file =  new File("example.txt");
//        try {
//            if (file.createNewFile()){
//                System.out.println("Файл створено! " + file.getName());
//            }else {
//                System.out.println("Файл вже існує!");
//            }
//        }catch (IOException e){
//            System.out.println("Помилка при створенні файлу");
//            e.printStackTrace();
//        }

//        System.out.println(file.getName());
//        System.out.println(file.length());
//        System.out.println(file.getAbsolutePath());
//
//        try (FileWriter fileWriter = new FileWriter("example.txt")){
//            fileWriter.write("Дратуті. Це перший запис!");
//            System.out.println("Додали запис у файл ");
//        }catch (IOException e){
//            System.out.println("Error!");
//            e.printStackTrace();
//        }
//
//
//        try (FileReader fileReader = new FileReader("example.txt")){
//            int character;
//            while ((character = fileReader.read()) !=-1){
//                System.out.print((char) character);
//            }
//            System.out.println(fileReader.read();
//        }catch (IOException e){
//            System.out.println("Error read!");
//            e.printStackTrace();
//        }
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("example.txt"))){
//            bufferedWriter.write("Швидкий запис у файл!");
//            bufferedWriter.newLine();
//            bufferedWriter.write("Другий рядок!");
//            System.out.println("Complete write!");
//        }catch (IOException e){
//            System.out.println("Error write!");
//            e.printStackTrace();
//        }
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("example.txt"))){
//            String line;
//            while ((line = bufferedReader.readLine()) !=null){
//                System.out.println(line);
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        try (FileOutputStream fos = new FileOutputStream("binary.dat")){
//            byte[] data = {65,66,67};
//            fos.write(data);
//            System.out.println("Complete file!");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try (FileInputStream fis = new FileInputStream("binary.dat")){
//            int byteData;
//            while ((byteData = fis.read())!=-1){
//                System.out.println((char) byteData);
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))){
//            Person person = new Person("Alice", 25);
//            oos.writeObject(person);
//            System.out.println("Complete write object");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))){
//            System.out.println(ois.readObject());
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//        }


//        creatTextInFile();
//        writeTextInFile("example2.txt");
//        readTextInFile("example2.txt");

        Person person = new Person("Oleg", 32);
        writeObjectInFile(person, "person.dat");
        readObjectInFile("person.dat");
    }

    public static void creatTextInFile(){
        File file = new File("example2.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Create file! "+ file.getName());
            }else {
                System.out.println("Файл вже існує!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeTextInFile(String path){
        try (FileWriter fw = new FileWriter(path)){
            fw.write("Gaben pidor!");
            System.out.println("Yes");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readTextInFile(String path){
        try (FileReader fileReader = new FileReader(path)){
            int characters;
            while ((characters = fileReader.read())!=-1){
                System.out.println((char)characters);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeObjectInFile(Person person, String path){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(person);
            System.out.println("Yes");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Person readObjectInFile(String path){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            return (Person) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
            return null;
        }
    }
}
