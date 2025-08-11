package instrumentos;

import javax.sound.sampled.*; //libreria permite trabajar con audio 
import java.io.File; //permite abrir archivos 

class Instrumento {
    String nombre;
    String archivoSonido;

    // Constructor: guarda el nombre y la ruta del sonido
    public Instrumento(String nombre, String archivoSonido) {
        this.nombre = nombre;
        this.archivoSonido = "src/sonidos/" + archivoSonido;
    }

    // Metodo para tocar el sonido
    public void tocarSonido() {
        System.out.println("Tocando sonido de: " + nombre);
        reproducirSonido(); // Llama al método que reproduce el sonido
    }

    // Método para ejecutar una cancion
    public void ejecutarCancion() {
        System.out.println(nombre + " está ejecutando una canción.");
        reproducirSonido(); 
    }

    // Método privado que reproduce un archivo .wav
    private void reproducirSonido() {
        try {
            // Cargar el archivo de sonido
            File sonido = new File(archivoSonido);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(sonido);

            // Crear el clip de audio
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            // Esperar mientras suena
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            clip.close(); // Cerrar clip cuando termine
        } catch (Exception e) {
            System.out.println("No se pudo reproducir el sonido: " + e.getMessage());
        }
    }
}
