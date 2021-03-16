package animals;

public abstract class Canine {

    protected final String size;
    protected final String commonName;
    protected final String subSpecies;
    protected final String sound;

    public Canine(String size, String commonName, String subSpecies, String sound) {
        this.size = size;
        this.commonName = commonName;
        this.subSpecies = subSpecies;
        this.sound = sound;
    }
}
