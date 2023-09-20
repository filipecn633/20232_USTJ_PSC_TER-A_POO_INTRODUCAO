public class LivroDeNotas{
    private String nomeDoCurso;

    //Construtor com parâmetro

    public LivroDeNotas (String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;


        //Construtor padrão
       
    }  
    
     public LivroDeNotas (){
            
        }
    //Métodos de acesso = getters (são publicos)      
    public String getNomeDoCurso (){
        return nomeDoCurso;
    }
    //Métodos modificadores = setters (sempre publico, é void, é set o nome do atributo)
    public void setNomeDoCurso (String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }
    public void exibeMensagem (){
        System.out.println("Bem vindo ao livro de notas do curso " + nomeDoCurso);
    }
}