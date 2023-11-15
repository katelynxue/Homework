public class Conditionals{
    int randomInt;
    public static void main(String[] args) {
        Conditionals MagicEightBall= new Conditionals();
    }
    public Conditionals(){
        String question;
        question = "is pasta yummy?";
        System.out.println(question);
        randomInt = (int)(Math.random()*9);
        MagicEightBall();
    }
    public void MagicEightBall(){
        if(randomInt<=1){
            System.out.println("highly likly, but still not sure :)");
        }
        else if(randomInt<=2){
            System.out.println("never doubt for a second (p.s that means yes)");
        }
        else if(randomInt<=3){
            System.out.println("you even need to ask? YES");
        }
        else if(randomInt<=4){
            System.out.println("if thats what you want, then no");
        }
        else if(randomInt<=5){
            System.out.println("how about no");
        }
        else if(randomInt<=6){
            System.out.println("heck YAH");
        }
        else if(randomInt<=7){
            System.out.println("if you insist");
        }
        else if(randomInt<=8){
            System.out.println("no.");
        }
    }
}
