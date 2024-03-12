public class Inkyponky{
    public Inkyponky(String x){
        System.out.println(x);
    }
    public Inkyponky(String pinky,String blinky,String rinky){
        System.out.println(blinky+" "+pinky);
        System.out.println(pinky+" "+rinky);
        System.out.println(blinky+" "+pinky+" "+rinky);
    }
    public static void main(String[] args){
        String pinky = "Donky";
        Inkyponky ponky = new Inkyponky(pinky);

        String blinky = "Pinky";
        String rinky = "Monky";

        Inkyponky ponky2 = new Inkyponky(pinky,blinky,rinky);
    } 
    
}