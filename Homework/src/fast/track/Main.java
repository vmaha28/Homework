package fast.track;

public class Main {
    public static void main(String[] args) {
        Person Person1 = new Person();
        Person1.setName("Marius");
        Person1.setAge(23);
        Person1.setMarried("isMarried");
        System.out.println(Person1.getAge());
        System.out.println(Person1.getMarried());
        System.out.println(Person1.getName());
        Person Person2 = new Person();
        Person2.setName("ana");
        Person2.setAge(20);
        Person2.setMarried("isMarried");
        System.out.println(Person2.getAge());
        System.out.println(Person2.getMarried());
        System.out.println(Person2.getName());
        Person Person3 = new Person();
        Person3.setName("Vlad");
        Person3.setAge(56);
        Person3.setMarried("Necasatorit");
        System.out.println(Person3.getName());
        System.out.println(Person3.getAge());
        System.out.println(Person3.getMarried());

        Product Product1=new Product();
        Product1.setName("Detergent");
        Product1.setPrice(10);
        Product1.setQuantity(0);
        Product1.setCategory("Alimentar");
        System.out.println(Product1.getName());
        System.out.println(Product1.getPrice());
        System.out.println(Product1.getQuantity());
        System.out.println(Product1.getCategory());
        Product1.isCategory("Alimentar");



    }
}
