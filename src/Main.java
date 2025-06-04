import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        BathMachine machine1 = new BathMachine();
        int input = sc.nextInt();
        while (input!= 10) {

            System.out.println("insira o nome do seu pet!");
            String nomePet = sc.next();
            Pet pet = new Pet(nomePet);

            input = sc.nextInt();

            System.out.println("\nOs comandos são os seguintes:\n 1.Checar agua | 2.Checar Shampoo \n 3.Checar Máquina |" +
                    " 4.Abastecer Água \n 5.Abastecer Shampoo | 6.Colocar pet \n 7.Dar banho | 8.Retirar pet \n 9.Limpar máquina | 10. Sair");

            switch (input) {
                case 1:
                    System.out.printf("A máquina tem o total de %s litros de água",machine1.getWater());
                    break;
                case 2:
                    System.out.printf("A máquina tem o total de %s litros de shampoo",machine1.getShampoo());
                    break;
                case 3:
                    if(machine1.isMachineOccupied()) System.out.println("Tem um pet na máquina!");
                    else System.out.println("Não tem nenhum pet na máquina");
                    break;
                case 4:
                    machine1.fillWater();
                    break;
                case 5:
                    machine1.fillShampoo();
                    break;
                case 6:
                    machine1.placePet(pet);
                    break;
                case 7:
                    machine1.giveBath(pet);
                    break;
                case 8:
                    machine1.removePet(pet);
                    break;
                case 9:
                    machine1.cleanMachine();
                    break;
                default:
                    break;
            }
        }
    }
}