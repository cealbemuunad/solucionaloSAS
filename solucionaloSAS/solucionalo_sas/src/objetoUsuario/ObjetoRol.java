package objetoUsuario;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.TableView.TableRow;

public class ObjetoRol implements ShowTableBase{

	int idrol;
	String codigo;
	String descripcion;
	public ObjetoRol(int idrol, String codigo, String descripcion) {
		super();
		this.idrol = idrol;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString(){
		return this.descripcion;
	}
	@Override
	public Object[] showDataTable() {
		// TODO Auto-generated method stub
		return new Object[]{descripcion};
	}
	
	
}
