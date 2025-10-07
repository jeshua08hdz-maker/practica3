
import java.util.ArrayList;

public class MemoriaDinamica {
    ArrayList<Integer> memoria = new ArrayList<>();
    int contador;

    public MemoriaDinamica() {
        contador = 0;
    }


    public void agregar(int valor) {
        memoria.add(valor);
        contador++;
    }

    public boolean eliminar(){
        if (contador > 0){
            memoria.remove(--cotador);
            return true;
        }
        return false;
    }

    public void mostrar(){
        System.out.println("[");
        for (int = i = 0; i < contador; i++){
            System.out.println(memoria.get(i) + " ");
    }
    System.out.println("]");
    }
}