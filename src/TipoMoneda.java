public class TipoMoneda {
    String monedaOriginal;

    String monedaConvertir;
    int opcionUsuario;

    public TipoMoneda(int opcionUsuario) {
        this.opcionUsuario = opcionUsuario;
    }

    public void setOpcionUsuario(int opcionUsuario) {
        this.opcionUsuario = opcionUsuario;
    }

    public String getMonedaOriginal() {
        return monedaOriginal;
    }

    public void setMonedaOriginal(String monedaOriginal) {
        this.monedaOriginal = monedaOriginal;
    }

    public String getMonedaConvertir() {
        return monedaConvertir;
    }

    public void setMonedaConvertir(String monedaConvertir) {
        this.monedaConvertir = monedaConvertir;
    }

    public void ConvertirMoneda(){

            switch (opcionUsuario) {
                case 1:
                    monedaOriginal = "USD";
                    monedaConvertir = "ARS";

                    break;
                case 2:
                    monedaOriginal = "ARS";
                    monedaConvertir = "USD";

                    break;
                case 3:
                    monedaOriginal = "USD";
                    monedaConvertir = "BRL";

                    break;
                case 4:
                    monedaOriginal = "BRL";
                    monedaConvertir = "USD";

                    break;
                case 5:
                    monedaOriginal = "USD";
                    monedaConvertir = "COP";

                    break;
                case 6:
                    monedaOriginal = "COP";
                    monedaConvertir = "USD";
                    break;
            }

        }
}
