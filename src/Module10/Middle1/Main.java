package Module10.Middle1;


import Module10.Middle1.Tasks.*;

public class Main {
    public static void main(String[] args) {
        AbstractTask task1 = new ImageTask("https://www.google.com/search?q=%D0%BF%D0%");
        AbstractTask task2 = new DocumentTask("https://www.google.com/sear");
        AbstractTask task3 = new TextTask("Сделать генеральную уборку.");
        TaskList taskList = new TaskList(new Task[]{task1, task2, task3});
        taskList.showUnfinishedTasks();
        task1.executed();
        task3.executed();
        taskList.showFinishedTasks();
    }
}
