import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TiketServiceImpl implements TiketService {
	@PersistenceContext(name = "SpotskaKladionica")
	private EntityManager em;

	@Override
	public void dodajTiket(String utakmicaid, String tiketid, String kvota, String ishod, String vrednost) {
		Tiket t=new Tiket(utakmicaid,Integer.parseInt(tiketid),Integer.parseInt(kvota),
				ishod,Integer.parseInt(vrednost));
			em.persist(t);
		
	}

	@Override
	public List<Utakmica> spisakUtakmicaZaTiket(String id) {
	
		
			
		List<Utakmica> sveUtakmice = em.createQuery("SELECT u FROM Utakmica u", Utakmica.class).getResultList();
		if(id=="")
			return sveUtakmice;
		int bid=Integer.parseInt(id);
		
		Tiket t=em.find(Tiket.class, bid);
		final List<String> niz=Arrays.asList(t.getUtakmicaid().split(","));
		sveUtakmice.removeIf(new Predicate<Utakmica>() {
			@Override
			public boolean test(Utakmica p) {
				String r=Integer.toString(p.getId());
				return !niz.contains(r);
			}
		});
		
		
		
		return sveUtakmice;
		
	}

	@Override
	public void dodajUtakmicu(String id,String uid) {
		Tiket t=em.find(Tiket.class, Integer.parseInt(id));
		t.setUtakmicaid(t.getUtakmicaid()+","+uid);
		
	}

	@Override
	public void izbrisiUtakmicu(String id,String uid) {
		Tiket t=em.find(Tiket.class, Integer.parseInt(id));
		LinkedList<String> niz=new LinkedList<String>(Arrays.asList(t.getUtakmicaid().split(",")));
		niz.remove(uid);
		t.setUtakmicaid(String.join(",", niz));
		
	}
	@Override
	public void brisanjeTiketa(String bid) {
		Tiket t=em.find(Tiket.class, Integer.parseInt(bid));
		em.remove(t);
	}
	
	

}
