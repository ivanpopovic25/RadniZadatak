public class Radnik {

    protected String ime, prezime, jmbg, racun;
    protected double plata;
    public Radnik(String ime, String prezime, String jmbg, String racun) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.racun = racun;
        
    }

    public void isplatiPlatu(){

        System.out.println("Ime "+ ime + "Prezime " + prezime + "Na racun " + racun + "Isplaceno je " + plata);

    
    
}
}
