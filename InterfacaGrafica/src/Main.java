import javax.swing.JOptionPane;

public class Main {
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        boolean continueLoop = true; // repete enquanto as entradas forem validas

        do {
            try {
                // Caixa de diálogo para entrada do numerador
                String strNumerator = JOptionPane.showInputDialog("Entre com o numerador:");
                int numerator = Integer.parseInt(strNumerator); //parseInt() sever para converter String para int

                //Caixa de diálogo para entrada do denominador
                String strDenominator = JOptionPane.showInputDialog("Entre com o denominador:");
                int denominator = Integer.parseInt(strDenominator); //parseInt() sever para converter String para int

                int result = quotient(numerator, denominator);
                JOptionPane.showMessageDialog(null, String.format("Resultado: %d / %d = %d", numerator, denominator, result),
                        "Divisão de Dois números inteiros", JOptionPane.INFORMATION_MESSAGE);
                continueLoop = false; // sai do loop se a divisão for bem-sucedida
            } catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(null, "  necessário entrar dois números inteiros." +
                        "\nPorfavor, tente novamente", "Error: " + numberFormatException.getLocalizedMessage(), JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException arithmeticException) {
                JOptionPane.showMessageDialog(null, "Denominador não pode ser zero." +
                        "\nPorfavor, tente novamente", "Error: " + arithmeticException.getLocalizedMessage(), JOptionPane.ERROR_MESSAGE);
            }

        }while (continueLoop);

    }
}