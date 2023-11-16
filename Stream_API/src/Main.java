import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Номер 1");
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long count = num.stream().filter(number -> number % 2 == 0).count();
        System.out.println("Количество парных чисел = " + count);

        System.out.println("Номер 2");
        List<String> surnames = List.of("John", "Brown", "Currie", "Jackson", "James");
        surnames.stream().filter(Objects::nonNull).filter(surname -> surname.startsWith("J")).forEach(surname -> System.out.print(surname + " "));

        System.out.println("\nНомер 3");
        String[] strings = {"Name","God","Apple","Zoo","Pizza"};
        Arrays.stream(strings).sorted().toList().forEach(string -> System.out.print(string + " "));

        System.out.println("\nБлок 2 Номер 1");
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(getEvenNumbersPro(list));

        System.out.println("Задача 2");
        List<String> names = List.of("Egor", "Max", "Ivan", "Petr", "Patric", "");
        names = names.stream().filter(name -> name != null && !name.trim().isEmpty()).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Имена приведенные к верхнему регистру: " + names);
        long countNames = names.stream().filter(name -> name != null && !name.trim().isEmpty()).filter(name -> name.startsWith("P")).count();
        System.out.println("Имен с буквы P: " + countNames);
    }
    private static List<Integer> getEvenNumbersPro(List<Integer> num){
        return num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

}