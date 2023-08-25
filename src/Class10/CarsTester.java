package Class10;

public class CarsTester {
    public static void main(String[] args) {
        Phone luxuryObj = new Phone();
        luxuryObj.brand = "google";
        luxuryObj.model = "google chrome";
      luxuryObj.capacity = 250;


        Phone pixelObj = new Phone();
        pixelObj.brand = "apple";
        pixelObj.browser = "safari";
        pixelObj.IOS = "16.1.6";
        pixelObj.model = "13 pro max";
        pixelObj.capacity = 256;
        pixelObj.color();
        pixelObj.camera();
        pixelObj.usage();

        Phone samsungObj = new Phone();
        samsungObj.brand = "Samsung";
        samsungObj.browser = "firefox";
        samsungObj.IOS = "20";
        samsungObj.model = "A23";
        samsungObj.capacity = 350;
        samsungObj.color();
        samsungObj.camera();
        samsungObj.usage();
    }
}