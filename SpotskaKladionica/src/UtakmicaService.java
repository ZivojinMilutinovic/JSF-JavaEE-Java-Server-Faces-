import java.util.List;

public interface UtakmicaService {
	public void dodajUtakmicu(String ekipa1,String ekipa2,String ishod,String mestoodrzavanja);
	public void izbrisiUtakmicu(String id);
	public void azurirajUtakmicu(String id,String ekipa1,String ekipa2,String ishod,String mestoodrzavanja);
	public List<Utakmica> spisakUtakmica();
	

}
