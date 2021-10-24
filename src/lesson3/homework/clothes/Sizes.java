package lesson3.homework.clothes;


public enum Sizes {
    XXS(),XS(),S(),M(),L();
    private int euroSize;

    public void getDescription(){
        System.out.println("Description");
    }

    Sizes() {

    }

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "Sizes{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }
}
