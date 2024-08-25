import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {

    // Método que retorna quantas ocorrências de um elemento estão na lista
    public int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;
        for (Integer i : l) {
            if (i.equals(el)) {
                count++;
            }
        }
        return count;
    }

}
