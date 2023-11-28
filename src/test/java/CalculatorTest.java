import org.example.Calculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

	@Test
	public void foo() {
		Calculator calculator = new Calculator();
		assertThat(calculator.sum(2, 4)).isEqualTo(6);
	}
}
