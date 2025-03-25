package co.com.test2.enums;

public enum Mensaje {

    MSG_ERR("El proceso no es valido");
    String mensaje;

    private Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
