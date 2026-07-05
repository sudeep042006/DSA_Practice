public class _03shortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNNN";
        double shortestPath = calcShortPath(path);
        System.out.print(shortestPath);
    }

    public static Double calcShortPath(String s){
        int x = 0; 
        int y = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'W'){
                x--;
            }
            else if(s.charAt(i) == 'E'){
                x++;
            }
            else if(s.charAt(i) == 'N'){
                y++;
            }
            else if(s.charAt(i) == 'S'){
                y--;
            }
            
        }
        double shortestPath = Math.sqrt((x*x + y*y));
        return shortestPath;

    }
}
