package suzu_code.simplequiz;

/**
 * Created by Ryohei on 29/10/2017.
 */

public class Questions {

    // 1. Questions Text
    public String mQuestions[] = {
            "Which is the first planet in the Solar system?",
            "Which is the second planet in the Solar system?",
            "Which is the third planet in the Solar system?",
            "Which is the fourth planet in the Solar system?",
            "Which is the fifth planet in the Solar system?",
            "Which is the sixth planet in the Solar system?",
            "Which is the seventh planet in the Solar system?",
            "Which is the eighth planet in the Solar system?",
            "Which is the ninth planet in the Solar system?"
    };

    // 2. Answer Options
    private String mChoices[][] = {
            {"Mercury", "Venus", "Mars", "Saturn"},
            {"Jupiter", "Venus", "Earth", "Neptune"},
            {"Earth", "Jupiter", "Pluto", "Venus"},
            {"Jupiter", "Saturn", "Mars", "Earth"},
            {"Jupiter", "Pluto", "Mercury", "Earth"},
            {"Uranus", "Venus", "Mars", "Saturn"},
            {"Saturn", "Pluto", "Uranus", "Earth"},
            {"Venus", "Neptune", "Pluto", "Mars"},
            {"Mercury", "Venus", "Mars", "Pluto"}
    };

    // 3. Correct Answers
    private String mCorrectAnswers[] = {
            "Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
            "Neptune",
            "Pluto"
    };

    // Show Questions
    public String getQuestions(int a){
      String question = mQuestions[a];
      return question;
    }

    // Show Answer Options
    public String getChoices1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoices2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoices3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoices4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    // Show Correct Answers
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
