package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for (char letter : letters){
            System.out.print(letter);
        }
        String sentence = new String(letters);
        System.out.println("\nSentence: "+sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = "+itemArray.length);
        System.out.println("item.length = "+item.length());

        String[] fruits = {"bananas ", " apples ", " kiwi ", " mango "};
        String fruitStr = "";
        for(String fruit : fruits) {
            System.out.print(fruit + "-");
            fruitStr += fruit + "-";
        }
        System.out.println("\nFruit STR = "+fruitStr);

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|",languages));

    }
}
