import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prueba3 {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Juana");
        nombres.add("Maria");
        nombres.stream().forEach(x -> System.out.println(x));

        int[] numeros = {0,1,2,3,4,5,6,7,8,9,10};
        IntStream numStr = Arrays.stream(numeros);
        int resultado = numStr.filter(x -> x>4).reduce(0,(x,y) -> x+y);
        System.out.println(resultado);

    }
}
