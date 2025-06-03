import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        boolean isInputing = true, nextPet = false;
        BathMachine machine1 = new BathMachine();

        while (isInputing) {
            System.out.println("insira o nome do seu pet!");
            if(!nextPet) {
                String nomePet = sc.next();
                Pet pet = new Pet(nomePet);
                nextPet = true;
            }
            System.out.println("\nOs comandos são os seguintes:\n 1.Checar agua | 2.Checar Shampoo \n 3.Checar Máquina |" +
                    " 4.Abastecer Água \n 5.Abastecer Shampoo | 6.Colocar pet \n 7.Dar banho | 8.Retirar pet \n 9.Limpar máquina | 10.Colocar outro Pet \n 11.Sair");
            String input = sc.next();
            isInputing = false;
            switch (input) {
                case "1":
                    System.out.printf("A máquina tem o total de %s litros de água",machine1.getWater());
                    isInputing = true;
                    break;
                case "2":
                    System.out.printf("A máquina tem o total de %s litros de shampoo",machine1.getShampoo());
                    isInputing = true;
                    break;
                case "3":
                    if(machine1.isMachineOccupied()) System.out.println("Tem um pet na máquina!");
                    else System.out.println("Não tem nenhum pet na máquina");
                    isInputing = true;
                    break;
                case "4":
                    machine1.fillWater();
                    isInputing = true;
                    break;
                case "5":
                    machine1.fillShampoo();
                    isInputing = true;
                    break;
                case "6":
                    machine1.placePet();
                    isInputing = true;
                    break;
                case "7":
                    machine1.giveBath(pet);
                    isInputing = true;
                    break;
                case "8":
                    machine1.removePet(pet);
                    isInputing = true;
                    break;
                case "9":
                    machine1.cleanMachine();
                    isInputing = true;
                    break;
                case "10":
                    nextPet = false;
                    isInputing = true;
                    break;
                case "11":
                    break;
                default:
                    isInputing = true;
                    break;
            }
        }
    }
}