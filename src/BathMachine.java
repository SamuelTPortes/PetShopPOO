public class BathMachine {
    private boolean petOnMachine = false;
    private int water = 30;
    private int shampoo = 10;

    public boolean isPetOnMachine() {
        return petOnMachine;
    }

    public void setPetOnMachine(boolean petOnMachine) {
        this.petOnMachine = petOnMachine;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void giveBath(){

    }
    public void fillWater(){
        water +=2;
    }
    public void fillShampoo(){
        shampoo +=2;
    }
    public void placePet(){
        if(!isPetOnMachine())
            setPetOnMachine(true);
        else
            setPetOnMachine(false);
    };
    public void removePet(){};
    public void cleanMachine(){};

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
