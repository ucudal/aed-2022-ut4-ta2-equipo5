
/**
 *
 * @author ernesto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TArbolBB arbol;

        String[] lectura = ManejadorArchivosGenerico.leerArchivo("src/consultaPrueba.txt");

        for (String linea : lectura) {
            arbol.buscar(Integer.parseInt(linea));
        }

    }

}
