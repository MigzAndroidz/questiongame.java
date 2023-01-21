import java.util.Scanner;
    public class QuestionGame {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int answerCounter = 0;
            String questionBank[][]={{"What's your name?" , "Miguel"}, {"How old are you?" , "16"}, {"Name of my dog?" , "Kobe"}, {"Name of my girlfriend", "Janelle"}, {"Favorite color of mine?", "Bluegreen"}};
            String answerBank[]= new String[questionBank.length];

                for(int pointer=0; pointer<answerBank.length; pointer++){
                    System.out.println(questionBank[pointer] [0]);
                    answerBank[pointer]= sc.nextLine();
                    if(questionBank[pointer][1].equalsIgnoreCase(answerBank[pointer])){
                        answerCounter ++;
                        System.out.println("Goodjob!");                   
                    }
                    System.out.println("Score: "+answerCounter);
                }
            }
        

    }
