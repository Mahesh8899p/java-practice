package inheritance;

public class boxweight extends box {
    double weight;

    public boxweight(){
        this.weight = -1;
    }
    public boxweight(double l,double w,double h, double weight){
        super(l,w,h);//super keyword is used here it is used to call the parent
        //parent class constructor class 
        this.weight = weight;
    }
}


