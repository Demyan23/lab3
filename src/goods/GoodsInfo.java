package goods;

public class GoodsInfo {

    private String material;
    private int weight;
    private String colour;


    public GoodsInfo(String material, int weight, String colour) {
        this.material = material;
        this.weight = weight;
        this.colour = colour;

    }

    public String getMaterialType() {

        return material;
    }


    public void setMaterialType(String material) {
        this.material = material;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    @Override

    public String toString(){
        return "\r\n"
                + "Features: [Material=" + material + ", weight=" + weight + ", colour=" + colour + ", weight=" + weight + "";
    }

}
