import java.util.Scanner;
    public class QuestionGame {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int answerCounter = 0;
            String questionBank[][]={{"What's your name?" , "Miguel"}, {"How old are you?" , "16"}, {"Name of my dog?" , "Kobe"}, {"Name of my girlfriend", "Janelle"}, {"Favorite color of mine?", "Bluegreen"}};
            String answerBank[]= new String[questionBank.length];
            for(int ans = 0; ans<questionBank.length; ans++){
                System.out.println("questionBank[ans] [0]");
                answerBank[ans]= sc.nextLine();

                for(int pointer=0; pointer<answerBank.length; pointer++){
                    if(questionBank[pointer][1].equalsIgnoreCase(answerBank[pointer])){
                        answerCounter ++;
                        System.out.println("Goodjob!");                   
                    }
                    System.out.println("answerCounter");
                }
            }
        }

    }
