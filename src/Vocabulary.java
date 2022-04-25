import java.util.Arrays;
import java.util.function.Function;

public class Vocabulary {
    public static void main(String[] args) {
        String strangerWords = "абанамат фортунат бананан колистрат  панана  вокандумасунарот вокал";
        Function<String, String[]> fun = a -> a.split(" ");
        Arrays.stream(fun.apply(strangerWords)).sorted().forEach(System.out::println);
    }
}
