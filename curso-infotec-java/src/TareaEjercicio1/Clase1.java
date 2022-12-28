package TareaEjercicio1;

public class Clase1 {
    private Integer varInt;
    private String varString;
    private Double varDouble;
    private Boolean varBoolean;
    private Float varFloat;

    public Clase1(String varString, Integer varInt, Double varDouble, Boolean varBoolean, Float varFloat) {
        this.varString = varString;
        this.varInt = varInt;
        this.varDouble = varDouble;
        this.varBoolean = varBoolean;
        this.varFloat = varFloat;
    }

    public String getVarString() {
        return varString;
    }

    public void setVarString(String varString) {
        this.varString = varString;
    }

    public Integer getVarInt() {
        return varInt;
    }

    public void setVarInt(Integer varInt) {
        this.varInt = varInt;
    }

    public Double getVarDouble() {
        return varDouble;
    }

    public void setVarDouble(Double varDouble) {
        this.varDouble = varDouble;
    }

    public Boolean getVarBoolean() {
        return varBoolean;
    }

    public void setVarBoolean(Boolean varBoolean) {
        this.varBoolean = varBoolean;
    }

    public Float getVarFloat() {
        return varFloat;
    }

    public void setVarFloat(Float varFloat) {
        this.varFloat = varFloat;
    }
}
