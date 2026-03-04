package hojadevida.modelo;

/**
 * Modelo de datos para la Hoja de Vida.
 */
public class DatosHojaVida {

    // ========== PERSONALIZA TUS DATOS AQUÍ ==========
    private String nombre = "Erik Santiago Ruano Macias";
    private String titulo = "ingeniero en informática";
    private String ciudad = "Popayán, Cauca, Colombia";
    private String telefono = "+57 3014144584";
    private String email = "erikruano383@gmail.com";
    private String github = "github.com/Santiago Ruano";
    //------------------------------------------------------------//
    private String[] habilidadesTecnicas = {"Java", "python", "Git y GitHub", "Programación java", "Estructura de Datos"};
    private String[] habilidadesBlandas = {"Trabajo en equipo", "Codigo limpio", "Resolucion de problemas", "Gestor de tiempo", "proactividad" };
    private String idiomas = "Español - Nativo\nEnglish - Básico (B2)\n";
    private String perfil = "Estudiante universitario de tiempo completo en IUCMC";
    private String experiencia = "";
    //-------------------------------------------------------------//
    private String educacion = "2022-2027\n[IUCMC] - [IUCMC]\n[Popayán]";
    private String[] areasInteres = {"Desarrollo Backend", "Bases de Datos", "Buenas Prácticas de Programación"};
    private String proyectos = "";
    // =================================================

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }
    public String[] getHabilidadesTecnicas() { return habilidadesTecnicas; }
    public void setHabilidadesTecnicas(String[] h) { this.habilidadesTecnicas = h; }
    public String[] getHabilidadesBlandas() { return habilidadesBlandas; }
    public void setHabilidadesBlandas(String[] h) { this.habilidadesBlandas = h; }
    public String getIdiomas() { return idiomas; }
    public void setIdiomas(String idiomas) { this.idiomas = idiomas; }
    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }
    public String getExperiencia() { return experiencia; }
    public void setExperiencia(String exp) { this.experiencia = exp; }
    public String getEducacion() { return educacion; }
    public void setEducacion(String ed) { this.educacion = ed; }
    public String[] getAreasInteres() { return areasInteres; }
    public void setAreasInteres(String[] a) { this.areasInteres = a; }
    public String getProyectos() { return proyectos; }
    public void setProyectos(String p) { this.proyectos = p; }

    public String getHabilidadesTecnicasFormateadas() {
        return "• " + String.join("\n• ", habilidadesTecnicas);
    }
    public String getHabilidadesBlandasFormateadas() {
        return "• " + String.join("\n• ", habilidadesBlandas);
    }
    public String getAreasInteresFormateadas() {
        return "• " + String.join("\n• ", areasInteres);
    }
}
