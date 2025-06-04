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