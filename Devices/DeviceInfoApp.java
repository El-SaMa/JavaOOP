package Devices;

public class DeviceInfoApp {
    
    public static void main(String[] args) {
        //Device ("brand","model", "color", inStock)
        device laptop = new device("Acer","Aspire","Silver", 100);
        laptop.info();
        laptop.stockStatus();
        
        device phone = new device("Apple","iPhone 13 Pro MAX","Midnight Black", 0);
        phone.info();
        phone.stockStatus();
        
        device tv = new device("Samsung","UHD 5520170P","Dark blue", 33);
        phone.info();
        tv.stockStatus();
        
        //change value
        laptop.setBrand("Dell");
        laptop.setModel("Inspiron");
        //output new values
        laptop.info();
   
    }
}

