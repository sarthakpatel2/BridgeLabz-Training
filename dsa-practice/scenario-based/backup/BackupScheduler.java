package backup;
import java.util.PriorityQueue;
public class BackupScheduler{
    private PriorityQueue<BackupTask> queue=new PriorityQueue<>();
    public void scheduleBackup(String path, int priority)
            throws InvalidBackupPathException{
        if (path==null || path.isEmpty()){
            throw new InvalidBackupPathException("Invalid backup path");
        }
        queue.add(new BackupTask(path, priority));
        System.out.println("Backup scheduled: "+path);
    }
    public void executeBackups(){
        System.out.println("\nExecuting backups:");
        while (!queue.isEmpty()){
            BackupTask task=queue.poll();
            System.out.println("Backing up: "+task.getFolderPath()+" | Priority: "+task.getPriority());
        }
    }
}