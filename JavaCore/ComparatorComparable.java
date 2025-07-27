
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {

        if(this.age > that.age) {
            return 1;
        }
        return -1;
        // return Integer.compare(this.age, this.age);
    }

    
}

public class ComparatorComparable {
    public static void main(String[] args){
        
        // Comparator<Integer> comparator = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer i, Integer j) {
        //         if(i%10 > j%10) {
        //             return 1;
        //         }else return -1;
        //     }
        // };

        // List<Integer> list = new ArrayList<>();
        // list.add(52);
        // list.add(38);
        // list.add(87);
        // list.add(19);

        // Collections.sort(list, comparator);

        // System.out.println("Sorted List: " + list);

        List<Student> students = new ArrayList<>();
        students.add(new Student(20, "Alice"));
        students.add(new Student(22, "Bob"));
        students.add(new Student(19, "Charlie"));
        students.add(new Student(21, "David"));
        students.add(new Student(23, "Eve"));
        students.add(new Student(18, "Frank"));

        // Comparator<Student> ageComparator = new Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1, Student s2) {
        //         if(s1.age > s2.age) {
        //             return 1;
        //         }else {
        //             return -1;
        //         }
        //         // return Integer.compare(s1.age, s2.age);
        //     }
        // };

        Comparator<Student> ageComparator = (s1,s2) -> s1.age > s2.age ? 1 : -1;

        Collections.sort(students, ageComparator);
        // Collections.sort(students);
        System.out.println("Sorted Students by Age: " + students);

    }
}