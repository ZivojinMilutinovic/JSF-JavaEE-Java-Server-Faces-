import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class KladionicarServiceImpl implements KladionicarService {
	@PersistenceContext(name = "SpotskaKladionica")
	private EntityManager em;

	@Override
	public void DodajKladionicara(String ime, String prezime, String racun, String starost, String adresa) {
		int Racun=Integer.parseInt(racun);
		int Starost=Integer.parseInt(starost);
		Kladionicar kladionicar=new Kladionicar(ime,prezime,Racun,Starost,adresa,0,0);
		em.persist(kladionicar);
	}

	@Override
	public void izbrisiKladionicara(String id) {
		int kid=Integer.parseInt(id);
	    Kladionicar k1 =em.find(Kladionicar.class, kid);
	    em.remove(k1);

	}

	@Override
	public void azurirajKladionicara(String id, String adresa, String ime, String prezime, String starost) {
		 
		    Kladionicar k1 =em.find(Kladionicar.class, Integer.parseInt(id));
		    
		    k1.setAdresa(adresa);
		    k1.setIme(ime);
		    k1.setPrezime(prezime);
		    k1.setStarost(Integer.parseInt(starost));

	}

	@Override
	public void uplatiNovacNaRacun(String id,String novac) {
		 Kladionicar k1 =em.find(Kladionicar.class, Integer.parseInt(id));
		 
		 k1.setRacun(k1.getRacun()+ Integer.parseInt(novac));

	}

	@Override
	public void skiniNovacSaRacuna(String id,String novac) {
         Kladionicar k1 =em.find(Kladionicar.class, Integer.parseInt(id));
 
		 int n=k1.getRacun()- Integer.parseInt(novac);
		 if(n>0)
		 k1.setRacun(n);
		 else {
			 System.out.println("Korisnikov racun je ispod nule ,ne moze se skinutu");
		 }

	}

	@Override
	public void dodajPogodjenuUtakmicu(String id) {
		Kladionicar k1 =em.find(Kladionicar.class, Integer.parseInt(id));
		k1.setPogodjeni(k1.getPogodjeni()+1);
		

	}

	@Override
	public void dodajPromaseniUtakmicu(String id) {
		Kladionicar k1 =em.find(Kladionicar.class, Integer.parseInt(id));
		
		k1.setPromaseni(k1.getPromaseni()+1);

	}

	@Override
	public List<Kladionicar> spisakKladionicara() {
		List<Kladionicar> sviKladionicari = em.createQuery("SELECT k FROM Kladionicar k", Kladionicar.class).getResultList();
		return sviKladionicari;
	}
	
	private static final String USER_AGENT = "Mozilla/5.0";



	@Override
	public void sendGET(String ckid) throws IOException {
		URL obj = new URL("http://192.168.99.100/?ckid="+ckid);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());
		} else {
			System.out.println("GET request not worked");
		}

	}

}
