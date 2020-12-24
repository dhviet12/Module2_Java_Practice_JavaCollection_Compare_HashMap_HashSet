import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("A",20,"HN");
        Student student2 = new Student("B",21,"HN");
        Student student3 = new Student("C",22,"HCM");
        Map<Integer, Student> myHashMap = new HashMap<>();
        myHashMap.put(1,student1);
        myHashMap.put(2,student2);
        myHashMap.put(3,student3);
        for(Map.Entry<Integer, Student> student : myHashMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("///////////////////");
        Set<Student> myHashSet = new HashSet<>();
        myHashSet.add(student1);
        myHashSet.add(student3);
        myHashSet.add(student2);
        for (Student student : myHashSet){
            System.out.println(student.toString());
        }
    }
}
