public class Main {
    public static void main(String[] args) {

        DynamicContainer dynamicContainer = new DynamicContainer();
        DynamicContainer.Node node = dynamicContainer.new Node();

        node.add(3);
        System.out.println(dynamicContainer.numbers[4]);

    }
}