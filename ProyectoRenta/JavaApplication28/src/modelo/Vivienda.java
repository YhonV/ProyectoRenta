package modelo;

public class Vivienda {
    private String id_vivienda;
    private double metros_cuadrados;
    private String comuna;
    private int habitaciones;
    private int valor_renta;

    public Vivienda(String id_vivienda, double metros_cuadrados, String comuna, int habitaciones, int valor_renta) {
        this.id_vivienda = id_vivienda;
        this.metros_cuadrados = metros_cuadrados;
        this.comuna = comuna;
        this.habitaciones = habitaciones;
        this.valor_renta = valor_renta;
    }

    public Vivienda() {
    }

    public String getId_vivienda() {
        return id_vivienda;
    }

    public void setId_vivienda(String id_vivienda) {
        this.id_vivienda = id_vivienda;
    }

    public double getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(double metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getValor_renta() {
        return valor_renta;
    }

    public void setValor_renta(int valor_renta) {
        this.valor_renta = valor_renta;
    }
    
    public int garantia(){
        int garantia = 0;
        if(valor_renta >= 150000 && valor_renta < 300000){
            garantia = (int) (valor_renta*0.20);
        }else if (valor_renta >= 300000 && valor_renta < 450000){
            garantia = (int) (valor_renta*0.35);
        }else{
            garantia = (int) (valor_renta*0.50);
        }
        return garantia;
    }
}