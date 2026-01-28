package backup;
public class Main{
    public static void main(String[] args){
        BackupScheduler scheduler=new BackupScheduler();
        try{
            scheduler.scheduleBackup("/documents",2);
            scheduler.scheduleBackup("/videos", 5);
            scheduler.scheduleBackup("/photos", 3);
            scheduler.scheduleBackup("", 4); // exception
        }catch (InvalidBackupPathException e){
            System.out.println(e.getMessage());
        }
        scheduler.executeBackups();
    }
}