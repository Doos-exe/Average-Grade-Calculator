import javax.swing.JOptionPane;

public class Student {
    public String Firstname;
    public String Lastname;
    public int age;
    private String nickname;
    private int[] quiz = new int[5];

    //Constructor to initialize the Firstname, Lastname, and age.
    public Student(){
        Firstname = " ";
        Lastname = " ";
        age = 0;
    }

    //Constructor to accept parameters for Firstname, Lastname, and age.
    public Student(String first, String last, int old){
        Firstname = first;
        Lastname = last;
        age = old;
    }

    //Accessor and Mutator for Nickname
    public String getNN(){
        return nickname;
    }
    public void setNN(String nickname){
        this.nickname = nickname;
    }

    //Accessor and Mutator for Quiz
    public int[] getquiz(){
        return quiz;
    }
    public void setquiz(int q1, int q2, int q3, int q4, int q5){
        this.quiz[0] = q1;
        this.quiz[1] = q2;
        this.quiz[2] = q3;
        this.quiz[3] = q4;
        this.quiz[4] = q5;
    }

    //Private method for displaying Firstname, Lastname, and age
    private void displayStudentNameAge(){
        JOptionPane.showMessageDialog(null, "First Name: " + Firstname + "\n" + "Last Name: " + Lastname + "\n" + "Age: " + age + "\n" + "Nickname: " + "'" + nickname + "'", "Student Information", JOptionPane.INFORMATION_MESSAGE);
    }

    //Private method for computing grade
    private void computeGrade(){
        int ave = 0;
        int grade = 0;
        for(int i : quiz){
            ave += i;
        }

        grade = ave / 5;
        JOptionPane.showMessageDialog(null, "Quiz 1 =" + quiz[0] + "\nQuiz 2 =" + quiz[1] + "\nQuiz 3 =" + quiz[2] + "\nQuiz 4 =" + quiz[3] + "\nQuiz 5 =" + quiz[4] + "\n\nAverage Grade for 5 Quizzes: " + grade , "Grade of " + Lastname, JOptionPane.INFORMATION_MESSAGE);
    }

    //Public method to display the information of student
    public void displayAllInformation(){
        this.displayStudentNameAge();
        this.computeGrade();
    }
}
