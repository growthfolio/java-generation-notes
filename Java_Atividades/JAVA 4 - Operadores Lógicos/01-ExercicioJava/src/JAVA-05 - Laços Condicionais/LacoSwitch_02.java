package exercicio_02;
import java.util.Scanner;

public class ReajusteSalario {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        
        System.out.print("Digite o nome do colaborador: ");
        String nome = leia.nextLine();

        System.out.print("Digite o código do cargo (de 1 a 6): ");
        int codigoCargo = leia.nextInt();

        System.out.print("Digite o salário do colaborador: ");
        float salario = leia.nextFloat();

        
        float novoSalario = calcularNovoSalario(codigoCargo, salario);

        
        System.out.println("\nNome do Colaborador: " + nome);
        System.out.println("Cargo: " + obterCargo(codigoCargo));
        System.out.println("Novo Salário: " + novoSalario);

        leia.close();
    }

    
    public static float calcularNovoSalario(int codigoCargo, float salario) {
        float percentualReajuste = 0;

        switch (codigoCargo) {
        case 1:
            percentualReajuste = 0.10f; // 10% de reajuste
            break;
        case 2:
            percentualReajuste = 0.07f; // 7% de reajuste
            break;
        case 3:
            percentualReajuste = 0.09f; // 9% de reajuste
            break;
        case 4:
            percentualReajuste = 0.06f; // 6% de reajuste
            break;
        case 5:
            percentualReajuste = 0.05f; // 5% de reajuste
            break;
        case 6:
            percentualReajuste = 0.08f; // 8% de reajuste
            break;
        default:
            System.out.println("Código de cargo inválido.");
    }

        
        float aumento = salario * percentualReajuste;
        return salario + aumento;
    }

    
    public static String obterCargo(int codigoCargo) {
        String cargo = "";
        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                break;
            case 2:
                cargo = "Vendedor";
                break;
            case 3:
                cargo = "Supervisor";
                break;
            case 4:
                cargo = "Motorista";
                break;
            case 5:
                cargo = "Estoquista";
                break;
            case 6:
                cargo = "Técnico de TI";
                break;
            default:
                cargo = "Cargo Desconhecido";
        }
        return cargo;
    }
}
