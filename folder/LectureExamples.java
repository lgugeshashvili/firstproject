package lect_5;

public class LectureExamples {
    //1. ამოიღეთ და დაითვალეთ სიტყვა "Hello" თითთოეული ასოს პოზიცია ,
    // გამოიყენეთ ჯავას მეთოდი charAt()
    public static void charAtExample(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " " + "პოზიციაზეა ასო" + " " + str.charAt(i));
        }
    }

    // hello
    //2. დაითვალეთ ხმოვნები სტრინგში, გამოიყენეთ ჯავას მეთოდი charAt(), ხმოვნები (a ,e, i, o , u)
    public static void vowelExample(String str) {
        char a = 'a',
                e = 'e',
                i = 'i',
                o = 'o',
                u = 'u';
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == a || str.charAt(j) == e || str.charAt(j) == i || str.charAt(j) == o || str.charAt(j) == u) {
                count++;
            }
        }
        System.out.println(count);
    }

    //4. დაწერეთ იტეჯერების მასივი და იპოვეთ ამ მასივში მაქსიმალური ელემენტი
    public static void maxExample() {
        int[] array = {4, 6, 5, 80, 1};
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
    }

    //5. ოპოვეთ სხვადასხვა რიცხვის ფაქტორიალი
    // 5! = 1 * 2 * 3 * 4 * 5
    public static void factorialExample(int fact) {
        int number = 1;
        for (int i = 1; i <= fact; i++) {
            number *= i;
        }
        System.out.println(number);
    }

    //3. დაბეჭდეთ სტრინგ მასივის ყველა სიმბოლო(მრავალგანზომილებიანიც შეგიძლიათ გააკეთოთ)
    public static void example_3() {
        String[] array = {"Hello", "World"};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                System.out.println(array[i].charAt(j));
            }
        }
    }

    public static void example_4() {
        String[][] array = {{"Hello", "World"}, {"Test", "Tako"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int x = 0; x < array[i][j].length(); x++) {
                    System.out.println(array[i][j].charAt(x));
                }
            }
        }
    }

    //6. აღწერე სტრინგების მასივი. for ციკლით დაუარე ყველა "ელემენტს და ყოველი ელემენტის
    // 'a' სიმბოლო შეცვალე '-' სიმბოლოთი და დაბეჭდე მასივის ელემენტები replaceAll("a", "-")
    public static void example_5() {
        String[] array = {"Tako", "TaTa"};
        for (int i = 0; i < array.length; i++) {
            String result = array[i].replaceAll("a", "-");
            System.out.println(result);
        }
    }


    public static void main(String[] args) {
        charAtExample("Hello");
        charAtExample("tako");
        vowelExample("Hello");
        maxExample();
        factorialExample(5);
        example_3();
        example_4();
        example_5();

    }
}