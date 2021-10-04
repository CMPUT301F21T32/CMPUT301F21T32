class Circle extends Shape{

    int x;
    int y;

    public Circle(int newx, int newy){
        x=newx;
        y=newy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}