public class Interface {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.move();
    }
}

interface  Chess{
    void  move();
}

class Queen implements Chess{
    public void move(){
        System.out.println("Right , Left , up , down , Diagonally");
    }
}

class Rook implements Chess{
    public void move(){
        System.out.println("Right , Left , Up , Down");
    }
}