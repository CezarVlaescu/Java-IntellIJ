public class Main {
    public static void main(String[] args) {
         int[] array = {1,2,3,4,5};
         String [] names = {"Cezar", "Victor"};
         log(array, names);
    }
    public static void log(int[] numbers, String[] names){

        // O is increasing by the number of operations we are doing

        System.out.println(numbers[0]); // O(1)
        System.out.println(numbers[1]); // O(2)

        // O(n) -> one loop

        for(int i =0; i < numbers.length; i++) // O(n)
        {
            System.out.println(numbers[i]);
        }
        for(int i =0; i < numbers.length; i++) // O(n)
        {
            System.out.println(numbers[i]);
        }// O(2n)


        for(int i =0; i < numbers.length; i++) // O(n)
        {
            System.out.println(numbers[i]);
        }
        for(String name: names) // O(m)
        {
            System.out.println(name);
        } // O(n)

        // O(n ^ 2)

        for(int i : numbers) // O(n)
        {
            for(int second : numbers) // O(n)
            {
                System.out.println(i + second);
            }
        }


    }
}
