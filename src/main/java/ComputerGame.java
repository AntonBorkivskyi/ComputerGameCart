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

    public int getId() {
        return id;
    }

    public String getName() { return name; }

    public ComputerGameParameters getParameters() { return parameters; }

}
