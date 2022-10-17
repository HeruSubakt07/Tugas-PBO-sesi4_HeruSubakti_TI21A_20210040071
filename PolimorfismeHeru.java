abstract class ClubBola{  
    protected void NamaClub() {
        System.out.println("_____________________");
    }
}
public class PolimorfismeHeru {
    public static void main (String[] args) {
        ClubBola Persib = new Persib();
        Persib.NamaClub();
        ClubBola Persija = new Persija();
        Persija.NamaClub();
}

}