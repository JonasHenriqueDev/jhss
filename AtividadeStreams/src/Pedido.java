import java.time.LocalDate;
import java.util.List;

public class Pedido {
    //atributos
    private long id;
    private LocalDate dataPedido;
    private Cliente cliente;
    private List<Produto> produtos;

    //metodo construtor
    public Pedido(long id, LocalDate dataPedido, Cliente cliente, Produto... produtos) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.cliente = cliente;
        this.produtos = List.of(produtos);
    }

    //get e set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    //toString
    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", dataPedido=" + dataPedido +
                ", cliente=" + cliente +
                ", produtos=" + produtos +
                '}';
    }
}
