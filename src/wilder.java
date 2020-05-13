public class wilder {

    private String firstname;
    private boolean aware;

    public wilder(String firstname) {

        this.firstname = firstname;
        this.aware = true;
    }

    public wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = true;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public Boolean isAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {

        if (this.isAware()) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }
}



