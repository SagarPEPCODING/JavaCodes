import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question2
 */
public class Question2 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(7, 8, 9);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(1, 2, 3);
        List<List<Integer>> NumberList = new ArrayList<>();
        NumberList.add(list1);
        NumberList.add(list2);
        NumberList.add(list3);
        List<Integer> MylistNumbers = NumberList.stream().flatMap(plist -> plist.stream()).collect(Collectors.toList());
        System.out.println(MylistNumbers);
    }
}