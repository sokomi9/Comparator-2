import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
    int marks;
    String name;
    public Students(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Students [marks=" + marks + ", name=" + name + "]";
    }

}
public class index {

    public static void main(String[] args) {
        Comparator<Students> comparator = (x, y) -> x.marks>y.marks?1:-1;
        
        List<Students> students = new ArrayList<>();
        students.add(new Students(70, "Caleb"));
        students.add(new Students(40, "Fenning"));
        students.add(new Students(60, "Mary"));
        students.add(new Students(100, "Japheth"));
        students.add(new Students(70, "James"));

        Collections.sort(students, comparator);
        for(Students results : students)
        System.out.println(results);
        
    }
}
