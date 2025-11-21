public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.titulo = "November Rain";
        musica.artista = "Guns 'n' Roses";
        musica.anoDeLancamento = 1991;

        musica.avaliarMusica(9);
        musica.avaliarMusica(8.9);
        musica.avaliarMusica(9.8);

        musica.calculaMedia();
        musica.exibirFichaTecnica();

        System.out.println(musica.avaliacao);
        System.out.println(musica.numAvaliacoes);

    }
}
