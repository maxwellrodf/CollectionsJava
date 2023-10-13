import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Maxwell", 47995079);
        agendaContatos.adicionarContato("Maria", 12345678 );
        agendaContatos.adicionarContato("Max", 47995079);
        System.out.println("EXIBIR LISTA DE CONTATOS: ");
        agendaContatos.exibirContato();
        System.out.println("PESQUISAR POR CONTATO: ");
        System.out.println(agendaContatos.pesquisarPorNome("Max"));
        System.out.println("ATUALIZAR CONTATO");
        System.out.println(agendaContatos.atualizarNumeroContato("Maxwell", 990279590));
        System.out.println("PESQUISAR POR CONTATO: ");
        System.out.println(agendaContatos.pesquisarPorNome("Maxwell"));


    }


}
