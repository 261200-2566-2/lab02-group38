// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Lab02 {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////
        /////////////////////////Class MethodTest//////////////////////////
        ///////////////////////////////////////////////////////////////////
       new AirPurifier("xiaomi","555",50000);
       new AirPurifier("xiaomi","555",50000);
       new AirPurifier("sharp","555",50000);
       new AirPurifier("dyson","555",50000);
       System.out.println(AirPurifier.mostPopularModel()); // return xiaomi
       new AirPurifier("dyson","555",50000);
       System.out.println(AirPurifier.mostPopularModel()); // return [xiaomi,dyson] if count xiaomi == dyson

        ///////////////////////////////////////////////////////////////////
        ///////////////////////Instance MethodTest/////////////////////////
        ///////////////////////////////////////////////////////////////////
        AirPurifier test = new AirPurifier("test","555",50000);
        test.turnOn();
        System.out.println("power = " + test.power);
        System.out.println("mode = " + test.mode);
        System.out.println("fanSpeed = " + test.fanSpeed);
        test.turnOff();
        System.out.println("power = " + test.power);
        System.out.println("mode = " + test.mode);
        System.out.println("fanSpeed = " + test.fanSpeed);

        test.setMode(AirPurifier.Mode.TURBO);
        System.out.println("mode = " + test.mode);
        System.out.println(test.getPMLevel());

    }
}
