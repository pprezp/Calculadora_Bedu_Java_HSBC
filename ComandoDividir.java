import javax.sound.midi.SysexMessage;

public class ComandoDividir extends ComandoCalculadora implements Comando {
    public ComandoDividir(float acumulador, float valor) {
      super(acumulador, valor);
    }
  
    public float ejecutar() {
        float result;
        if( valor != 0 ){
            result =  acumulador / valor;
        }else{
            System.out.println("No se puede dividir entre 0");
            result = acumulador;
        }
        return result;
    }
  }
  