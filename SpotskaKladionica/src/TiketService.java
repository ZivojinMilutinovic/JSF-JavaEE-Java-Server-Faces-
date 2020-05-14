import java.util.List;

public interface TiketService {
	public void dodajTiket(String utakmicaid,String tiketid,String kvota, String ishod,String vrednost);
	public List<Utakmica> spisakUtakmicaZaTiket(String id);
	public void dodajUtakmicu(String id,String uid);
	public void izbrisiUtakmicu(String id,String uid);
	public void brisanjeTiketa(String bid);
}
