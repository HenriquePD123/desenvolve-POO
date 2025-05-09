public class Autor extends Pessoa {

    public enum TipoAutor {
        USUARIO, AUTOR_TRADICIONAL
    }

    private String nacionalidade;
    private TipoAutor tipo;
    private int idade; 

    
    public Autor(String nome, String nacionalidade, TipoAutor tipo, int idade) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.tipo = tipo;
        this.idade = idade; 
    }

    
    public TipoAutor getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutor tipo) {
        this.tipo = tipo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + idade +
                ", tipo=" + tipo +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
