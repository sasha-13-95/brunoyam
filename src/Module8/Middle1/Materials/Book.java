package Module8.Middle1.Materials;


public class Book extends Material {
    private String titleOfBook;

    public Book() {
        titleOfBook = scanner.nextLine();
        setNameOfMaterial(titleOfBook);
    }
}
