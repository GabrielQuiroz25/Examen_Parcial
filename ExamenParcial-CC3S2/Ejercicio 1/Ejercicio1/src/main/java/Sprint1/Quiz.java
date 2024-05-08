package Sprint1;

public class Quiz {


    public void cargarPregunta(int nroRonda){ //Carga la pregunta en pantalla de acuerdo al número de ronda

        Question question = new Question(nroRonda);

        System.out.println(question.getPregunta());

    }

    public void recibirRespuesta(){ // Solicita entrada de la respuesta del usuario

    }

    public void mensajeInicio(){ // Muestra el mensaje de bienvenida junto con las instrucciones
        System.out.println("Bienvenido al Juego de Trivia!");
        System.out.println("Responde las siguientes preguntas seleccionando el número de la opción correcta.\n");

    }

    public static void main(String[] args) { // Función main

        Quiz quiz = new Quiz(); // Creamos una instancia de la clase quiz que se encargará del flujo del juego

        quiz.mensajeInicio(); // Mostramos el mensaje de inicio del juego





    }
}
