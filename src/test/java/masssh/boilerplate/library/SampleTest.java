package masssh.boilerplate.library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void shouldTest() {
        final Sample sample = new Sample();
        final int result = sample.foo();
        assertEquals(result, 1);
    }
}
