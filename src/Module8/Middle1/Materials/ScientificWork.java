package Module8.Middle1.Materials;


public class ScientificWork extends Material {
    private String titleOfScientificWork;

    public ScientificWork() {
        titleOfScientificWork = scanner.nextLine();
        setNameOfMaterial(titleOfScientificWork);
    }
}