
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof Item)) {
            return false;
        }
        
        Item comp = (Item) o;
        return this.name.equals(comp.name);
    }
    
    public int hashCode() {
        return this.name.hashCode();
    }
}
