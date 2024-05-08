package Sprint1;

public class Question {

    //private String nroPregunta;
    private String pregunta; // Contenido de la pregunta

    private String[] opciones = new String[4]; // Array que contiene las opciones

    private int respuesta; // Contiene la respuesta correcta


    public String getPregunta() {
        return pregunta;
    }

    public String getOpciones(int i) {
        return opciones[i];
    }

    public int getRespuesta() {
        return respuesta;
    }


    public Question(int nroPregunta){

        this.opciones=new String[]{"Opción 1","Opción 2","Opción 3","Opción 4"};


        switch(nroPregunta) {
            case 1:
                this.pregunta="¿Cuál es la capital de Francia?";
                this.respuesta=3;
                this.opciones=new String[]{"Madrid","Londres","París","Berlín"};

                break;
            case 2:
                this.pregunta="¿Cuál es la capital de Perú?";
                this.respuesta=1;
                this.opciones=new String[]{"Lima","La Paz","Buenos Aires","Medellín"};

                break;
            case 3:
                this.pregunta="Esta es la pregunta "+nroPregunta;
                this.respuesta=3;

                break;
            case 4:
                this.pregunta="Esta es la pregunta "+nroPregunta;
                this.respuesta=4;

                break;
            case 5:
                this.pregunta="Esta es la pregunta "+nroPregunta;
                this.respuesta=1;
                break;
            case 6:
                this.pregunta="Esta es la pregunta "+nroPregunta;
                this.respuesta=2;
                break;
            case 7:
                this.pregunta="Esta es la pregunta "+nroPregunta;
                this.respuesta=3;
                break;
            case 8:
                this.pregunta="Esta es la pregunta "+nroPregunta;
                this.respuesta=4;
                break;
            case 9:
                this.pregunta="Esta es la pregunta "+nroPregunta;
                this.respuesta=1;
                break;
            case 10:
                this.pregunta="Esta es la pregunta "+nroPregunta;
                this.respuesta=2;
                break;
            default:
                // code block
        }

    }



}
