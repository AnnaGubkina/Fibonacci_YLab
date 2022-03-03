import java.util.LinkedList;
import java.util.List;

public class FibonacciCalculation {

    private List<Integer> list = new LinkedList<>();

    public FibonacciCalculation(int num) {
        this.list = fibonacchiList(num);
    }

    private static List<Integer> fibonacchiList(int num) {
        List<Integer> numbers = new LinkedList<>();
        int res = 0;
        int count = 0;
        while (count != num) {
            if (count == 0) {
                numbers.add(0);
                count++;
            } else if (count == 1) {
                numbers.add(1);
                count++;
            } else {
                res = numbers.get(count - 1) + numbers.get(count - 2);
                numbers.add(res);
                count++;
            }
        }
        return numbers;
    }

    public List<Integer> getList() {
        return list;
    }
}

