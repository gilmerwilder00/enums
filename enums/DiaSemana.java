package enums;

public enum DiaSemana {

    LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO;

    public boolean esDiaLaboral(){
        return  !(this == SÁBADO || this == DOMINGO);// || (or)
    }
}
