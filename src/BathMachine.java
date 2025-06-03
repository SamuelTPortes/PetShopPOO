public class BathMachine {
    private int water = 30;
    private int shampoo = 10;
    private boolean machineCleaned = true;
    private Pet pet;
    private boolean machineOccupied = false; 



    // GETTERS AND SETTERS

    private boolean isMachineCleaned() {
        return machineCleaned;
    }

    private void setMachineCleaned(boolean machineCleaned) {
        this.machineCleaned = machineCleaned;
    }

    public int getWater() {
        return water;
    }

    public boolean isMachineOccupied() {
        return machineOccupied;
    }

    private void setMachineOccupied(boolean machineOccupied) {
        this.machineOccupied = machineOccupied;
    }

    public int getShampoo() {
        return shampoo;
    }

    // END GETTERS AND SETTERS


    public void giveBath(Pet pet){
        if(getWater() >= 10 && getShampoo() >= 1 && isMachineOccupied() ){
            water -=10;
            shampoo -=2;
            pet.setPetCleaned(true);
            System.out.printf("Banho realizado, o %s está limpo agora\n", pet.getName());
        } else if(!isMachineOccupied()) System.out.println("Não tem nenhum pet na máquina");
        else if(getWater() < 10) System.out.println("A máquina não tem água suficiente");
        else if(getShampoo() < 1) System.out.println("A máquina não tem shampoo suficiente");
    }
    public void fillWater(){
        if(getWater() < 30) {
            water += 2;
            if(water > 30)water = 30;
            System.out.println("2 litros de água adicionados");
        } else System.out.println("A máquina já está cheia");
    }
    public void fillShampoo(){
        if(getShampoo() < 10){
            shampoo +=2;
            if(shampoo > 10)shampoo = 10;
            System.out.println("2 litros de shampoo adicionados");
        } else System.out.println("A máquina já está cheia");
    }

    public void placePet(Pet pet){
        if(!isMachineOccupied() && isMachineCleaned() && !pet.isPetCleaned()) {
            pet.setPetCleaned(false);
            setMachineOccupied(true);
            System.out.printf("%s colocado na máquina\n", pet.getName());
        } else if(isMachineOccupied()) System.out.printf("Tem um pet na máquina! É necessário retirar antes de colocar %s\n", pet.getName());
        else if(!isMachineCleaned()) System.out.printf("A máquina está suja! É necessário lavar antes de colocar o %s\n", pet.getName());
        else if(pet.isPetCleaned()) System.out.printf("O %s já está limpo! Não tem motivos para coloca-lo na máquina!",pet.getName());
    }
    public void removePet(Pet pet){
        if(isMachineOccupied()) {
            setMachineOccupied(false);
            System.out.printf("%s retirado da máquina, limpinho e cheiroso!", pet.getName());
            if(!pet.isPetCleaned()){
                System.out.printf("Será necessário limpar a máquina, o %s foi retirado sujo!", pet.getName());
                setMachineCleaned(false);
            }
        } else System.out.println("Não há nenhum pet na máquina");
    }
    public void cleanMachine(){
        if(getWater() >= 3 && getShampoo() >= 1 && !isMachineCleaned()) {
            water -= 3;
            shampoo -= 1;
            setMachineCleaned(true);
            System.out.println("Máquina limpa");
        } else if(isMachineCleaned())System.out.println("A máquina já está limpa");
        else if(getWater() < 3)System.out.println("A máquina não tem água suficiente");
        else if(getShampoo() < 1)System.out.println("A máquina não tem shampoo suficiente");
    }

}

/*
Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
Dar banho no pet;
Abastecer com água;
Abastecer com shampoo;
verificar nivel de água;
verificar nivel de shampoo;
verificar se tem pet no banho;
colocar pet na maquina;
retirar pet da máquina;
limpar maquina.
Siga as seguintes regras para implementação

A maquina de banho deve permitir somente 1 pet por vez;
Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;
*/
