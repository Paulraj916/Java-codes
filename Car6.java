public class Car6 {
    
    private String make;
    private String model;
    private int year;
    
    Car6(String make,String model,int year){
        this.setMake(make);
        this.model=model;
        this.year=year;
    }
    public String getMake(){
        return make;

    }
    public String getModel(){
        return model;
        
    }
    public int getyear(){
        return year;
        
    }
    public void setMake(String make){
        this.make =make;
        
    }
    public void setModel(String model){
        this.model=model;
        
    }
    public void setyear(int year){
        this.year=year;
        
    }
}
