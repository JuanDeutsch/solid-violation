package main;

import bd.FireBase;
import envio.IEnvio;
import envio.Internacional;
import envio.Municipal;
import logica.BDCualquiera;

public class Principal {

  public static void main(String[] args) {
    BDCualquiera cualquiera = new BDCualquiera(new FireBase());
    IEnvio[] envios = {
        new Municipal(5000),
        new Internacional(25000)
    };

    imprimirTiempoDeEnvio(envios);

    cargarEnvios(cualquiera, envios);
    eliminarEnvios(cualquiera, envios);
    actualizarEnvios(cualquiera, envios);


  }

  private static void cargarEnvios(BDCualquiera cualquiera, IEnvio[] envios) {
    for (IEnvio envio : envios){
      cualquiera.cargar(envio);
    }
  }

  private static void eliminarEnvios(BDCualquiera cualquiera, IEnvio[] envios) {
    for (IEnvio envio : envios){
      cualquiera.eliminar(envio);
    }
  }

  private static void actualizarEnvios(BDCualquiera cualquiera, IEnvio[] envios) {
    for (IEnvio envio : envios){
      cualquiera.actualizar(envio);
    }
  }

  static void imprimirTiempoDeEnvio(IEnvio[] envios){
    for (IEnvio envio : envios) {
      System.out.println("El paquete llega " + (envio.getEntrega()) + " horas.");
    }
  }
}

