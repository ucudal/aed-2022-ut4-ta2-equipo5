import java.util.ArrayList;

/**
 *
 * @author ernesto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TArbolBB<Integer> arbol = new TArbolBB<>();

        ArrayList<String> resInsercion = new ArrayList<>();
        for(String aInsertar : ManejadorArchivosGenerico.leerArchivo("UT4-TA2/src/clavesPrueba.txt")){
            int i = Integer.parseInt(aInsertar);
            arbol.insertar(new TElementoAB<>(i, i));
            resInsercion.add(i + ", contador: "+TArbolBB.contador);
        }
        ManejadorArchivosGenerico.escribirArchivo("UT4-TA2/src/resultadosInsercion.txt", resInsercion.toArray(new String[0]));

        System.out.println("Pre orden: "+arbol.preOrden());

        ArrayList<String> resBusqueda = new ArrayList<>();
        for (String linea : ManejadorArchivosGenerico.leerArchivo("UT4-TA2/src/consultaPrueba.txt")) {
            TElementoAB<Integer> nodo = arbol.buscar(Integer.parseInt(linea));
            resBusqueda.add(linea + ", contador: "+TArbolBB.contador * (nodo == null ? 1 : -1));
        }

        ManejadorArchivosGenerico.escribirArchivo("UT4-TA2/src/resultadosBusqueda.txt", resBusqueda.toArray(new String[0]));

        System.out.println("Post orden: "+arbol.postOrden());

        System.out.println("In orden: "+arbol.inOrden());



    }

}
