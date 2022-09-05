import java.util.Date;

public class GiftCard {
    private long codigo;
    private int clave;
    private int monto;
    private Date vencimiento;
    private Trabajador trabajor;

    public GiftCard() {
        this.codigo = 0;
        this.clave = 0;
        this.monto = 0;
        this.vencimiento = null;
        this.trabajor = null;
    }
    public GiftCard(long codigo, int clave, int monto, Date vencimiento, Trabajador trabajor) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vencimiento = vencimiento;
        this.trabajor = trabajor;
    }

    public Trabajador getTrabajor() {
        return trabajor;
    }

    public void setTrabajor(Trabajador trabajor) {
        this.trabajor = trabajor;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    @Override
    public String toString() {
        return "GiftCard{" + "codigo=" + codigo + ", clave=" + clave + ", monto=" + monto + ", vencimiento=" + vencimiento + ", trabajor=" + trabajor + '}';
    }
    
    
    
}
