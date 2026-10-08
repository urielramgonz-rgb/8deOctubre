public class Par<K, V> {
    private K clave;
    private V valor;

    // Constructor
    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    // Getters
    public K getClave() {
        return clave;
    }

    public V getValor() {
        return valor;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Par{" +
                "clave=" + clave +
                ", valor=" + valor +
                '}';
    }
}