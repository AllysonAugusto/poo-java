package Pet;

import java.util.Scanner;
class Pet{
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, clean;
    private int diamonds;
    private int age;
    private boolean alive;
    // Atribui o valor de energia
    // Se o valor ficar abaixo de 0, o pet morre de fraqueza
    // Garanta que os valores ficarão no interalo 0 - max
    // Use esse modelo para fazer os outros métodos set
    public void setEnergy(int value){
        if(value <= 0){
            this.energy = 0;
            System.out.println("fail: pet morreu de fraqueza");
            this.alive = false;
        }
        else if(value > this.energyMax){
            this.energy = this.energyMax;
        }
        else{
            this.energy = value;
        }
    }
    public void setHungry(int value){
        if(value <= 0){
            this.hungry = 0;
            System.out.println("fail: pet morreu de fome");
            this.alive = false;
        }
        else if(value > this.hungryMax){
            this.hungry = this.hungryMax;
        }
        else{
            this.hungry = value;
        }
    }
    public void setClean(int value){
        if(value <= 0){
            this.clean = 0;
            System.out.println("fail: pet morreu de sujeira");
            this.alive = false;
        }
        else if(value > this.cleanMax){
            this.clean = this.cleanMax;
        }
        else{
            this.clean = value;
        }
    }
    public Pet(int energy, int hungry, int clean){
        this.energy = energy;
        this.hungry = hungry;
        this.clean = clean;
        this.energyMax = energy;
        this.cleanMax = clean;
        this.hungryMax = hungry;
        this.age = 0;
        this.diamonds = 0;
        this.alive = true;

    }
    public String toString(){
        return "E:"+this.energy+"/"+this.energyMax+", S:"+this.hungry+"/"+this.hungryMax+", L:"+this.clean+"/"+this.cleanMax+", D:"+this.diamonds+", I:"+this.age;
    }
    private boolean testAlive(){
        if (alive == true){
            return true;
        }else{
            System.out.println("fail: pet esta morto");
            return false;
        }
    // Invoca o método testAlive para verificar se o pet esta vivo
    // Se estiver vivo, altere os atributos utilizando os métodos set e get
    }
   public void play(){
        if(!testAlive()){
                return;
        }
            setEnergy(getEnergy() - 2);
            setHungry(getHungry() - 1);
            setClean(getClean() - 3);
            diamonds += 1;
            age += 1;   
        
            
    }
    public void shower(){
      if(!testAlive()){ 
            return;
        }
        setEnergy(getEnergy() - 3);
        setHungry(getHungry() - 1);
        setClean(getCleanMax());
        diamonds += 0;
        age += 2;
    };
    public void eat(){
      if(!testAlive()){ 

            return;
        }
        setEnergy(getEnergy() - 1);
        setHungry(getHungry() + 4);
        setClean(getClean() - 2);
        diamonds += 0;
        age += 1;
    };
    public void sleep(){
      if(!testAlive()){ 
            return;
        } 
      if (energy == energyMax - 5){
          setHungry(getHungry() - 1);
          setEnergy(getEnergyMax());
          diamonds += 0;
          setClean(getClean() +0);
          age += 5;
        } else {
          System.out.println("fail: nao esta com sono");
        }
    }
    //Métodos GET
    int getClean(){
        return this.clean;
    }
    int getHungry(){
        return this.hungry;
    }
    int getEnergy(){
        return this.energy;
    }
    int getEnergyMax(){
        return this.energyMax;
    }
    int getCleanMax(){
        return this.cleanMax;
    }
    int getHungryMax(){
        return this.hungryMax;
    }
}