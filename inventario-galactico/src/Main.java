public class Main {
    public static void main(String[] args) {
        Par<String, Integer>[] productos = new Par[4];
        productos[0] = new Par<>("Combustible", 500);
        productos[1] = new Par<>("Oxígeno", 200);
        productos[2] = new Par<>("VÍveres", 150);
        productos[3] = new Par<>("Repuestos", 80);

        Caja<Integer> cajaCantidades = new Caja<>();
        for (int i = 0; i < productos.length; i++) {
            cajaCantidades.agregar(productos[i].getValor());
        }

        int maxCantidad = cajaCantidades.obtenerMayor();

        Par<String, Integer> productoMayor = null;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getValor() == maxCantidad) {
                productoMayor = productos[i];
                break;
            }
        }

        System.out.println("Producto con mayor cantidad: " + productoMayor);
    }
}