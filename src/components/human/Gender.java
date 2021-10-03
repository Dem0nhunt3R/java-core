package components.human;

public enum Gender {
    MALE(true),
    FEMALE(false);
    private boolean pipka;

    Gender (boolean pipka){
        this.pipka=pipka;
    }

    public boolean isPipka(){
        return pipka;
    }

    public void setPipka(boolean pipka){
        this.pipka=pipka;
    }
}
