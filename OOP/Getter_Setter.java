public class Getter_Setter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.set_color("Blue");
        System.out.println(p1.getColor());
    }
}

class Pen{
    private String color;
    
    void set_color(String newColor){
        this.color= newColor;
    }
    
    String getColor(){
        return this.color;
    }
}