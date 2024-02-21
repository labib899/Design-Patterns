public class Triangle extends Shape {
    public int height;
    public int ground;

    public Triangle(){
    }

    public Triangle(Triangle target){
        super(target);
        if(target!=null){
            this.height = target.height;
            this.ground = target.ground;
        }
    }

    @Override
    public Shape clone(){
        return new Triangle(this);
    }

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Triangle) || !super.equals(object2)) return false;
        Triangle shape2 = (Triangle) object2;
        return shape2.height == height&&shape2.ground==ground;
    }
}
