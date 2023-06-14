package linkedlist;

public class MainClass {
    public static void main(String[] args) {
        CustomLInkedLIst customLInkedLIst = new CustomLInkedLIst();
        customLInkedLIst.addFirst(2);
        customLInkedLIst.addFirst(3);
        //customLInkedLIst.printData();
        customLInkedLIst.addLast(5);
        customLInkedLIst.addLast(7);
        customLInkedLIst.printData();
        //customLInkedLIst.deleteFirst();
        customLInkedLIst.deleteLast();
        customLInkedLIst.printData();
    }
}
