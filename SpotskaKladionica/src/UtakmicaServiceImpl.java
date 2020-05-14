import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UtakmicaServiceImpl implements UtakmicaService {
	@PersistenceContext(name = "SpotskaKladionica")
	private EntityManager em;

	@Override
	public void dodajUtakmicu(String ekipa1, String ekipa2, String ishod, String mestoodrzavanja) {
		Utakmica ut=new Utakmica(ekipa1, ekipa2, ishod, mestoodrzavanja);
		em.persist(ut);
		
	}

	@Override
	public void izbrisiUtakmicu(String id) {
		int bid=Integer.parseInt(id);
		Utakmica ut=em.find(Utakmica.class, bid);
		em.remove(ut);
		
	}

	@Override
	public void azurirajUtakmicu(String id, String ekipa1, String ekipa2, String ishod, String mestoodrzavanja) {
		int bid=Integer.parseInt(id);
		Utakmica ut=em.find(Utakmica.class, bid);
		ut.setEkipa1(ekipa1);
		ut.setEkipa2(ekipa2);
		ut.setIshod(ishod);
		ut.setMestoodrzavanja(mestoodrzavanja);
		
	}

	@Override
	public List<Utakmica> spisakUtakmica() {
		List<Utakmica> sveUtakmice = em.createQuery("SELECT u FROM Utakmica u", Utakmica.class).getResultList();
		return sveUtakmice;
	}

}
