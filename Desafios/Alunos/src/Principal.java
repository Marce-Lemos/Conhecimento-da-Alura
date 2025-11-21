//Classe Principal
public class Principal {
    public static void main(String[] args) {
        Alunos alunos1 = new Alunos("Lulu", 7.5, 8.0, 9.2);
        Alunos alunos2 = new Alunos("Karina", 6.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + alunos1.getNome());
        System.out.println("Nota 1: " + alunos1.getNota1());
        System.out.println("Nota 2: " + alunos1.getNota2());
        System.out.println("Nota 3: " + alunos1.getNota3());
        System.out.println("Média: " + alunos1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + alunos2.getNome());
        System.out.println("Nota 1: " + alunos2.getNota1());
        System.out.println("Nota 2: " + alunos2.getNota2());
        System.out.println("Nota 3: " + alunos2.getNota3());
        System.out.println("Média: " + alunos2.calcularMedia());
    }
}
