public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    public static int contador = 0;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        boolean res = false;
        TArbolBB.contador = 0;
        if (this.raiz != null)
        {
            res = this.raiz.insertar(unElemento);
            //if (res)
                //this.contador = raiz.contador;
        }
        else
        {
            this.raiz = unElemento;
            //this.contador = 1;
            return true;
        }

        return res;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (esVacio()){
            return null;
        }else{
            return raiz.buscar(unaEtiqueta);
        }

    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String preOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String inOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String postOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

       }

    @Override
    public String preOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String inOrden() {
          if (esVacio()){
            return null;
        }else{
            return raiz.inOrden();
        }
    }

    @Override
    public String postOrden() {
        if (esVacio()){
            return null;
        }else{
            return raiz.postOrden();
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean esVacio(){
        return (raiz == null);
 }

}