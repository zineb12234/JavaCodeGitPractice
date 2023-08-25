package Class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone zinebObj = new Phone();
        zinebObj.brand = "google";
        zinebObj.browser = "google chrome";
        zinebObj.IOS = "13";
        zinebObj.model = "Pixel7";
        zinebObj.capacity = 250;
        zinebObj.color();
        zinebObj.camera();
        zinebObj.usage();

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