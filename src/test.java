import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    private Container container;

    @BeforeEach
    void setUp() {
        container = new Container();
    }

    @Test
    @DisplayName("Добавление элементов должно увеличивать размер")
    void testAdd() {
        container.add(10);
        container.add(20);
        assertEquals(2, container.getSize(), "Размер должен быть равен 2 после добавления двух элементов");
    }

    @Test
    @DisplayName("Получение элемента по индексу")
    void testGetByIndex() {
        container.add(10);
        container.add(20);
        container.add(30);

        assertDoesNotThrow(() -> container.getByIndex(1));
        assertEquals(20, container.getByIndex(1));
    }

    @Test
    @DisplayName("Ошибка при неверном индексе")
    void testGetByInvalidIndex() {
        container.add(10);
        assertThrows(IndexOutOfBoundsException.class, () -> container.getByIndex(5));
        assertThrows(IndexOutOfBoundsException.class, () -> container.getByIndex(-1));
    }

    @Test
    @DisplayName("Удаление элемента из середины")
    void testDelete() {
        container.add(10);
        container.add(20);
        container.add(30);

        container.delete(20);

        assertEquals(2, container.getSize());
        assertEquals(30, container.getByIndex(1));
    }
}