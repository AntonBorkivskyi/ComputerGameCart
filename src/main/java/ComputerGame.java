public class ComputerGame {
    private String name;
    private int price;
    private int id;
    private ComputerGameParameters parameters;

    public ComputerGame(String name, int price, int id, ComputerGameParameters parameters){
        this.name = name;
        this.price = price;
        this.id = id;
        this.parameters = parameters;
    }


    public int getPrice() {
        return price;
    }

    public ComputerGame setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getId() {
        return id;
    }

    public ComputerGame setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() { return name; }

    public ComputerGame setName(String name) {
        this.name = name;
        return this;
    }

    public ComputerGameParameters getParameters() { return parameters; }

    public ComputerGame setParameters(ComputerGameParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}
