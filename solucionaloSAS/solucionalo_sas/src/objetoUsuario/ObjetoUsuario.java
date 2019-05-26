package objetoUsuario;

public class ObjetoUsuario {
	int idusuario;
	String usre;
	String passw;
	int identificacion;
	String idTipodocumento;
	String primerNombre;
	String segundoNombre;
	String primerApellido;
	String segundoApellido;
	int edad;
	String direccion;
	int telefono;
	int rol;
	public ObjetoUsuario(int idusuario, String usre, String passw,
			int identificacion, String idTipodocumento, String primerNombre,
			String segundoNombre, String primerApellido,
			String segundoApellido, int edad, String direccion, int telefono,
			int rol) {
		super();
		this.idusuario = idusuario;
		this.usre = usre;
		this.passw = passw;
		this.identificacion = identificacion;
		this.idTipodocumento = idTipodocumento;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.rol = rol;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getUsre() {
		return usre;
	}
	public void setUsre(String usre) {
		this.usre = usre;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getIdTipodocumento() {
		return idTipodocumento;
	}
	public void setIdTipodocumento(String idTipodocumento) {
		this.idTipodocumento = idTipodocumento;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	@Override
	public String toString(){
		return this.primerNombre+segundoNombre;
	}
	
	

}
