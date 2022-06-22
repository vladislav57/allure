package pet.project;

import io.qameta.allure.Step;
import org.assertj.core.api.Assertions;

public class JustTest {

    @org.junit.jupiter.api.Test
    public void probeTest() {
        String result = getResult();
        Assertions.assertThat(result).isEqualTo("Hello");
    }

    @Step("Some step")
    private String getResult() {
        return Main.sayHello();
    }

}
