package duoc.basedatos.modelo;

public class Dato {
	
	private String id;
	private Object data;
	/****************CONSTRUCTORES*********************/
	public Dato(String id, Object data) {
	this.id = id;
	this.data = data;
	}
	
	
	public Dato() {
		
	}
	
	/****************GETTERS Y SETTERS*********************/
	public String getId() {
	return id;
	}
	public Object getData() {
	return data;
	}
	public void setData(Object data) {
	this.data = data;
	}
	public String toString() {
	return "Dato [id=" + id + ", data=" + data + "]";
	}

}
