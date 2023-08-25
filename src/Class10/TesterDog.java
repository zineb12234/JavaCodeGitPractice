package Class10;
public class TesterDog{
    public static void main(String[] args) {
    //creating an obj from the dog class
    dog lunasObj=new dog();
    lunasObj.name="Luna";
    lunasObj.gender="F";
    lunasObj.breed="shiba";
    lunasObj.weight=10;
    lunasObj.age=20;
        System.out.println(lunasObj.name);
        System.out.println(lunasObj.age);
        System.out.println(lunasObj.breed);
        // we are calling the bark methode on lunasobj
    lunasObj.bark();
    lunasObj.eat();
    lunasObj.sleep();

}
}

