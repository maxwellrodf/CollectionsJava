import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(123456, "Arroz", 10.00, 5);
        cadastroProdutos.adicionarProduto(789456, "Feijao", 15.00, 3);
        cadastroProdutos.adicionarProduto(156987, "Cerveja", 5.00, 15);
        System.out.println("EXIBINDO POR NOME");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("EXIBINDO POR PRECO");
        System.out.println(cadastroProdutos.exibirPorPreco());
    }




}
