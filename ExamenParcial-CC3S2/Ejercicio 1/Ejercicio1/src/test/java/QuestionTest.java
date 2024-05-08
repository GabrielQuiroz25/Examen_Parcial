import Sprint1.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


public class QuestionTest {

    @Test
    void constructorShouldSetPregunta1(){//Verifica que la pregunta 1 se haya colocado correctamente

        Question question = new Question(1);

        assertThat(question.getPregunta())
                .as("Pregunta 1")
                .isEqualTo("¿Cuál es la capital de Francia?");
    }

    @Test
    void constructorShouldSetPregunta2(){//Verifica que la pregunta 2 se haya colocado correctamente

        Question question = new Question(2);

        assertThat(question.getPregunta())
                .as("Pregunta 2")
                .isEqualTo("¿Cuál es la capital de Perú?");
    }

    @Test
    void constructorShouldSetPregunta3(){//Verifica que la pregunta 3 se haya colocado correctamente

        Question question = new Question(3);

        assertThat(question.getPregunta())
                .as("Pregunta 3")
                .isEqualTo("Esta es la pregunta 3");
    }


    @ParameterizedTest
    @ValueSource(ints = {4,5,6,7,8,9,10})
    void constructorShouldSetPreguntaN(int nPregunta){//Verifica que la pregunta n se haya colocado correctamente

        Question question = new Question(nPregunta);

        assertThat(question.getPregunta())
                .as("Pregunta "+nPregunta)
                .isEqualTo("Esta es la pregunta "+nPregunta);
    }


/*
@Test
void constructorShouldSetOpciones(){



}


*/
@Test
void constructorShouldSetRespuesta(){

    Question q = new Question(1);

    assertThat(q.getRespuesta()).as("Respuesta pregunta 1").isEqualTo(1);

}


}
