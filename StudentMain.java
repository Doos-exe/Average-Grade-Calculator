import javax.swing.JOptionPane;

public class StudentMain {
    public static void main(String[] args){
        Student s1 = new Student("Deux Marq", "Marquez", 19);
        s1.setNN("Doos");
        String s1_quiz = JOptionPane.showInputDialog("Enter scores separated by spaces (There were 5 quizzes): ", "Enter your scores mr/ms " + s1.Lastname);
        String[] s1_Array = s1_quiz.split(" ");
        int[] s1_grade = new int[5];
        for(int i = 0; i<5; i++){
            s1_grade[i] = Integer.valueOf(s1_Array[i]);
        }
        s1.setquiz(s1_grade[0], s1_grade[1], s1_grade[2], s1_grade[3], s1_grade[4]);
        s1.displayAllInformation();
        
        Student s2 = new Student("Arold", "Ocariza", 20);
        s2.setNN("Rold");
        String s2_quiz = JOptionPane.showInputDialog("Enter scores separated by spaces (There were 5 quizzes): ", "Enter your scores mr/ms " + s2.Lastname);
        String[] s2_Array = s2_quiz.split(" ");
        int[] s2_grade = new int[5];
        for(int i = 0; i<5; i++){
            s2_grade[i] = Integer.valueOf(s2_Array[i]);
        }
        s2.setquiz(s2_grade[0], s2_grade[1], s2_grade[2], s2_grade[3], s2_grade[4]);
        s2.displayAllInformation();


        //For student input
        int count = 3;
        while(count > 0){
            int again = JOptionPane.showConfirmDialog(null, "Do you want to input data?");
            if(again == JOptionPane.YES_OPTION){
                String Firstname = JOptionPane.showInputDialog("Enter your First Name: ");
                String Lastname = JOptionPane.showInputDialog("Enter your Last Name: ");
                int Age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age: "));

                int confirm = JOptionPane.showConfirmDialog(null, "Your name is " + Firstname + " " + Lastname + ", age " + Age + "?");
                if(confirm == JOptionPane.YES_OPTION){
                    Student ss = new Student(Firstname, Lastname, Age);
                    String Nickname = JOptionPane.showInputDialog("Enter your Nickname: ");
                    ss.setNN(Nickname);

                    String quizzes = JOptionPane.showInputDialog("Enter scores separated by spaces (There were 5 quizzes): ");
                    String[] Array = quizzes.split(" ");
                    int[] grade = new int[5];

                    for(int i = 0; i<5; i++){
                    grade[i] = Integer.valueOf(Array[i]);
                    }
                    ss.setquiz(grade[0], grade[1], grade[2], grade[3], grade[4]);

                    ss.displayAllInformation();
                }
            
                else{
                    JOptionPane.showMessageDialog(null, "Please try again", "ERROR!",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Thank you for using the program", "THANK YOU!",JOptionPane.INFORMATION_MESSAGE);
                count = 0;
            }
        }  
    }
}
