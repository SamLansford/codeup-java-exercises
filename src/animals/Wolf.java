package animals;

public class Wolf extends Canine{
    private final boolean isEndangered;
    private final String nativeArea;
    public Wolf(String sound, String size, String subSpecies, String commonName, boolean isEndangered, String nativeArea) {
        super(size, sound, commonName, subSpecies);
        this.isEndangered = isEndangered;
        this.nativeArea = nativeArea;
    }
    public void makeSound() {
        System.out.println(sound + "\n");
    }
    public void printDelimiter(){
        System.out.println("****************************");
    }
    public void printSubSpecies(){
        System.out.printf("Sub-Species: %s\n", this.subSpecies);
    }
    public void printCommonName(){
        System.out.printf("Common Name: %s\n", this.commonName);
    }
    public void printSize(){
        System.out.printf("Size: %s\n", this.size);
    }
    public void printEndangeredStatus(){
        System.out.printf("Endangered: %s\n", getEndangeredStatus());
    }
    public void printNativeArea(){
        System.out.printf("Native Area: %s\n\n", this.nativeArea);
    }
    public void printDetails(){
        makeSound();
        printDelimiter();
        printSubSpecies();
        printCommonName();
        printNativeArea();
        printSize();
        printEndangeredStatus();
        printDelimiter();
    }
    private String getEndangeredStatus(){
        if (isEndangered){
            return "No";
        }else{
            return "Yes";
        }
    }
}