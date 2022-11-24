package Devices.class;


public class device {

	//class properties
    public  String brand;
    public  String model;
    public  String color;
    public int stock;
    

//////Custom default no argument constructor
 device() {}

//////////parameterized constructor
 device (String brand,String model,String color, int stock){

    this.brand = brand;
    this.model = model;
    this.color = color;
    this.stock = stock;
}


//////////////////////////// DEVICE FUNCTIONS & METHODS //////////////////////////////////

 //to change saatavuus
 public void stockStatus() {
	 stock = 1;
	}
 
//Device information printer
public void info() {
  
    
	System.out.println("Device information:"+"\n\n"+"Brand: "+brand+"\n"+"Model: "
		 	    		+model+"\n"+"Color: "+color);
	  
    if (stock>0) 
		{
    	System.out.println("Availability: In stock."+ "\n");
		}
    else 
        {
    	System.out.println( "Availability: Out of stock."+"\n");
        }
	}

public void setBrand(String brand) {
	this.brand=brand;
	
}

public void setModel(String model) {
this.model=model;	
}
		
}
