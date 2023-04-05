public class Cliente {
    //atributos
    private long id;
    private String nome;

    //metodo construtor
    public Cliente(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //get e set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //toString

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
