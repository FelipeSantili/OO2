import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class SistemaAeroporto {
        public static void main(String args[]) throws IOException {
        
        
        HashMap<String, Aeroporto> mapAeroporto = new HashMap<String, Aeroporto>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("----- Cadastro Aeroporto -----\n");

        boolean continuar = true;
        while (continuar) {
            System.out.println("1 - Cadastrar aeroporto");
            System.out.println("2 - Listar aeroporto");
            System.out.println("3 - Remova aeroporto");
            System.out.println("4 - Consultar aeroporto pela sigla");
            System.out.println("5 - Sair\n");

            int opc = Integer.parseInt(reader.readLine());

            switch(opc) {
                case 1:
                    cadastrarAeroporto(mapAeroporto);
                    break;
                case 2:
                    listarAeroporto(mapAeroporto);
                    break;
                case 3:
                    removerAeroporto(mapAeroporto, reader);
                    break;
                case 4:
                    consultarAeroporto(mapAeroporto, reader);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        }
        
        System.out.println("Programa encerrado.\n");
    }
    public static void cadastrarAeroporto(HashMap<String, Aeroporto> mapAero) throws IOException{
        System.out.println("\nDigite o nome do Aeroporto:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nome = reader.readLine();
        System.out.println("\nDigite a cidade do Aeroporto:");
        
        String cidade = reader.readLine();
        System.out.println("\nInforme a altitude do Aeroporto:");
    
        String altitude = reader.readLine();
        System.out.println("\nInforme a sigla do Aeroporto:");
        String sigla = reader.readLine();
        
    Aeroporto aero = new Aeroporto();
    aero.setNome(nome)  ;
    aero.setCidade(cidade);
    aero.setAltitude(altitude);
    
    mapAero.put(sigla, aero);
    }
        
        
        public static void listarAeroporto(HashMap<String, Aeroporto> mapAero) throws IOException{
            System.out.println("\nListando Aeroportos:");
                if (mapAero.isEmpty()) {
                    System.out.println("\nNenhum aeroporto cadastrado.");
                    return;
                }
                
                for (Map.Entry<String, Aeroporto> entry : mapAero.entrySet()) {
                String sigla = entry.getKey();
                Aeroporto aeroporto = entry.getValue();

                System.out.println("Sigla: " + sigla);
                System.out.println("Nome: " + aeroporto.getNome());
                System.out.println("Cidade: " + aeroporto.getCidade());
                System.out.println("Altitude: " + aeroporto.getAltitude());
                System.out.println();
                }

    }

        public static void removerAeroporto(HashMap<String, Aeroporto> mapAero, BufferedReader reader) throws IOException{
            System.out.println("\nDigite a sigla do Aeroporto que deseja remover:");
            String sigla = reader.readLine();
            
                if (mapAero.containsKey(sigla)) {
                    mapAero.remove(sigla);
                    System.out.println("Aeroporto removido com sucesso.\n");
                } else {
                    System.out.println("Aeroporto não encontrado.\n");
                }
        }

        public static void consultarAeroporto(HashMap<String, Aeroporto> mapAero, BufferedReader reader) throws IOException{
            System.out.println("\nDigite a sigla do Aeroporto que deseja consultar:");
            String sigla = reader.readLine();
            
                if (mapAero.containsKey(sigla)) {
                    Aeroporto aeroporto = mapAero.get(sigla);
                    System.out.println("Nome: " + aeroporto.getNome());
                    System.out.println("Cidade: " + aeroporto.getCidade());
                    System.out.println("Altitude: " + aeroporto.getAltitude());
                } else {
                    System.out.println("\nAeroporto não encontrado.");
                }
        }
    }
