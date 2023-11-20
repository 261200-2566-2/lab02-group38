import java.util.ArrayList;
import java.util.HashMap;

public class AirPurifier {
    enum Mode {        // enum ใช้ สำหรับ Class AirPurifier เท่านั้น
        OFF,
        SLEEP,
        NORMAL,
        TURBO,

    }
    enum FanLevel {    // enum ใช้ สำหรับ Class AirPurifier เท่านั้น
        OFF,
        LOW,
        MEDIUM,
        HIGH
    }
    String model;   // ต้องเป็น instance variables เนื่องจาก ถ้าหากจะเป็น AirPurifier ได้ต้องมีชื่อ model
    String serialNo; // ต้องเป็น instance variables เนื่องจาก ถ้าหากจะเป็น AirPurifier ได้ต้องมี serialNo
    boolean power; // ต้องเป็น instance variables เนื่องจาก ถ้าหากจะเป็น AirPurifier ได้ต้องมี power ว่าเปิดหรือปิดอยู่

    Mode mode; // ต้องเป็น instance variables เนื่องจาก ถ้าหากจะเป็น AirPurifier ได้ต้องมี mode ว่า mode อะไร

    FanLevel fanSpeed; // ต้องเป็น instance variables เนื่องจาก ถ้าหากจะเป็น AirPurifier ได้ต้องมี fanSpeed ว่า fanSpeed เท่าไหร่

    double price;  //  ต้องเป็น instance variables เนื่องจาก ถ้าหากจะเป็น AirPurifier ได้ต้องมี price ว่า model นี้ราคาเท่าไหร่
    int pm;  //  ต้องเป็น instance variables เนื่องจาก ถ้าหากจะเป็น AirPurifier ได้ต้องมี pm ว่า pm ที่วัดได้เป็นเท่าไหร่
    private static final HashMap<String, Integer> modelCount = new HashMap<>();  // ต้องเป็น class variable เนื่องจากต้องให้ Class เป็นคนเก็บข้อมูลของ Instance และ ทำให้ Instance แต่ละตัว เรียกใช้ข้อมูลใน class variable นี้ร่วมกันได้

    void turnOn() {
        if(!power) {
            power = true;
            mode = Mode.NORMAL;
            fanSpeed = FanLevel.MEDIUM;
        }
    }

    void turnOff() {
        if(power){
            power = false;
            mode = Mode.OFF;
            fanSpeed = FanLevel.OFF;
        }
    }

    void setMode(Mode mode){
        if(power){
            this.mode = mode;
        }
    }

    void setFanSpeed(FanLevel fanSpeed){
        if(power){
            this.fanSpeed = fanSpeed;
        }
    }
    int getPMLevel() {
        if(power) {
            return pm;
        }
        return -1;
    }
    AirPurifier(String model, String serialNo , double price) {
        this.model = model;
        this.serialNo = serialNo;
        this.price = price;
        modelCount.put(model, modelCount.getOrDefault(model, 0) + 1);
    }

    public static ArrayList<String> mostPopularModel() {  // class method เนื่องจาก class method สามารถเข้าถึงและจัดการ class variable ได้
        int maxCount = 0;
        ArrayList<String> mostPopularModels = new ArrayList<>();

        for (String model : modelCount.keySet()) {
            int count = modelCount.get(model);
            if (count >= maxCount) {
                maxCount = count;
                mostPopularModels.add(model);
            }
        }

        return mostPopularModels;
    }
}