import java.util.*;

public class Main {
    public static void print() {
        System.out.println("________________________________");
    }

    //печатает нечетные числа в консоль
    public static void oddNumbers(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    //печатает четные числа без повторений в порядке возрастания
    public static void printsEvenNumbers(List<Integer> nums) {
        Collections.sort(nums);
        int i = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != i) {
                System.out.println(num);
                i = num;
            }
        }
    }

    //код, который выводит в консоль все уникальные слова из списка слов
    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    //код, который выводит в консоль все количество дублей из списка слов
    public static void duplicateWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("asd", "asd", "ol", "jgh", "c", "jgh", "tyu", "c"));
        //1 задание
        oddNumbers(nums);
        print();
        //2 задание
        printsEvenNumbers(nums);
        print();
        //3 задание
        printUniqueWords(words);
        print();
        //3 задание
        duplicateWords(words);
    }
}