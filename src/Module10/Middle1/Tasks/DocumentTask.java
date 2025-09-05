package Module10.Middle1.Tasks;

public class DocumentTask extends AbstractTask {
    private String documentLink;

    public DocumentTask(String documentLink) {
        this.documentLink = documentLink;
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем документ. Ссылка на документ " + documentLink);
    }
}
