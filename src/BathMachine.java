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


    public void giveBath(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina primeiro para dar banho");
            return;
        }

        if(getWater() >= 10 && getShampoo() >= 2){
            this.water -=10;
            this.shampoo -=2;
            this.pet.setPetCleaned(true);
            System.out.printf("Banho realizado, o %s está limpo agora\n", this.pet.getName());
            return;
        }

        System.out.println("Está faltando água ou shampoo, olhe seu estoque");
    }

    public void fillWater(){
            this.water += 2;

            if(this.water >= 30){
                this.water = 30;
                System.out.println("O tanque de água está cheio!");
                return;
            }

            System.out.println("2 litros de água adicionados");
    }

    public void fillShampoo(){
        this.shampoo += 2;

        if(getShampoo() >= 10){
            this.shampoo = 10;
            System.out.println("O tanque de shampoo está cheio!");
            return;
        }

        System.out.println("2 litros de shampo adicionados");
    }

    public void placePet(){
        if(this.pet == null ){
            System.out.println("Insira o nome do pet:");
            String nomePet = sc.n
        }
        if(!isMachineOccupied() && isMachineCleaned() && !pet.isPetCleaned()) {
            pet.setPetCleaned(false);
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