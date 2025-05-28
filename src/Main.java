import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        String input = "";
        boolean isInputing = true;

        BathMachine machine1 = new BathMachine();
        while (isInputing) {
            System.out.println("\nOs comandos são os seguintes:\n 1.ligar carro \n 2.desligar carro \n 3.acelerar\n" +
                    " 4.desacelerar \n 5.virar para esquerda \n 6.virar para direita \n 7.verificar velocidade \n 8. trocar marcha ");
            input = sc.next();
            input.toLowerCase();
            isInputing = false;
            switch (input) {
                case "1":
                    System.out.println(machine1.getWater());
                    isInputing = true;
                    break;
                case "2":
                    machine1.turnOff();
                    isInputing = true;
                    break;
                case "3":
                    machine1.accelerate();
                    isInputing = true;
                    break;
                case "4":
                    machine1.desAccelerate();
                    isInputing = true;
                    break;
                case "5":
                    machine1.turnLeft();
                    isInputing = true;
                    break;
                case "6":
                    machine1.turnRight();
                    isInputing = true;
                    break;
                case "7":
                    machine1.verifyVelocity();
                    isInputing = true;
                    break;
                case "8":
                    System.out.println("Gostaria de trocar para qual marcha?");
                    int gear = sc.nextInt();
                    machine1.changeGear(gear);
                    isInputing = true;
                    break;
                case "sair":
                    break;
                default:
                    isInputing = true;
                    break;
            }
        }
    }
}