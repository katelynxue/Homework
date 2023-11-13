public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();

    }

    public Loops(){
        System.out.println("thanks Leah");
        for(int x=1; x<11;x=x+1){
         System.out.print(x+"");
        }
        System.out.println();
        countUp();
        System.out.println();
        countbyThrees();
        System.out.println();
        countdown();
    }

    public void countUp(){
        for (int x = 1; x<6; x=x+1){
            System.out.println(x);
        }
    }

    public void countbyThrees(){
        for(int x=3; x<16; x=x+3){
            System.out.print(x+" ");
        }
    }
    public void countdown(){
        for(int x=10;x>0;x=x-1){
            System.out.print(x+",");
        }
        System.out.println("Happy Loop Year");
    }

}
