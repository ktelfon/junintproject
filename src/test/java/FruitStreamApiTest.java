import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStreamApiTest {

    FruitStreamApi fruitStreamApi;

    @BeforeEach
    void setUp() {
        fruitStreamApi = new FruitStreamApi();
    }

    @Test
    void getAllFruits() {
        assertEquals(5, fruitStreamApi.getAllFruits().size());
    }

    @Test
    void findAllApples() {
        List<Fruit> apples = fruitStreamApi.findAllApples();
        int expectedAmountOfApples = 2;
        assertEquals(expectedAmountOfApples, apples.size());
        assertEquals(FruitName.APPLE, apples.get(0).getTitle());
        assertEquals(FruitName.APPLE, apples.get(1).getTitle());
    }

    @Test
    void findRedApplesWithWeightBiggerThen100() {
    }

    @Test
    void findAllFruitUniqNames() {
    }
}