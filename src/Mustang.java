public class Mustang implements Horse {
    private String name;
    private int weight;
    public Mustang (String name, int weight)
    {
        this.weight = weight;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }
}
