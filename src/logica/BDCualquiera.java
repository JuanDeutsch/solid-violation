package logica;

import envio.IEnvio;

public class BDCualquiera {

    BaseDatos bd;

    public BDCualquiera(BaseDatos bd) {
        this.bd = bd;
    }

    public void cargar(IEnvio envio){
        bd.crearTipoEnvio(envio);
    }

    public void eliminar(IEnvio envio){
        bd.eliminarTipoEnvio(envio);
    }

    public void actualizar(IEnvio envio){
        bd.actualizarTipoEnvio(envio);
    }
}
