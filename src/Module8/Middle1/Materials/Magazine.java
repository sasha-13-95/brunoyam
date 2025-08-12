package Module8.Middle1.Materials;


public class Magazine extends Material {
    private String titleOfMagazine;

    public Magazine() {
        titleOfMagazine = scanner.nextLine();
        setNameOfMaterial(titleOfMagazine);
    }
}
