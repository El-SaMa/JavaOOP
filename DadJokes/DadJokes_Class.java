class DadJoke{


    //joke class attributes
    public String joke;
    public  String punchline;
    
    //Default constructor
    public DadJoke() {
    	joke = "";
    	punchline ="";
    }
    
    
       //parameterized constructor
    public DadJoke ( String joke, String punchline)  {
    	
        this.joke = joke;
        this.punchline = punchline;    
   } 


   //method to print the joke with delay
    public void tellJoke() throws InterruptedException{
    	System.out.println(joke ); 
    	Thread.sleep(4000);
    	System.out.println(punchline + "\n");
    	Thread.sleep(5000);
    }   
}