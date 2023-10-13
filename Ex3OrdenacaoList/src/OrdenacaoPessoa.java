import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    //CONSTRUTOR PARA CRIAR UM ARRAY UMA LISTA VAZIA
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    //METODO PARA ADICIONAR PESSOA
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //METODOS PARA ORDENAR POR IDADE E POR ALTURA
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList); //INICIA O ARRAYLIST COM AS PESSOAS
        Collections.sort(pessoasPorIdade); //ORDENARA A LISTA PELO COMPARABLE
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); //ORDENA A LISTA PELO COMPARATOR
        return  pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Maxwell", 34, 1.80);
        ordenacaoPessoa.adicionarPessoa("Karina", 31, 1.50);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }


}
