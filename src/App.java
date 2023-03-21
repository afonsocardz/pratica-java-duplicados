import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        String[] arr1 = { "Morango", "Abacaxi", "Acerola" };
        String[] arr2 = { "Morango", "Abacaxi", "Banana" };

        HashMap<String, Boolean> hashtable = new HashMap<>();

        for(int i = 0; i < arr1.length; i++){
            if(!hashtable.containsKey(arr1[i])){
                hashtable.put(arr1[i], false);
            }
        }

        for(int i = 0; i < arr2.length; i++){
            if(hashtable.containsKey(arr2[i]) && Boolean.TRUE.equals(!hashtable.get(arr2[i]))){
                hashtable.replace(arr2[i], true);
                System.out.println(arr2[i]);
            }
        }
    }
}
