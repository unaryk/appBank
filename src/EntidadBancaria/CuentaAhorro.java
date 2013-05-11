package EntidadBancaria;

public class CuentaAhorro extends CuentaBancaria{
  private Double interesRemuneracion;

  public CuentaAhorro(Double interesRemuneracion, Persona persona, Double saldo, String ccc) {
    super(persona, saldo, ccc);
    this.interesRemuneracion = interesRemuneracion;
  }

  public Double getInteresRemuneracion() {
    return interesRemuneracion;
  }

  public void setInteresRemuneracion(Double interesRemuneracion) {
    this.interesRemuneracion = interesRemuneracion;
  }
}
