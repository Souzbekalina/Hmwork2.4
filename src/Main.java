import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<>();
        System.out.println(a);
        ArrayList<String>b =new ArrayList<>();
        System.out.println(b);


        ArrayList<String> c= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            c.add(a.get((i)));
            c.add(b.get((i)));

            System.out.println(c);
            c.sort(Comparator.comparing(String::length));
            System.out.println(c);

        }

            System.out.println("Введите 5 имен");
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> l = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                String names = scanner.nextLine();
                l.add(names);

            }

        }
    }
 