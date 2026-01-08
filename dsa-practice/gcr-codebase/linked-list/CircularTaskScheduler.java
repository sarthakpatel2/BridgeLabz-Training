// node class
class Task{
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;
    Task(int taskId, String taskName,int priority,String dueDate){
        this.taskId=taskId;
        this.taskName=taskName;
        this.priority=priority;
        this.dueDate= dueDate;
        this.next=null;
    }
}
//circular Linked List class
class TaskScheduler{
    private Task head=null;
    private Task current=null;
    // add at beginning
    void addAtBeginning(int id, String name, int priority, String dueDate){
        Task newTask = new Task(id,name,priority, dueDate);
        if (head ==null){
            head=newTask;
            newTask.next=head;
        }else{
            Task temp=head;
            while (temp.next != head){
                temp = temp.next;
            }
            newTask.next =head;
            temp.next = newTask;
            head=newTask;
        }
    }
    //add at end
    void addAtEnd(int id, String name, int priority, String dueDate){
        Task newTask = new Task(id, name, priority, dueDate);
        if (head==null){
            head=newTask;
            newTask.next=head;
        }else{
            Task temp=head;
            while (temp.next !=head) {
                temp= temp.next;
            }
            temp.next=newTask;
            newTask.next=head;
        }
    }
    //add at specific position
    void addAtPosition(int pos, int id, String name, int priority, String dueDate){
        if (pos<=1|| head== null){
            addAtBeginning(id, name, priority,dueDate);
            return;
        }
        Task temp = head;
        for (int i=1;i<pos -1 && temp.next!= head;i++){
            temp=temp.next;
        }
        Task newTask=new Task(id, name, priority, dueDate);
        newTask.next=temp.next;
        temp.next=newTask;
    }
    // remove task by ID
    void removeById(int id){
        if (head ==null){
            System.out.println("Task list is empty");
            return;
        }
        Task curr=head;
        Task prev=null;
        do {
            if (curr.taskId == id){
                // Only one node
                if (curr==head && curr.next== head) {
                    head=null;
                }
                //removing head
                else if (curr==head){
                    Task temp=head;
                    while (temp.next !=head){
                        temp=temp.next;
                    }
                    head=head.next;
                    temp.next=head;
                }
                // removing non-head
                else{
                    prev.next=curr.next;
                }
                System.out.println("Task removed successfully");
                return;
            }
            prev=curr;
            curr=curr.next;
        } while (curr!=head);
        System.out.println("Task not found");
    }
    //view current task and move to next
    void viewNextTask() {
        if (head==null) {
            System.out.println("No tasks available");
            return;
        }
        if (current ==null) {
            current=head;
        }
        System.out.println("Current Task:");
        displayTask(current);
        current=current.next;
    }
    //display all tasks
    void displayAll(){
        if (head==null){
            System.out.println("No tasks to display");
            return;
        }
        Task temp = head;
        do{
            displayTask(temp);
            temp=temp.next;
        } while (temp!=head);
    }
    //search by priority
    void searchByPriority(int priority){
        if (head==null){
            System.out.println("No tasks available");
            return;
        }
        Task temp=head;
        boolean found=false;
        do{
            if (temp.priority==priority){
                displayTask(temp);
                found=true;
            }
            temp=temp.next;
        } while (temp!=head);
        if (!found){
            System.out.println("No tasks found with priority "+priority);
        }
    }
    // helper method
    void displayTask(Task t) {
        System.out.println("ID: "+t.taskId+", Name: "+t.taskName+", Priority: "+t.priority +", Due Date: "+t.dueDate);
    }
}
//main class
public class CircularTaskScheduler{
    public static void main(String[] args){
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addAtEnd(1, "Design ", 1,"2026-01-10");
        scheduler.addAtEnd(2, "Code Implementation",2, "2026-01-15");
        scheduler.addAtBeginning(3, "Requirement Analysis", 1,"2026-01-05");
        scheduler.addAtPosition(2, 4, "Testing",3,"2026-01-20");
        System.out.println("\nAll Tasks:");
        scheduler.displayAll();
        System.out.println("\nView Current & Next Tasks:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        System.out.println("\nSearch by Priority:");
        scheduler.searchByPriority(1);
        System.out.println("\nRemove Task:");
        scheduler.removeById(2);
        System.out.println("\nFinal Task List:");
        scheduler.displayAll();
    }
}
