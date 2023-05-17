import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.MockitoAnnotations
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

internal class GreeterTest {

    private lateinit var mockedList: MutableList<Int>

    @BeforeEach
    fun setup() {
        mockedList = mock()
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun `should pass`() {
        mockedList.add(10)
        assertTrue(true)
        verify(mockedList, times(1)).add(10)
    }
}