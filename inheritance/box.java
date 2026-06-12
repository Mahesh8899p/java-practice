package inheritance;

public class box{
    double l;
    double h;
    double w;

    box(){
        this.h = -1;
        this.l = -1;
        this. w = -1;
    }
    box(double side){
        this.w =side;
        this.l =side;
        this.h = side; 
    }
    box(double l,double h,double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }
}