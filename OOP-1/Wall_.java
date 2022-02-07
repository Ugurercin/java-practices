public class Wall_ {
    private double width;
    private double height;

    public Wall_() {

    }

    public Wall_(double width, double height) {
        if(width < 0 ) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public void getArea() {
        System.out.println("Area : " + this.width * this.height);
    }
}
