package orden;
public class Detalle_orden {
	private int cantidad;
	private int subTotal;
	void setCantidad(int i) {
		this.cantidad=i;
	}
	int getCantidad() {
		return this.cantidad;
	}
	void setSubTotal(int i) {
		this.subTotal=i;
	}
	int getSubTotal() {
		return this.subTotal;
	}
}
