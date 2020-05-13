public class Classroom {

    public static void main(String[] args){

        wilder JeanClaude = new wilder("Jean Claude", true);
        System.out.println(JeanClaude.whoAmI());
        wilder Henri = new wilder("Henri", false);
        Henri.setAware(false);
        System.out.println(Henri.whoAmI());
    }
}

