public class Calculadora {

    /**
     * somar.
     * @param valor1
     * @param valor2
     * @return somar.
     */

    public double somar(final double valor1, final double valor2) {
        return valor1 + valor2;
    }

    /**
     * subtrair.
     * @param valor1
     * @param valor2
     * @return subtrair.
     */
    public double subtrair(final double valor1, final double valor2) {
        return valor1 - valor2;
    }
    /**
     * multiplicacao.
     * @param valor1
     * @param valor2
     * @return multiplicacao.
     */
    public double multiplicar(final double valor1, final double valor2) {
        return valor1 * valor2;
    }
    /**
     * divisao.
     * @param valor1
     * @param valor2
     * @return divisao.
     */
    public double dividir(final double valor1, final double valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return valor1 / valor2;
    }
}

