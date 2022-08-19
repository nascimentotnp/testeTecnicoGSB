
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringCount{

    public static boolean isLetter(char ch){
        if((ch >= 'A' && ch <= 'z') || (ch >= 'À' && ch <= 'ú'))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        StringCount stringCount = new StringCount();

        Scanner in = new Scanner(System.in, "UTF-8");

        System.out.println("Digite o que você quiser e só vai aparecer letra a quantidade de cada letra: ");

        String text = in.nextLine();

        Map<String, Integer> map = contar(text.replace(" ", "").toLowerCase());
        Imprimir(map);
    }
   public static Map<String, Integer> contar(String frase){
        Map<String, Integer> map = new TreeMap<>();
        for(char ch : frase.toCharArray()){

            Integer s = map.get(String.valueOf(ch));
            if (isLetter(ch)){
                if (s != null){
                    map.put(String.valueOf(ch), ++s);
                }else{
                    map.put(String.valueOf(ch), 1);
                }
            }else{

            }
        }
        return map;
    }

    public static void Imprimir(Map<String, Integer> items){

        for(Map.Entry<String, Integer> a : items.entrySet()){

            System.out.println(a.getKey() + ": " +  a.getValue());
        }
    }
}
