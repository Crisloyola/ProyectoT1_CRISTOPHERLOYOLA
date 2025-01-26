package DaoImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductot1;

public class TblProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProductot1 tblproducto) {
		//Conectamos Producto,.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proy_JPA_LPII_T1_CRISTOPHER_LOYOLA");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(tblproducto);
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally{
			em.close();
		}
	}

	@Override
	public void ActualizarProducto(TblProductot1 tblproducto) {
		// Actualizamos Producto.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdtloyola");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.merge(tblproducto);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
		}finally{
			em.close();
		}
		
	}

}
