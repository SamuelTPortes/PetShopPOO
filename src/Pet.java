public class Pet {
    private final String name;
    private boolean petCleaned = false;

    public Pet(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isPetCleaned() {
        return petCleaned;
    }

    public void setPetCleaned(boolean petCleaned) {
        this.petCleaned = petCleaned;
    }
}
