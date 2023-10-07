
package Parcial1;


public class cls_trabjadores {
    private int int_id;
    private String str_nombre;
    private String str_apellidos;
    private int int_contacto;
    private String str_correo;
    private String str_direccion;
    private String str_sexo;
    private float  flt_salario;

    public cls_trabjadores(int int_id, String str_nombre, String str_apellidos, int int_contacto, String str_correo, String str_direccion, String str_sexo, float flt_salario) {
        this.int_id = int_id;
        this.str_nombre = str_nombre;
        this.str_apellidos = str_apellidos;
        this.int_contacto = int_contacto;
        this.str_correo = str_correo;
        this.str_direccion = str_direccion;
        this.str_sexo = str_sexo;
        this.flt_salario = flt_salario;
    }

    public void setInt_id(int int_id) {
        this.int_id = int_id;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public void setStr_apellidos(String str_apellidos) {
        this.str_apellidos = str_apellidos;
    }

    public void setInt_contacto(int int_contacto) {
        this.int_contacto = int_contacto;
    }

    public void setStr_correo(String str_correo) {
        this.str_correo = str_correo;
    }

    public void setStr_direccion(String str_direccion) {
        this.str_direccion = str_direccion;
    }

    public void setStr_sexo(String str_sexo) {
        this.str_sexo = str_sexo;
    }

    public void setFlt_salario(float flt_salario) {
        this.flt_salario = flt_salario;
    }

    public int getInt_id() {
        return int_id;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public String getStr_apellidos() {
        return str_apellidos;
    }

    public int getInt_contacto() {
        return int_contacto;
    }

    public String getStr_correo() {
        return str_correo;
    }

    public String getStr_direccion() {
        return str_direccion;
    }

    public String getStr_sexo() {
        return str_sexo;
    }

    public float getFlt_salario() {
        return flt_salario;
    }
    
    
}
