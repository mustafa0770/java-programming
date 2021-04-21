package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 55;
        if(score >= 1 && score <= 39){
            System.out.println("ScoreRangeTest: D");
        } else if (score >= 40 && score <= 59){
            System.out.println("ScoreRangeTest: C");
        } else if (score >= 60 && score <= 89){
            System.out.println("ScoreRangeTest: B");
        } else if (score >= 90 && score <= 100){
            System.out.println("ScoreRangeTest: A");
        } else if (score <= 0 || score > 100){
            System.out.println("ScoreRangeTest: Invalid Score! "+score);
        }
        //else if (score <= 0 || score > 100){
    }
}