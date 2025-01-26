package Test;

import java.util.Date;

import DaoImp.TblProductoImp;
import DaoImp.TblUsuarioImp;
import model.TblProductot1;
import model.TblUsuariot1;

public class TestEntidadesEx {
	public static void main(String[] args){
	
		//Registramos usuario
		TblUsuariot1 tblusuario = new TblUsuariot1();
		TblUsuarioImp tblusuarioimp = new TblUsuarioImp();
		
		//Registramos Usuarios
		tblusuario.setUsuariot1("gringo");
		tblusuario.setPasswordt1("123456");
		tblusuarioimp.RegistrarUsuario(tblusuario);
		
		System.out.println("Se registro un usuario..");	
		
		
		
		//Regristramos producto
		TblProductot1 tblproducto = new TblProductot1();
		TblProductoImp tblproductoimp = new TblProductoImp();
		/*
		tblproducto.setNombret1("Producto01");
		tblproducto.setPreciot1(5.00);
		tblproducto.setDescripciont1("");
		tblproducto.setEstadot1("Ingresado");
		Date fecha = new Date();
		Date fechasql = new Date(fecha.getTime());
		tblproducto.setFechafabrit1(fechasql);
		tblproducto.setFechavencimt1(fechasql);
		
		tblproductoimp.RegistrarProducto(tblproducto); //se añade registrar Usuario
		
		System.out.println("Se registro nuevo Producto....");*/
		
		//Actualizar Usuario.
		
		tblproducto.setNombret1("Producto01");
		tblproducto.setPreciot1(5.00);
		tblproducto.setDescripciont1("");
		tblproducto.setEstadot1("Ingresado");
		Date fecha = new Date();
		Date fechasql = new Date(fecha.getTime());
		tblproducto.setFechafabrit1(fechasql);
		tblproducto.setFechavencimt1(fechasql);
		
		tblproductoimp.ActualizarProducto(tblproducto);
		
		System.out.println("Se actualizo el producto..."); //Se actualiza producto
		
	}	
}
