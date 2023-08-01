package logica;

import envio.IEnvio;

public interface BaseDatos {
    void crearTipoEnvio(IEnvio envio);
    void eliminarTipoEnvio(IEnvio envio);
    void actualizarTipoEnvio(IEnvio envio);


}
