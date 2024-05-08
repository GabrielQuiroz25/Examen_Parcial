package Sprint1;

import java.util.Scanner;

public class Quiz {


    public Question cargarPregunta(int nroRonda){ //Carga la pregunta en pantalla de acuerdo al número de ronda

        Question question = new Question(nroRonda); // Instanciamos un objeto de la clase Question

        System.out.println(question.getPregunta()); //Imprimimos la pregunta

        //Imprimimos las opciones
        for(int i=0;i<4;i++){
            System.out.println((i+1)+")"+question.getOpciones(i));
        }

        return question; //Devolvemos el objeto de clase Question

    }

    public boolean recibirRespuesta(String respuesta,Question q){ // Solicita entrada de la respuesta del usuario

        int n= Integer.parseInt(respuesta); //Transformamos a entero

        if (n==q.getRespuesta()){
            System.out.println("Respuesta correcta!");
            return true;
        }else {
            System.out.println("Respuesta incorrecta!");
            return false;
        }

    }

    public void mensajeInicio(){ // Muestra el mensaje de bienvenida junto con las instrucciones
        System.out.println("Bienvenido al Juego de Trivia!");
        System.out.println("Responde las siguientes preguntas seleccionando el número de la opción correcta.\n");

    }

    public static void main(String[] args) { // Función main

        Quiz quiz = new Quiz(); // Creamos una instancia de la clase quiz que se encargará del flujo del juego

        quiz.mensajeInicio(); // Mostramos el mensaje de inicio del juego

        int nroRonda = 1;

        while(nroRonda<=10) {

            Question q = quiz.cargarPregunta(nroRonda); //Se carga la pregunta

            Scanner scanner = new Scanner(System.in); //Se instancia un objeto de clase Scanner para recibir las respuestas de entrada

            String respuesta=scanner.nextLine();

            quiz.recibirRespuesta(respuesta,q);

            nroRonda++;

        }



    }
}
