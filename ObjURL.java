public class ObjURL {
    String Url;
    String Titulo;
    String Fecha;

    public ObjURL(String fecha, String titulo, String url) {
        Fecha = fecha;
        Titulo = titulo;
        Url = url;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }
}
