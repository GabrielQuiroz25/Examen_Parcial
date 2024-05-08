package Sprint1;

public class Quiz {


    public void cargarPregunta(int nroRonda){

        Question question = new Question(nroRonda);

        System.out.println(question.getPregunta());

    }

    public void recibirRespuesta(){

    }

    public void mensajeInicio(){
        System.out.println("Bienvenido al Juego de Trivia!");
        System.out.println("Responde las siguientes preguntas seleccionando el número de la opción correcta.\n");

    }

    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        quiz.mensajeInicio();





    }
}
