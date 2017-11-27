import org.junit.Test;

import static org.junit.Assert.*;

    public class ComputerStoreTest {
        @Test
        public void addGame() throws Exception {
            ComputerStore computer_store = new ComputerStore();
            computer_store.addGame("N1", 100, 1, new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS));
            assertEquals(1, computer_store.getGames().size());
            computer_store.addGame("N2", 200, 2, new ComputerGameParameters(12, "D2", Genres.MOBA, Platforms.WINDOWS));
            assertEquals(2, computer_store.getGames().size());

        }

    @Test
    public void search() throws Exception {
        ComputerStore computer_store = new ComputerStore();
        computer_store.addGame("N1", 100, 1, new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS));
        computer_store.addGame("N2", 200, 2, new ComputerGameParameters(12, "D2", Genres.MOBA, Platforms.WINDOWS));
        computer_store.addGame("N3", 300, 3, new ComputerGameParameters(15, "D3", Genres.SIMULATION, Platforms.LINUX));
        computer_store.addGame("N4", 400, 4, new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS));
        assertEquals(2, computer_store.search(new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS)).size());
        assertEquals(0, computer_store.search(new ComputerGameParameters(15, "D3", Genres.MOBA, Platforms.WINDOWS)).size());
        assertEquals(4, computer_store.getGames().size());
    }

    @Test
    public void getter() throws Exception{
        ComputerGameParameters parameters = new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS);
        ComputerGame cg = new ComputerGame("N1", 100, 1, parameters);
        assertEquals("N1", cg.getName());
        assertEquals(100, cg.getPrice());
        assertEquals(1, cg.getId());
        assertEquals(parameters, cg.getParameters());
        assertEquals(18, parameters.getAgeRestriction());
        assertEquals("D1", parameters.getDescription());
        assertEquals(Genres.ACTION, parameters.getGenre());
        assertEquals(Platforms.IOS, parameters.getPlatform());
    }

    @Test
    public void genplat() throws Exception{
        assertEquals("Action", Genres.ACTION.toString());
        assertEquals("Moba", Genres.MOBA.toString());
        assertEquals("Simulation", Genres.SIMULATION.toString());
        assertEquals("Windows", Platforms.WINDOWS.toString());
        assertEquals("iOS", Platforms.IOS.toString());
        assertEquals("Linux", Platforms.LINUX.toString());
    }

    @Test
    public void matches() throws Exception{
        ComputerGameParameters first_parameters = new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS);
        ComputerGameParameters second_parameters = new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS);
        ComputerGameParameters third_parameters = new ComputerGameParameters(17, "D1", Genres.MOBA, Platforms.LINUX);
        ComputerGameParameters fourth_parameters = new ComputerGameParameters(18, "D2", Genres.SIMULATION, Platforms.WINDOWS);
        ComputerGameParameters fifth_parameters = new ComputerGameParameters(18, "D1", Genres.SIMULATION, Platforms.LINUX);
        ComputerGameParameters sixth_parameters = new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.LINUX);
        assertEquals(true, first_parameters.matches(second_parameters));
        assertEquals(false, first_parameters.matches(third_parameters));
        assertEquals(false, first_parameters.matches(fourth_parameters));
        assertEquals(false, first_parameters.matches(fifth_parameters));
        assertEquals(false, first_parameters.matches(sixth_parameters));
    }
        
    @Test
    public void enums() throws Exception{
        assertEquals("Action", Genres.valueOf("ACTION").toString());
        assertEquals("iOS", Platforms.valueOf("IOS").toString());
        assertEquals(3, Genres.values().length);
        assertEquals(3, Platforms.values().length);
    }
}
