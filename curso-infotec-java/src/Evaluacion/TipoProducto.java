package Evaluacion;

import java.util.*;

import static java.time.chrono.JapaneseEra.values;

public enum TipoProducto {
        PAN_BIMBO("pan_bimbo", false), PALETA("paleta", false),
        CARNE("carne", false), LECHE("leche", false),
        AGUA("agua", false), PLATANO("platano", false),
        AGUACATE("aguacate", false), CALABAZA("calabaza", false),
        ZANAORIA("zanaoria", false), MANZANA("manzana",false),
        UVAS("uvas",false), NARANJA("naranja", false),
        QUESO("queso",false),REFRESCO("refresco",false),
        YOGURTH("yogurth",false),PAPAS("papas",false),
        TOMATE("tomate",false), CEBOLLA("cebolla",false),
        FRIJOLES("frijoles", false), CHILE("chile",false);

        private String nombreProducto;
        private boolean activo;

        private TipoProducto(String nombreProducto, boolean activo) {
            this.nombreProducto = nombreProducto;
            this.activo = activo;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public boolean isActivo() {
            return activo;
        }

        public void setActivo(boolean activo) {
            this.activo = activo;
        }



}
