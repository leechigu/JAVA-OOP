public class Main {
    public static void main(String[] args) {
        System.out.println("ġ�� ���� ����. �߷�: 280");
        AbstractPizza pizza1 = new CheesePizza();
        // ġ�� ���� �߰�
        System.out.println("ġ�� ���� �߰�. �߷�: 40 �߰�");
        pizza1 = new ExtraCheeseTopping(pizza1);
        System.out.println(pizza1);
        System.out.println("Weight: " + pizza1.weight());
        // ���� ���� �߰�
        System.out.println("���� ���� �߰�. �߷�: 30 �߰�");
        pizza1 = new OnionTopping(pizza1);
        System.out.println(pizza1);
        System.out.println("Weight: " + pizza1.weight());
        // ���ξ��� ���� �߰�
        System.out.println("���ξ��� ���� �߰�. �߷�: 45 �߰�");
        pizza1 = new PineappleTopping(pizza1);
        System.out.println(pizza1);
        System.out.println("Weight: " + pizza1.weight());

        System.out.println("\n�޺���̼� ���� ����. �߷�: 300");
        AbstractPizza pizza2 = new CombinationPizza();

        System.out.println("ġ�� ���� �߰�. �߷�: 40 �߰�");
        pizza2 = new ExtraCheeseTopping(pizza2);
        System.out.println(pizza2);
        System.out.println("Weight: " + pizza2.weight());

        System.out.println("���� ���� �߰�. �߷�: 30 �߰�");
        pizza2 = new OnionTopping(pizza2);
        System.out.println(pizza2);
        System.out.println("Weight: " + pizza2.weight());

        System.out.println("���� ���� �߰�. �߷�: 30 �߰�");
        pizza2 = new OnionTopping(pizza2);
        System.out.println(pizza2);
        System.out.println("Weight: " + pizza2.weight());

        System.out.println("���۷δ� ���� �߰�. �߷�: 25 �߰�");
        pizza2 = new PepperoniTopping(pizza2);
        System.out.println(pizza2);
        System.out.println("Weight: " + pizza2.weight());
    }
}

