import java.math.BigDecimal;

public record Monedas(String base_code,
                      String target_code,
                      BigDecimal conversion_rate

) {
}
