
public class maingyakorlas {
    public static void main(String[] args) {

        //
        animal pok=new animal("pok");

        //kiiratása az animalnak.
        pok.printAnimal();

        animal macsek=new animal(4,2,"macska");
        macsek.printAnimal();

        pok.setNumberOfEyes(8);
        pok.printAnimal();

        pok.setNumberOfLegs(6);
        pok.printAnimal();
    }
}
