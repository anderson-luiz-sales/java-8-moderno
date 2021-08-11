import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Pedro");
        palavras.add("Gabriel");
        palavras.add("Anderson");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparingInt(String::length));
        palavras.sort(Comparator.comparing(String::length));

        palavras.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("palavras = " + palavras);

        palavras.forEach(p -> System.out.println("palavras = " + p));
        palavras.forEach(System.out::println);

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }

        }).start();

        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
}

