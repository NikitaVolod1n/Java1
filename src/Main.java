public class Main {
    public static void main(String[] args) {
        Container container = new Container();

        container.add(10);
        container.add(20);
        container.add(30);

        System.out.println(container.getByIndex(1));

        container.delete(20);

        System.out.println(container.getByIndex(1));

        System.out.println(container.getSize());
    }
}

//https://github.com/NikitaVolod1n/Java1