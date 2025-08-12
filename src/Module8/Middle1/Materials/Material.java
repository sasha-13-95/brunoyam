package Module8.Middle1.Materials;


import java.util.Scanner;

public abstract class Material {
    protected Scanner scanner = new Scanner(System.in);
    private String nameOfMaterial;

    protected void setNameOfMaterial(String nameOfMaterial) {
        this.nameOfMaterial = nameOfMaterial;
    }

    public String getTitleOfMaterial() {
        return nameOfMaterial;
    }
}
