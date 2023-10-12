public class animal {
    int numberOfLegs;
    int numberOfEyes;
    String name;

    //csak a nevet adom meg.
    public animal(String name){
        this.name=name;
    }
    public animal(int numberOfLegs,int numberOfEyes,String name){
        this.numberOfLegs=numberOfLegs;
        this.numberOfEyes=numberOfEyes;
        this.name=name;
    }

    public void printAnimal(){
        System.out.println("lábak száma: " + numberOfLegs);
        System.out.println(numberOfEyes);
        System.out.println(name);
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
