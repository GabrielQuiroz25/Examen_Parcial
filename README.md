#Examen Parcial


##Ejercicio 1:

Desarrollaremos el proyecto por TDD y RGR.

###Sprint 1

En el Sprint 1 creamos las clases Question y Quiz:

Clase Question:

```
public class Question {


	//Atributos
    private String pregunta; // Contenido de la pregunta

    private String[] opciones ; // Array que contiene las opciones

    private String respuesta; // Contiene la respuesta correcta


	//Funciones getters
    public String getPregunta() {
    }

    public String[] getOpciones() {
    }

    public String getRespuesta() {
    }


    public Question(int nroPregunta){ // El constructor tendrá como parámetro el número de pregunta durante el juego

    }
	
```

Clase Quiz: Se encargará del flujo del juego
```
public class Quiz {


    public void cargarPregunta(int nroRonda){ //Carga la pregunta en pantalla de acuerdo al número de ronda

    }

    public void recibirRespuesta(){ // Solicita entrada de la respuesta del usuario

    }

    public void mensajeInicio(){ // Muestra el mensaje de bienvenida junto con las instrucciones

    }
	

    public static void main(String[] args) { // Función main

        Quiz quiz = new Quiz(); // Creamos una instancia de la clase quiz que se encargará del flujo del juego

        quiz.mensajeInicio(); // Mostramos el mensaje de inicio del juego

    }
	
}

```

Creamos nuestros tests para la clase Question:

```
public class QuestionTest {

@Test
void constructorShouldSetPregunta1(){  //Verifica que la pregunta se haya colocado correctamente

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

```