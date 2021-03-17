package step4.domain.ipnut;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step4.domain.car.name.Name;

import static org.assertj.core.api.Assertions.*;

class InputRoundTest {

    @DisplayName("InputRound 인스턴스 생성 여부 테스트")
    @Test
    void 생성() {
        // given
        int round = 5;

        // when
        InputRound inputRound = new InputRound(round);

        // then
        assertThat(inputRound).isNotNull();
    }

    @DisplayName("InputRound 인스턴스에 부적절한 값 입력시 예외 발생 여부 테스트")
    @Test
    void 검증() {
        // given
        int round = -1;

        // when and then
        assertThatThrownBy(() -> {
            new InputRound(round);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("유효하지 않은 값을 사용했습니다.");

    }

    @DisplayName("InputRound 인스턴스가 가지고 있는 값 반환 테스트")
    @Test
    void 반환(){
        // given
        int expected = 5;
        InputRound inputRound = new InputRound(expected);

        // when
        int actual = inputRound.inputRound();

        // then
        assertThat(actual).isEqualTo(expected);
    }
}