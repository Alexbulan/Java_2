import ru.mirea.it.ivbo.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3)).analyze(5));
//        Scanner scanner = new Scanner(System.in);
//        double num = scanner.nextDouble();
//        System.out.println(new Add(new Subtract(new Variable("x", 2), new Multiply(new Const(2), new Variable("x"))), new Const(1)).analyze(num));
        ArrayQueueModule gueM = new ArrayQueueModule();
        gueM.enqueue("aaa");
        gueM.enqueue("bbb");
        gueM.enqueue("ccc");
        gueM.enqueue("ddd");
        gueM.dequeue();
        gueM.dequeue();
        gueM.enqueue("eee");
        gueM.enqueue("fff");
        for (int i = 0; i < 8; i++)
            System.out.print(gueM.dequeue() + " ");
        System.out.println();

        ArrayQueueADT queADT = new ArrayQueueADT(gueM);
        for (int i = 0; i < 3; i++)
            System.out.print(queADT.dequeue() + " ");
        System.out.println();

        ArrayQueue que = new ArrayQueue();
        que.enqueue(111);
        que.enqueue(222);
        que.enqueue(333);
        que.enqueue(444);
        que.enqueue(555);
        System.out.println(que.element());
        for (int i = 0; i < 10; i++)
            System.out.print(que.dequeue() + " ");
        System.out.println();

        que.clear();
        System.out.println(que.isEmpty());
        System.out.println(que.dequeue());
    }
}
