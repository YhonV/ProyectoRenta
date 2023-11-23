package modelo;

public class Departamento extends Vivienda{
    private int gasto_comun;
    private String terraza;

    public Departamento(String id_vivienda, double metros_cuadrados, String comuna, int habitaciones, int valor_renta,int gasto_comun, String terraza) {
        super(id_vivienda, metros_cuadrados, comuna, habitaciones, valor_renta);
        this.gasto_comun = gasto_comun;
        this.terraza = terraza;
    }

    public int getGasto_comun() {
        return gasto_comun;
    }

    public void setGasto_comun(int gasto_comun) {
        this.gasto_comun = gasto_comun;
    }

    public String getTerraza() {
        return terraza;
    }

    public void setTerraza(String terraza) {
        this.terraza = terraza;
    }
    
    
    @Override
    public int garantia() {
        int nuevaG = 0;
        if (terraza.compareToIgnoreCase("no") == 0) {
            nuevaG += super.garantia();
        } else {
            nuevaG += super.garantia();
            nuevaG += (int) (super.garantia() * 0.25);
        }
        return nuevaG;
    }
    
    public int comision(){
        int valorComision = 0;
        if (getComuna().equals("Las Condes") || getComuna().equals("Lo Barnechea") || getComuna().equals("Providencia") || getComuna().equals("Vitacura")){
            valorComision += getValor_renta() * 0.6;
        }else{
            valorComision = (int) (getValor_renta() * 0.3);
        }
        return valorComision;
    }
    

}