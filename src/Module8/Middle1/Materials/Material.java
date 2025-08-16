package Module8.Middle1.Materials;


public abstract class Material {
    private String nameOfMaterial;

    protected Material(String nameOfMaterial) {
        this.nameOfMaterial = nameOfMaterial;
    }

    public String getTitleOfMaterial() {
        return nameOfMaterial;
    }
}
