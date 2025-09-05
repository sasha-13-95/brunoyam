package Module10.Middle1.Tasks;


public class TextTask extends AbstractTask {
    private String text;

    public TextTask(String text) {
        this.text = text;
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем текст " + text);
    }
}
