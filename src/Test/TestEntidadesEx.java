package Test;

import java.util.Date;

import DaoImp.TblProductoImp;
import DaoImp.TblUsuarioImp;
import model.TblProductot1;
import model.TblUsuariot1;

public class TestEntidadesEx {
	public static void main(String[] args){
		/*
		//Registramos usuario
		TblUsuariot1 tblusuario = new TblUsuariot1();
		TblUsuarioImp tblusuarioimp = new TblUsuarioImp();
		
		//Registramos Usuarios
		tblusuario.setUsuariot1("Enrique");
		tblusuario.setPasswordt1("123456");
		tblusuarioimp.RegistrarUsuario(tblusuario);
		
		System.out.println("Se registro un usuario..");	*/
		
		
		
		//Regristramos producto
		TblProductot1 tblproducto = new TblProductot1();
		TblProductoImp tblproductoimp = new TblProductoImp();
		
		tblproducto.setNombret1("Chisito");
		tblproducto.setPreciot1(2.00);
		tblproducto.setDescripciont1("Chisito picante");
		tblproducto.setEstadot1("Recien ingresado");
		Date fecha = new Date();
		Date fechasql = new Date(fecha.getTime());
		tblproducto.setFechafabrit1(fechasql);
		tblproducto.setFechavencimt1(fechasql);
		
		System.out.println("Se registro nuevo Producto....");
		
	}	
}
