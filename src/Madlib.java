public class Madlib {
    public String classmate;
    public String city;
    public String noun;
    public String adjective;
    public String pluralNoun;
    public String pluralAnimal;
    public boolean trueOrFalse;
    public float decimalBiggerThan1;
    public int number1;
    public int wholeNumberBetween1And4;
    public int number2;
    public String miltonTeacher;
    public String miltonDean;
    public char letterGrade;
    public String season;

    public static void main(String[] args) {
        System.out.println("hello world");
        Madlib myStory = new Madlib();
    }
public Madlib(){
    classmate = "carmelle";
    city = "boston";
    noun = "dog";
    adjective = "fluffy";
    pluralNoun = "spoons";
    pluralAnimal = "cats";
    trueOrFalse = true;
    decimalBiggerThan1 = 13.43f;
    number1 = 1;
    wholeNumberBetween1And4 = 3;
    number2 = 2;
    miltonTeacher = "Mr lou";
    miltonDean = "Dr Palmer";
    letterGrade = 'A';
    season = "fall";

    //define a string called story for mad lib
    String story = "This weekend I am going camping with "
            +classmate+ ". We are going to a campsite in "
            +city+ ". I packed my "+noun+ " and "
            +pluralNoun + ".  The forecast is calling for a high of "
            +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
            +adjective+" day! This year, the park rangers have seen "
            +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
            +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
            +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
            +miltonDean+ " said it actually has only happened "
            + number2+" times. Wish us luck! If we survive, we will earn a "
            +letterGrade+ "- in P.E. class. " +classmate+ " said we should go home, but my "+noun+" wants to stay. "
            +noun+ " likes to eat " +pluralAnimal+ "'s, so I have to stop him. "
            +trueOrFalse+", I do like him, even though he eats " +pluralAnimal+ ". only "
            +number2+ " more days until we leave!";

//now print story to the dos window
    System.out.println(story);

}

}
