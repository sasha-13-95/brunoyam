package Module8.Middle1.Materials;


import java.util.Scanner;

public abstract class Material {
    private Scanner scanner = new Scanner(System.in);
    private String nameOfMaterial;

    protected Material() {
        nameOfMaterial = scanner.nextLine();
    }

    public String getTitleOfMaterial() {
        return nameOfMaterial;
    }
}
