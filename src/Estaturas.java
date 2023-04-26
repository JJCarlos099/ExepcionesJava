import java.util.Arrays;

public class Estaturas {
        public static void main(String[] args) {

            // Agregue un array de estaturas
            double[] estaturas = {1.75, 1.65, 1.80, 1.60, 1.70, 1.85, 1.55, 1.90, 1.80, 1.75};

            // Calculando la media
            double media = 0;
            for (double estatura : estaturas) {
                media += estatura;
            }
            media /= estaturas.length;

            // Calculando la desviación estándar
            double varianza = 0;
            for (double estatura : estaturas) {
                varianza += Math.pow(estatura - media, 2);
            }
            double desviacion = 0;
            try {
                desviacion = Math.sqrt(varianza / estaturas.length);
            } catch (ArithmeticException e) {
                System.err.println("No se puede calcular la desviación estándar: " + e.getMessage());
                System.exit(1);
            }

            // Calculando la estatura menor y mayor
            double menor = Double.MAX_VALUE;
            double mayor = Double.MIN_VALUE;
            for (double estatura : estaturas) {
                if (estatura < media && estatura < menor) {
                    menor = estatura;
                }
                if (estatura > media && estatura > mayor) {
                    mayor = estatura;
                }
            }

            // Imprimiendo los resultados
            System.out.println("Estaturas: " + Arrays.toString(estaturas));
            System.out.printf("Media: %.2f\n", media);
            System.out.printf("Desviación estándar: %.2f\n", desviacion);
            System.out.printf("Estatura menor: %.2f\n", menor);
            System.out.printf("Estatura mayor: %.2f\n", mayor);
        }

}