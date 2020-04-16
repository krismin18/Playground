class MyModel1 {
    int camPix = 2;
    int dSize = 5;
    
    public MyModel1() {
    	System.out.println("Features of MyModel 1");
        System.out.println("Camera mega pixels: "+camPix);
    }
}
class MyModel2 extends MyModel1 {
	int camPix = 5;
    String lock = "Fingerprint";
        
    public MyModel2(){
    	System.out.println("Features of MyModel 2");
    	System.out.println("Camera mega pixels: "+camPix);
    	System.out.println("Lock mechanism: "+lock);
    	System.out.println("Display size: "+dSize);
    }
}
class MyModel2T extends MyModel2
{
	int camPix = 16;
	int dSize = 6;
    
    public MyModel2T(){
    	System.out.println("Features of MyModel 2T");
    	System.out.println("Camera mega pixels: "+camPix);
    	System.out.println("Lock mechanism: "+lock);
    	System.out.println("Display size: "+dSize);
    } 
}
public class Main 
{
    public static void main(String[] args) 
    {
    	MyModel2T mobile = new MyModel2T();
    }
}