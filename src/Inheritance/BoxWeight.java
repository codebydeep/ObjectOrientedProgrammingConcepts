package Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l , double h , double w , double weight){
        super(l, h, w); // What is this? Call the parent class Constructor.
        // Used to initialise values present in Parent class.

//        System.out.println(super.weight);
          this.weight = weight;
    }
}
