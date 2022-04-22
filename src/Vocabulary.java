import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Vocabulary {
    public static void main(String[] args) {
        String strangerWords = "абанамат фортунат бананан колистрат  панана  вокандумасунарот вокал";
        Function<String,String[]> fun = a -> { String[] words = a.split(" ");
            return words; };
        Arrays.stream(fun.apply(strangerWords)).sorted().forEach(System.out::println);
    }
    }
