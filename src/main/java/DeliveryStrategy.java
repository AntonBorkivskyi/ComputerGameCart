import java.util.List;

public interface DeliveryStrategy {
    boolean deliver(List<ComputerGame> games);
}
