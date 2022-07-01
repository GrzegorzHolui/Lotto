package gameLotto

import spock.lang.Specification

class NumberGeneratorTest extends Specification {

    def "should return the that User aimed six numbers"() {
        given:
        Lotto lotto = new Lotto(new GenerableImplTest(Set.of(1, 2, 3, 4, 5, 6)),
                new ReciveableImplTest(Set.of(1, 2, 3, 4, 5, 6)),
                new AimedNumbers())
        when:
        LottoResult lottoResult = lotto.start();
        then:
        lottoResult.getMessage() == "You aimed  + 6"
    }


}
