package DaoImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariot1;

public class TblUsuarioImp implements IUsuario {

	@Override
	public void RegistrarUsuario(TblUsuariot1 tblusuario) {
		//Conectando a la bd, para el registro de usuario
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proy_JPA_LPII_T1_CRISTOPHER_LOYOLA");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(tblusuario);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			 e.printStackTrace(); // Imprime el error en la consola para depuración
		}finally{
			em.close();
		}
	}

}
