import java.util.ArrayList;
import java.util.Iterator;

public class ListagemClientes {
    public static void main(String[] args) {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        Cliente c1 = new Cliente();
        c1.setNome("Felipe");
        c1.setEmail("felipe@gmail.com");
        c1.setCpf("1234567");
        lista.add(c1);

        Cliente c2 = new Cliente();
        c2.setNome("Lucas");
        c2.setEmail("lucas@gmail.com");
        c2.setCpf("222222");
        lista.add(c2);

        Cliente c3 = new Cliente();
        c3.setNome("Matheus");
        c3.setEmail("matheus@gmail.com");
        c3.setCpf("333333");
        lista.add(c3);

        System.out.println("\nPercorrendo com iterator");
        Iterator<Cliente> itCliente = lista.iterator();
        while (itCliente.hasNext()) {
            Cliente cli = itCliente.next();
            System.out.println("Nome: " + cli.getNome() + " CPF: " + cli.getCpf() + " Email: " + cli.getEmail());
        }


    // Remover item da lista
    Cliente cliRemover = new Cliente();
    cliRemover.setCpf("1234567");
    Iterator<Cliente> itRemover = lista.iterator();
    while (itRemover.hasNext()){
        if(itRemover.next().getCpf() .equals(cliRemover.getCpf())){
            System.out.println("Removendo cliente");
            itRemover.remove();
        }
    }

    System.out.println("\nPercorren com foreach");
    for(Cliente cliente : lista){
        System.out.println("Nome: " + cliente.getNome() + " CPF: " + cliente.getCpf());
    }
    //Remover da lista com foreach
    //Exception ao tentar remover último item da lista, se não colocar um break
    //Sugestão usar iterator
    cliRemover.setCpf("222222");
    for(Cliente cli : lista){
        if (cli.getCpf().equals(cliRemover.getCpf())) {
            System.out.println("Removendo cliente "+ cli.getNome());
            lista.remove(cli);
            break;
        }
    }
    }
}
