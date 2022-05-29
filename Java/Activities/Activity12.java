package activities;
interface Addable {
    int add(int num1, int num2);
}
public class Activity12 {
    public static void main(String[] args) {

        Addable ad3 = (num1,num2) ->(num1 + num2);
        System.out.println(ad3.add(10,10));

        Addable ad4 = (num1,num2) ->
        {
            return (num1 + num2);
        };
        System.out.println(ad4.add(20,20));
    }
}

