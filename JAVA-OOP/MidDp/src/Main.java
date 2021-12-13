public class Main {
    public static void main(String[] args) {
    	//201710965, ��ġ��, ��ġ��  
    	//����ϼ̽��ϴ�~~!
        System.out.println("��Ʈ�� ����. �䱸 ����: 250");
        AbstractNotebookComputer computer = new NotebookComputer("Chigu");
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());

        System.out.println("\n�ܺ� ����� �߰�. �䱸 ����: 150 �߰�");
        computer = new LEDMonitor("LEDMonitor", computer);
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());

        System.out.println("\n�� ��° �ܺ� ����� �߰�. �䱸 ����: 150 �߰�");
        computer = new LEDMonitor("LEDMonitor2", computer);
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());

        System.out.println("\n�ܺ� Ű���� �߰�. �䱸 ����: 80 �߰�");
        computer = new Keyboard("Keyboard", computer);
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());

        System.out.println("\n�ܺ� ���콺 �߰�. �䱸 ����: 30 �߰�");
        computer = new Mouse("Mouse", computer);
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());

        System.out.println("\n�ϵ� ����̺� �߰�. �䱸 ����: 40�߰�");
        computer = new HardDrive("HardDrive", computer);
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());
    }
}
