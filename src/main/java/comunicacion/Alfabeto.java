package comunicacion;

import java.util.List;
import java.util.Arrays;

public class Alfabeto extends Pictograma {
    private List<String> letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = Arrays.asList(letras);
        this.interpretacion = interpretacion;
    }

    public List<String> getLetras() {
        return letras;
    }

    public int cantidadLetras() {
        return letras.size();
    }

    @Override
    public String toString() {
        return String.join(", ", letras);
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }
}
