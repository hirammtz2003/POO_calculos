
public class Calculos {

    /**
     * *
     * Calcula la sumatoria de los numeros entre "x" a "y", incluyendolas
     *
     * @param x
     * @param y
     * @return sumatoria
     */
    int sumarSerie(int x, int y) {
        int sumar=0;
        for(int i =x, i<y; i++)
            suma=suma+i;
        return suma;
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        float res=Math.abs(num);
        return res;
    }

    /**
     * *
     * Cuenta las vocales en una frase
     *
     * @param texto
     * @return cantidad de vocales
     */
    int vocales(String texto) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * *
     * Invierte el orden de las letras en cada palabra, pero no altera el orden
     * de las palabras
     *
     * @param texto
     * @return texto invertida
     */
    String invertir(String texto) {
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            StringBuilder palabraInvertida = new StringBuilder(palabra);
            resultado.append(palabraInvertida.reverse().toString()).append(" ");
        }

        return resultado.toString().trim();
    }

}
