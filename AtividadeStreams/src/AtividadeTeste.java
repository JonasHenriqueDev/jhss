import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtividadeTeste {
    public static void main(String[] args) {
        //clientes
        Cliente c1 = new Cliente(1001L, "João");
        Cliente c2 = new Cliente(1002L, "Maria");
        Cliente c3 = new Cliente(1003L, "José");

        //produtos-papelaria
        Produto p1 = new Produto(2001L, "Caneta", "Papelaria", 2.0);
        Produto p2 = new Produto(2002L, "Lápis", "Papelaria", 1.0);
        Produto p3 = new Produto(2003L, "Caderno", "Papelaria", 15.5);

        //produtos-jogo
        Produto p4 = new Produto(3001L, "ELDEN RING", "Jogo", 200.0);
        Produto p5 = new Produto(3002L, "Resident Evil 4", "Jogo", 300.0);
        Produto p6 = new Produto(3003L, "GTA V", "Jogo", 35.0);

        //produtos-livro
        Produto p7 = new Produto(4001L, "Dom Quixote", "Livro", 40.9);
        Produto p8 = new Produto(4002L, "O Pequeno Príncipe", "Livro", 18.0);
        Produto p9 = new Produto(4003L, "O Auto da Compadecida", "Livro", 60.0);

        //pedidos
        Pedido pd1 = new Pedido(1L, LocalDate.of(2023, 4, 05), c1, p1, p4, p9);
        Pedido pd2 = new Pedido(2L, LocalDate.of(2020, 9, 21), c2, p3, p4, p9);
        Pedido pd3 = new Pedido(3L, LocalDate.of(2022, 11, 15), c3, p5, p7, p8);
        Pedido pd4 = new Pedido(4L, LocalDate.of(2019, 3, 24), c1, p5, p3, p2);
        Pedido pd5 = new Pedido(5L, LocalDate.of(2023, 10, 1), c2, p7, p5, p9);
        Pedido pd6 = new Pedido(6L, LocalDate.of(2018, 1, 9), c3, p8, p7, p8);
        Pedido pd7 = new Pedido(7L, LocalDate.of(2023, 5, 05), c1, p9, p4, p2);
        Pedido pd8 = new Pedido(8L, LocalDate.of(2016, 6, 17), c2, p3, p6, p5);
        Pedido pd9 = new Pedido(9L, LocalDate.of(2015, 3, 03), c3, p3, p3, p2);

        //lista-produtos
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);

        /*Operação 1 - Exibir todos os jogos com preço menor que 100.0*/

        // filtro Stream para jogos abaixo de 100
        List<Produto> jogosAbaixo100 =
                produtos.stream().filter(produto -> produto.getCategoria().equals("Jogo")
                                && produto.getPreco() < 100.0).toList();

        //mostrar os jogosAbaixo100
        System.out.println("Jogos com preço menor que R$100,00:");
        for (Produto j: jogosAbaixo100) {
            System.out.println(j.toString());
        }
        System.out.println();

        /*Operação 2 - Obtenha uma lista de pedido com produtos da categoria "Papelaria"*/

        //lista-pedidos
        List<Pedido> pedidos = Arrays.asList(pd1, pd2, pd3, pd4, pd5, pd6, pd7, pd8, pd9);

        List<Pedido> pedidosPapelaria = pedidos.stream()
                .filter(pedido -> pedido.getProdutos().stream()
                        .anyMatch(produto -> produto.getCategoria().equals("Papelaria"))).toList();

        System.out.println("Pedidos de Papelaria: ");
        for(Pedido pd: pedidosPapelaria) {
            System.out.println(pd.toString());
        }
        System.out.println();

        /*Operação 3 - Obtenha os produtos agrupados por categoria*/

        List<Produto> jogos = produtos.stream().filter(produto -> produto.getCategoria().equals("Jogo")).toList();
        List<Produto> papelaria = produtos.stream().filter(produto -> produto.getCategoria().equals("Papelaria")).toList();
        List<Produto> livros = produtos.stream().filter(produto -> produto.getCategoria().equals("Livro")).toList();


        System.out.println("Produtos agrupados por categoria: ");
        System.out.println("Jogos: "+jogos.toString());
        System.out.println("Papelaria: "+papelaria.toString());
        System.out.println("Livros: "+livros.toString());

        /*Operação 4 - Obtenha uma lista com o pedido mais recente de cada cliente.*/

        //lista de clientes
        List<Cliente> clientes = Arrays.asList(c1, c2, c3);

        //agrupando os pedidos por clientes
        List<Pedido> pedidosC1 = pedidos.stream().filter(pedido -> pedido.getCliente().equals(c1)).toList();
        List<Pedido> pedidosC2 = pedidos.stream().filter(pedido -> pedido.getCliente().equals(c2)).toList();
        List<Pedido> pedidosC3 = pedidos.stream().filter(pedido -> pedido.getCliente().equals(c3)).toList();

        //utilizando o metodo max da classe collections com um comparador para pegar a data mais recente
        Pedido pedidoC1MaisRecente = Collections.max(pedidosC1, Comparator.comparing(Pedido::getDataPedido));
        Pedido pedidoC2MaisRecente = Collections.max(pedidosC2, Comparator.comparing(Pedido::getDataPedido));
        Pedido pedidoC3MaisRecente = Collections.max(pedidosC3, Comparator.comparing(Pedido::getDataPedido));

        System.out.println("Pedido mais recente de João: "+pedidoC1MaisRecente.toString());
        System.out.println("Pedido mais recente de Maria: "+pedidoC2MaisRecente.toString());
        System.out.println("Pedido mais recente de José: "+pedidoC3MaisRecente.toString());

    }
}
