public class TElementoAB<T> implements IElementoAB<T> {

    private final Comparable etiqueta;
    private final T datos;
    private TElementoAB<T> hijoIzq;
    private TElementoAB<T> hijoDer;

    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        this.etiqueta = unaEtiqueta;
        this.datos = unosDatos;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(this.etiqueta) == 0){
            return this;

        }else if (unaEtiqueta.compareTo(this.etiqueta)<0){
            if (this.hijoIzq != null) {
                return getHijoIzq().buscar(unaEtiqueta);
            }
            return null;

        }else if (this.hijoDer != null) {
            return getHijoDer().buscar(unaEtiqueta);
        }

        return null;
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento)
    {
        TArbolBB.contador++;
        if (unElemento.getEtiqueta().compareTo(this.etiqueta) < 0) {
            if (this.hijoIzq != null) {
                return getHijoIzq().insertar(unElemento);

            } else {
                this.hijoIzq = unElemento;
                return true;
            }
        } else if (unElemento.getEtiqueta().compareTo(this.etiqueta) > 0) {
            if (this.hijoDer != null) {
                return getHijoDer().insertar(unElemento);
            } else {
                this.hijoDer = unElemento;
                return true;
            }
        } else {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }

    @Override
    public String preOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String inOrden() {
        StringBuilder tempStr = new StringBuilder();
        if (this.hijoIzq != null){
            tempStr.append(getHijoIzq().inOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        tempStr.append(this.etiqueta.toString());
        if (this.hijoDer != null){
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoDer().inOrden());
        }
        return tempStr.toString();
    }

    @Override
    public String postOrden() {
        StringBuilder tempStr = new StringBuilder();
        if (this.hijoIzq != null) {
            tempStr.append(getHijoIzq().postOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        if (this.hijoDer != null) {
            tempStr.append(getHijoDer().postOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        tempStr.append(this.etiqueta.toString());
        return tempStr.toString();    }

    @Override
    public T getDatos() {
        return this.datos;
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
