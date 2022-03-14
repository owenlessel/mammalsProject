public class Cat extends Mammals {
    protected String name;
    protected String breed;

    public Cat(){
        super();
        this.name="Carl";
        this.breed="Tabby";
    }

    public Cat(String name, String breed, boolean hasBackbone, boolean producesMilk, String hairColor,
    double bodyTempF,
    int numLegs,
    boolean liveBirth){
        this.name = name;
        this.breed = breed;
        this.hasBackbone = hasBackbone;
        this.producesMilk = producesMilk;
        this.hairColor = hairColor;
        this.bodyTempF = bodyTempF;
        this.numLegs = numLegs;
        this.liveBirth = liveBirth;
    }

    public String toString() {
        String report = "";
        report = this.hasBackbone + " " + this.producesMilk + " " + this.hairColor + " " + this.bodyTempF + " "
                + numLegs + " " + liveBirth + " " + this.name + " " + this.breed;

        return report;
    }
    public void talk(){
        String sounds="Meow" + " " + "Hiss" + " " + "Purr";
        System.out.println(sounds);
    }
}
