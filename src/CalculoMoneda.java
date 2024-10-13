import java.math.BigDecimal;

public class CalculoMoneda {


    BigDecimal valorMoneda;

    BigDecimal valorConvertido;

    public CalculoMoneda(BigDecimal valorMoneda) {
        this.valorMoneda = valorMoneda;
    }

    public BigDecimal GenerarValorMoneda(Monedas monedas) {
        valorConvertido = monedas.conversion_rate().multiply(valorMoneda);
        return valorConvertido;
    }

}

