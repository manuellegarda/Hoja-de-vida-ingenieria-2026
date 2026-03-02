package hojadevida.modelo;

/**
 * Modelo de datos para la Hoja de Vida.
 */
public class DatosHojaVida {

    // ========== PERSONALIZA TUS DATOS AQUÍ ==========
    private String nombre = "Manuel Arturo Melo Legarda";
    private String titulo = "]Ingeniero Informático y Tecnólogo en desarrollo en Software";
    private String ciudad = "Colmbia, Popayán";
    private String telefono = "+57 317 8538119";
    private String email = "manuel.melo@unimayor.edu.co";
    private String github = "github.com/manuellegarda";
    private String[] habilidadesTecnicas = {"Java", "Git y GitHub", "Programación", "Estructura de Datos"};
    private String[] habilidadesBlandas = {"Trabajo en equipo", "Comunicación", "Resolución de problemas"};
    private String idiomas = "Español - Nativo\nEnglish - Básico (B2) - Intermedio -";
    private String perfil = "Docente tiempo completo Institución Universitaria, Diseña algoritmos y programas para solucionar problemas específicos, aplicando el paradigma orientado a objetos.";
    private String experiencia = "2024-2025\n[Cargo] - [Empresa]\n[Ciudad]";
    private String educacion = "2020-2025\n[Carrera] - [Universidad]\n[Ciudad]";
    private String[] areasInteres = {"Estructura de Datos y algortimos", "Procesamiento de lenguaje natural", "Ingeniería de Software y hardware"};
    private String proyectos = "• [PLN En detección de emociones] - [deteccion mediante lenguaje natural de emociones en texto]\n" +
            "• [Simulación de tráfico] - [Simulación de tráfico vehicular utilizando algoritmos de optimización]\n" +
            "• [Sistema de recomendación] - [Desarrollo de un sistema de recomendación de películas utilizando técnicas de aprendizaje automático]";
    
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
