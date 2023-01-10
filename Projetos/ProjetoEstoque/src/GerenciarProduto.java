import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarProduto {
    List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarProduto gerenciar = new GerenciarProduto();
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        do{
            opt = montarMenu(gerenciar, sc);


        }while(opt !=9);


    }

    private static int montarMenu(GerenciarProduto gerenciar, Scanner sc) {
        int opt;
        System.out.println(">>>>>Menu Principal<<<<<");
        System.out.println("1-Cadastrar novo produto");
        System.out.println("2-Registrar entrada");
        System.out.println("3-Registrar saida");
        System.out.println("4-Saldo de um produto");
        System.out.println("5-Listar todos os produtos");
        System.out.println("6-Mostar patrimonios");
        System.out.println("9-Sair");
        System.out.println("Escolha uma opcao: ");
        opt = Integer.parseInt(sc.nextLine());

        switch (opt){
            case 1:
                gerenciar.execCadastrarNovo(sc);
                break;
            case 2:
                gerenciar.execRegistrarEntreada(sc);
                break;
            case 3:
                gerenciar.execRegistrarSaida(sc);
                break;
            case 4:
                gerenciar.execMostrarSaldo(sc);
                break;
            case 5:
                gerenciar.execListarTodos();
                break;
            case 6:
                gerenciar.patrimonioInventario();
                break;
            default:
                System.out.println("Opcao invalida meu camarada");

        }
        return opt;
    }

    public void execCadastrarNovo(Scanner sc){
        //cadastra um novo produto e coloca na lista
        Produto product = new Produto();
        System.out.println("Digite o codigo do produto;");
        product.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a descricao do produto");
        product.setDescricao(sc.nextLine());

        System.out.println("Digite o vaalor unitario do produto");
        product.setValorUnitario(Double.parseDouble(sc.nextLine()));

        produtos.add(product);
        System.out.println("Produto cadastrado com sucesso UWU");


    }

    public void execRegistrarEntreada(Scanner sc){

    }

    public void execRegistrarSaida(Scanner sc){

    }

    public  void execMostrarSaldo(Scanner sc){
        System.out.println("Digite o codigo do produto");
        int codProcurado = Integer.parseInt(sc.nextLine());

        Produto produto = pro
    }

    }

    public void execListarTodos(){
        //Apresentar na tela todos os produtos cadastrados

        for(Produto item : produtos){
            item.exibirDados();
    }

    public void patrimonioInventario(){

    }

    public Produto gerenciarProduto(int codProduto){
            for(Produto item : produtos){
                if(codProduto = item.getCodigo()){
                    return item;
                }
            }
            return null;
        }
}