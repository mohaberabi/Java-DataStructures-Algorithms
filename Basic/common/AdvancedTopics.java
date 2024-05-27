import java.util.ArrayList;

public class AdvancedTopics {


    ArrayList<?> al = new ArrayList<Student>();

    ArrayList<DevStudent> al2 = new ArrayList<DevStudent>();

    ArrayList<? super Student> al3 = new ArrayList<Student>();


    void test() {
        al = al3;
    }
}


