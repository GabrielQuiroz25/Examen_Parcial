import Sprint1.Question;
import Sprint1.Quiz;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class QuizTest {

    @Test
    void recibeRespuestaCorrecta(){

        //Arrange
        Quiz quiz = new Quiz();
        Question q = new Question(1);

        //Act
        boolean b = quiz.recibirRespuesta("3",q);

        //Assert
        assertThat(b).isEqualTo(true);

    }
}
