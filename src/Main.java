import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GenericLinkedList<String> list = new GenericLinkedList<>();
        System.out.println(list.isEmpty());
        list.insertFirst("Lucas");
        list.insertLast("Pepe");
        list.insertLast("Juan");
        list.insertFirst("Manolo");
        list.insertLast("Maria");
        list.insertLast("Jose");
        list.remove("Lucas");
        list.remove("Juan");
        list.remove("Jose");
        list.print();

        System.out.println(list.getFirstObject());
        System.out.println(list.getLastObject());
    }
}
