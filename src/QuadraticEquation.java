import java.util.Scanner;

public class QuadraticEquation {
double a;
double b;
double c;
QuadraticEquation(double a,double b,double c){
    this.a=a;
    this.b=b;
    this.c=c;

    }
    public double getA(){
    return this.a;
    }
    public double getB(){
    return this.b;
    }
    public double getC(){
    return this.c;
    }
    public void setA(){
    this.a=a;
    }
    public void setB(){
    this.b=b;
    }
    public void setC(){
    this.c=c;
    }
    public double getDiscriminant(){
    double Discriminant=this.b*this.b-4*this.a*this.c;
            return Discriminant;
    }
    public double getRoot1(){
    double getRoot1=-this.b+Math.pow(this.getDiscriminant(),0.5)/2*this.a;
    return getRoot1;

    }
    public double getRoot2(){
    double getRoot2=-this.b-Math.pow(this.getDiscriminant(),0.5)/2*this.a;
    return getRoot2;
    }



}

