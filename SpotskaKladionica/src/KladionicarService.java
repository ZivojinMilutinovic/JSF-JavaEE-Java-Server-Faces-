import java.io.IOException;
import java.util.List;

public interface KladionicarService {

	public void DodajKladionicara(String ime, String prezime, String racun, String starost, String adresa);
	public void izbrisiKladionicara(String id);
    public void azurirajKladionicara(String id, String adresa,String ime,String prezime,String starost);
    public void uplatiNovacNaRacun(String id,String novac);
    public void skiniNovacSaRacuna(String id,String novac);
    public void dodajPogodjenuUtakmicu(String id);
    public void dodajPromaseniUtakmicu(String id);
    public List<Kladionicar> spisakKladionicara();
    public void sendGET(String ckid) throws IOException ;
}
