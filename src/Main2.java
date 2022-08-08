import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Student> list= Arrays.asList( new Student(1,"Abbas",100),
                new Student(2,"Jay",200) ,
                new Student(3,"Parth",300),
                new Student(4,"Mayank",260),
                new Student(40,"Pooja",390));

        Collections.sort(list,(s1, s2) -> s1.roll>s2.roll ? +1 : -1);
      //  System.out.println(list);

        list.
                stream()
                .filter(item -> item.marks<250)
                .forEach(item -> System.out.println(item));



    }
}
