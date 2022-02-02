package myProject;

public class ControlHangman {

    private Diccionario frases;
    private String frase, clave, errores;
    private int conteoErrores;
    private boolean fallo, ganar;

    //Constructores

    public ControlHangman() {
        frases = new Diccionario();
    }

    public String PintarClaveFrase() {

        //Inicialización da las variables de control de la ronda
        clave = "";
        frase = frases.getFrase();
        errores = "Letras erroneas: ";
        conteoErrores = 0;

        //Crear clave
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                clave += frase.charAt(i);
            } else {
                clave += "_";
            }
        }
        return clave;
    }

    public String ValidarLetra(char letra){
        fallo = false;
        int index = frase.indexOf(letra);

        if (index!=-1){
            while (index>-1){
                reemplazarLetra(index,letra);
                index =frase.indexOf(index+1,letra);
            }
        }else{
            fallo=true;
            conteoErrores++;
            errores+=letra+" ";
        }
        return clave;
    }

    private void reemplazarLetra(int index, char letra) {
        char[] arrayClave = clave.toCharArray();
        arrayClave[index] = letra;
        clave = String.copyValueOf(arrayClave);
    }

    public boolean isGananador() {
        ganar = (clave.indexOf('_')==-1)?true:false;
        return ganar;
    }

    public String getFrase() {
        return frase;
    }

    public String getClave() {
        return clave;
    }

    public String getErrores() {
        return errores;
    }

    public int getConteoErrores() {
        return conteoErrores;
    }

    public boolean isFallo() {
        return fallo;
    }

}
