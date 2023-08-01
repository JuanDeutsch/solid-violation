package envio;

public interface IEnvio {

  void cargarMercancia();

  void rastrearPaquete();

  int getPrecio();

  void setPrecio(int precio);

  int getEntrega();
}
