public class RadnikPoSatu extends Radnik {

    private double brojSati, cenaPoSatu;

    public RadnikPoSatu(String ime, String prezime, String jmbg, String racun, double cenaPoSatu, double brojSati) {
        super(ime, prezime, jmbg, racun);
        this.brojSati = brojSati;
        this.cenaPoSatu = cenaPoSatu;
        
    }

    private double obracunajPlatu(){
        return cenaPoSatu * brojSati;
    }

    @Override
    public void isplatiPlatu(){
plata = obracunajPlatu();
        super.isplatiPlatu();


    }
    
}
