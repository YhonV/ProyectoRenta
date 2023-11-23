package modelo;

public class Casa extends Vivienda{
    private int anio_antiguedad;
    private int cant_pisos;

    public Casa(String id_vivienda, double metros_cuadrados, String comuna, int habitaciones, int valor_renta,int anio_antiguedad, int cant_pisos) {
        super(id_vivienda, metros_cuadrados, comuna, habitaciones, valor_renta);
        this.anio_antiguedad = anio_antiguedad;
        this.cant_pisos = cant_pisos;
    }

    public Casa(int anio_antiguedad, int cant_pisos) {
        this.anio_antiguedad = anio_antiguedad;
        this.cant_pisos = cant_pisos;
    }

    public int getAnio_antiguedad() {
        return anio_antiguedad;
    }

    public void setAnio_antiguedad(int anio_antiguedad) {
        this.anio_antiguedad = anio_antiguedad;
    }

    public int getCant_pisos() {
        return cant_pisos;
    }

    public void setCant_pisos(int cant_pisos) {
        this.cant_pisos = cant_pisos;
    }
    
    @Override
    public int garantia() {
        int nuevaG = 0;
        if (cant_pisos == 1) {
            nuevaG += super.garantia();
        } else {
            nuevaG += super.garantia();
            nuevaG += (int) (super.garantia() * 0.35);
        }
        return nuevaG;
    }
  
    public int contribucion(){
        int valor = 0;
        if(getComuna().equals("Las Condes") || getComuna().equals("Lo Barnechea") || getComuna().equals("Providencia") || getComuna().equals("Vitacura")){
            if (anio_antiguedad < 15){
            valor = 160000;
            }else if(anio_antiguedad >= 15 && anio_antiguedad < 25){
                valor = 100000;
            }else if(anio_antiguedad >= 25)
                valor = 60000;
        }else if(anio_antiguedad < 15){
            valor = 75000;
        }else if(anio_antiguedad >= 15)
            valor = 50000;
        return valor;
    }
    
}