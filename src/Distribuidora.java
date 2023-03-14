public class Distribuidora {
	
    public static void main(String[] args) {
    	
        double[] faturamentoDiario = {100.50, 200.75, 150.20, 300.00, 80.90, 250.00, 175.30, 400.10, 120.40, 220.80, 180.60, 350.25};

        // Calcula o menor e o maior valor de faturamento diário
        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];
        for (double faturamento : faturamentoDiario) {
            if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
            if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            }
        }
        System.out.println("Menor faturamento diário: " + menorFaturamento);
        System.out.println("Maior faturamento diário: " + maiorFaturamento);

        // Calcula a média mensal de faturamento
        double somaFaturamento = 0;
        for (double faturamento : faturamentoDiario) {
            somaFaturamento += faturamento;
        }
        double mediaMensal = somaFaturamento / faturamentoDiario.length;

        // Calcula o número de dias em que o faturamento diário foi superior à média mensal
        int diasAcimaDaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}