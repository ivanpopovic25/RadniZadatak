public class RadnikPoDanu extends Radnik {

    private double brojDana, cenaPoDanu;

    public RadnikPoDanu(String ime, String prezime, String jmbg, String racun, double cenaPoDanu, double brojDana) {
        super(ime, prezime, jmbg, racun);
        this.brojDana = brojDana;
        this.cenaPoDanu = cenaPoDanu;
        
    }

    private double obracunajPlatu(){
        return cenaPoDanu * brojDana;
    }

    @Override

    public void isplatiPlatu(){
        plata = obracunajPlatu();
        super.isplatiPlatu();
    }

    
}
