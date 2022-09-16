import java.time.LocalDate;
import java.util.Date;

public class GiftCard {
    private long codigo;
    private int clave;
    private int monto;
    private Date vencimiento;
    private Trabajador trabajador; // COLABORACION

    public GiftCard() {
        this.codigo = 0;
        this.clave = 0;
        this.monto = 0;
        this.vencimiento = null;
        this.trabajador = null;
    }
    public GiftCard(long codigo, int clave, int monto, Date vencimiento, Trabajador trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vencimiento = vencimiento;
        this.trabajador = trabajador;
    }

    public Trabajador getTrabajor() {
        return trabajador;
    }

    public void setTrabajor(Trabajador trabajor) {
        this.trabajador = trabajor;
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
        return "GiftCard{" + "codigo=" + codigo + ", clave=" + clave + ", monto=" + monto + ", vencimiento=" + vencimiento + ", trabajador=" + trabajador + '}';
    }
    
    public long generarCodigo(long codigo)
    {
        this.codigo = codigo +1;
        return this.codigo;
    }
    
    public void generarClave()
    {
        String rut = String.valueOf(this.trabajador.getRut());
        rut = rut.substring(0, 4);
        this.clave = Integer.parseInt(rut);
    }
    
    public boolean verificarSaldo(int montoCompra)
    {
        if(montoCompra > this.monto)
            return false;
        else
            return true;
    }
    
    public int descontar(int montoCompra)
    {
        if(montoCompra <= this.monto)
        {
            this.monto -= montoCompra; // saldo o cero
            return this.monto;
        }
        else
        {
            return -1;
        }
    }
    public boolean validarVigencia()
    {
        if(this.vencimiento.before(java.sql.Date.valueOf(LocalDate.now())))
            return false;
        else
            return true;
    }
    
}
