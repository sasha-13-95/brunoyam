package Module8.Middle1.Materials;


public class Newspaper extends Material {
    private String titleOfNewspaper;

    public Newspaper() {
        titleOfNewspaper = scanner.nextLine();
        setNameOfMaterial(titleOfNewspaper);
    }
}