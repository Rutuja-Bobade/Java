public class Displacement {
    public static float getShortestPath(String path){
        int x = 0 , y =0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if (dir == 'N'){
                y++;
            }
            else if (dir == 'W'){
                x--;
            }
            else {
                x++;
            }
        }
        return (float)Math.sqrt(y*y +x*x);
    }
    public static void main(String[] args){
        String path = "WNEENESENNN";
        getShortestPath(path);
        System.out.println(getShortestPath(path));
    }
}
