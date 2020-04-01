import javax.swing.JOptionPane; 
public class StudentTest{
    public static void main(String[] args){
        Student aluno1 = new Student("Jane Green", 93.5);
        Student aluno2 = new Student("John Blue", 72.75);

        String text1 = String.format("%s obteve letra ' %s ' de nota! ", aluno1.getName(), aluno1.getLetraNota());
        String text2 = String.format("%s obteve letra ' %s ' de nota! ", aluno2.getName(), aluno2.getLetraNota());

        JOptionPane.showMessageDialog(null, text1);
        JOptionPane.showMessageDialog(null, text2);

    }
}