package envio;

public class Internacional implements IEnvio {

    int precio;
    int entrega = 190;

    public Internacional(int precio) {
        this.precio = precio;
    }

    @Override
    public void cargarMercancia() {

    }

    @Override
    public void rastrearPaquete() {

    }

    public boolean permitidoEnAvion() {
        return (100 > this.precio);
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


