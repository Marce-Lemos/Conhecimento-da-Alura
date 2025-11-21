public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        int m;

        for (int i = 1; i <= 10; i++) {
            m = i * numero;
            System.out.println(numero + "x" + i + " = " + m);
        }

    }
}
