package envio;

public class Municipal implements IEnvio {

    int precio;
    int entrega = 12;


    public Municipal(int precio) {
        this.precio = precio;
    }

    @Override
    public void cargarMercancia() {

    }

    @Override
    public void rastrearPaquete() {

    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int getEntrega() {
        return this.entrega;
    }
}
