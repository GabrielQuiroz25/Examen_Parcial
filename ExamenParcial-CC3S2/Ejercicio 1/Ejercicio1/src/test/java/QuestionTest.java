import Sprint1.Question;
import org.junit.jupiter.api.Test;
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

/*
@Test
void constructorShouldSetOpciones(){

}


@Test
void constructorShouldSetRespuesta(){

}
*/

}
