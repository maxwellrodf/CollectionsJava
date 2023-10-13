import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //METODOS PESQUISAR
    public List<Livro> pesquisarPorAutor(String autor){ //PASSA O PARAMETRO DA PESQUISA
        List<Livro> livrosPorAutor = new ArrayList<>(); //CRIA UMA NOVA LISTA
        if(!livroList.isEmpty()){ //SE A LISTA LIVRO LIST NÃO ESTIVER VAZIA
            for(Livro l: livroList){ //ADICIONA O AUTOR PESQUISADO NA VARIAVEL L
                if(l.getAutor().equalsIgnoreCase(autor)){ //SE FOR IGUAL ADICIONA NA NOVA LISTA
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal ){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 1", 2023);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));

    }
}
