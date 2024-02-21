public class cls_productos {
    private int codigoint;
    private String nombreStr;
    private int existenciasint;
    private float precio_ventaflt;
    private float gananciasflt;
    
    public cls_productos(int codigoint, String nombreStr, int existenciasint, float precio_ventaflt,
            float gananciasflt) {
        this.codigoint = codigoint;
        this.nombreStr = nombreStr;
        this.existenciasint = existenciasint;
        this.precio_ventaflt = precio_ventaflt;
        this.gananciasflt = gananciasflt;
    }
    
}
