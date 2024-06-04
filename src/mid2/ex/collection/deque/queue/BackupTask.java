package mid2.ex.collection.deque.queue;

public class BackupTask implements Task{
    @Override
    public void execute() {
        System.out.println("자료 백업...");
    }
}
