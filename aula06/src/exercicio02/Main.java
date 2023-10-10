package exercicio02;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        Map<String, String> meu_Map = new HashMap<String, String>();

        meu_Map.put("Bruno", new String("24"));
        meu_Map.put("r", new String("escola"));
        meu_Map.put("y", new String("de"));
        meu_Map.put("b", new String("programação"));
        meu_Map.put("e", new String("e tecnologia"));

        for (Map.Entry<String, String> be : meu_Map.entrySet()) {
            System.out.print(be.getKey() + ":");
            System.out.println(be.getValue());
        }
    }
}