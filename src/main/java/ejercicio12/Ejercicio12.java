package ejercicio12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio12 {
    private String Palabra1 = "";
    private String Palabra2 = "";
    private String resultado = "";
    private InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private BufferedReader leer = new BufferedReader(inputStreamReader);

    public void inicio() {
        System.out.println("Ingresa 2 palabras para compararlos");
        System.out.println("-----------------------------------------------------------------------");
        operacion();
    }

    private void operacion() {
        try {
            System.out.println("Añade la primera palabra : ");
            Palabra1 = leer.readLine();


            System.out.println("Añade la segunda palabra: ");
            Palabra2 = leer.readLine();

            System.out.println(diff(Palabra1,Palabra2));
        } catch (Exception e) {
            System.out.println("Error -->" + e);
        }
    }

   public static Pair<String> diff(String a, String b) {
        return diffHelper(a, b, new HashMap<>());
    }

    private static Pair<String> diffHelper(String a, String b, Map<Long, Pair<String>> lookup) {
        long key = ((long) a.length()) << 32 | b.length();
        if (!lookup.containsKey(key)) {
            Pair<String> value;
            if (a.isEmpty() || b.isEmpty()) {
                value = new Pair<>(a, b);
            } else if (a.charAt(0) == b.charAt(0)) {
                value = diffHelper(a.substring(1), b.substring(1), lookup);
            } else {
                Pair<String> aa = diffHelper(a.substring(1), b, lookup);
                Pair<String> bb = diffHelper(a, b.substring(1), lookup);
                if (aa.first.length() + aa.second.length() < bb.first.length() + bb.second.length()) {
                    value = new Pair<>(a.charAt(0) + aa.first, aa.second);
                } else {
                    value = new Pair<>(bb.first, b.charAt(0) + bb.second);
                }
            }
            lookup.put(key, value);
        }
        return lookup.get(key);
    }

    public static class Pair<T> {
        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public final T first, second;

        public String toString() {
            return "(" + first + "," + second + ")";
        }
    }

}
