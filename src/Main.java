public class Main {
    public static void main(String[] args) throws Exception {
        
        RadnikFiksno radnikFiksno = new RadnikFiksno("Pera", "Peric", "5252623", "56362", 10000);
        RadnikPoDanu radnikPoDanu = new RadnikPoDanu("Marko", "Markovic", "65656565", "656565", 5000, 20);
        RadnikPoSatu radnikPoSatu = new RadnikPoSatu("mirko", "Mirkkic", "5665656", "65656", 5000, 20);

        // radnikFiksno.isplatiPlatu();
        // radnikPoDanu.isplatiPlatu();
        // radnikPoSatu.isplatiPlatu();

        Radnik nizRadnika[] = {radnikFiksno, radnikPoDanu, radnikPoSatu};

        for (int i = 0; i < nizRadnika.length; i++) {
            nizRadnika[i].isplatiPlatu();
            
        }
    }
}
