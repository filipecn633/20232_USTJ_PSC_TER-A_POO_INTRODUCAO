import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        //LivroDeNotas livroDeNotas1 = new LivroDeNotas();
        //LivroDeNotas livroDeNotas2 = new LivroDeNotas();
                
        String nome1 = JOptionPane.showInputDialog("Digite o curso 1");
        LivroDeNotas livroDeNotas1 = new LivroDeNotas(nome1);

        //livroDeNotas1.setNomeDoCurso(nome1);
        JOptionPane.showMessageDialog(null, livroDeNotas1.getNomeDoCurso(), "Veja o curso 1", JOptionPane.INFORMATION_MESSAGE);

        String nome2 = JOptionPane.showInputDialog("Digite o curso 2");
        LivroDeNotas livroDeNotas2 = new LivroDeNotas(nome2);

        //livroDeNotas2.setNomeDoCurso(nome2);
        JOptionPane.showMessageDialog(null, livroDeNotas2.getNomeDoCurso(), "Veja o curso 2", JOptionPane.INFORMATION_MESSAGE);

        //livroDeNotas1.nomeDoCurso = "Veterinaria";

        livroDeNotas1.exibeMensagem();
        livroDeNotas2.exibeMensagem();               
    }
}