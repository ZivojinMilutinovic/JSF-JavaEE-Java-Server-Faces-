import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class UtakmicaController {
	
private String ekipa1;
	
	private String ekipa2;
	
	private String ishod;
	
	private String mestoodrzavanja;
	
private String aekipa1;
	
	private String aekipa2;
	
	private String ashod;
	
	private String aestoodrzavanja;
	
	private String aid;
	
	private String bid;
	
	@EJB
	private UtakmicaService service;

	public String getEkipa1() {
		return ekipa1;
	}

	public void setEkipa1(String ekipa1) {
		this.ekipa1 = ekipa1;
	}

	public String getEkipa2() {
		return ekipa2;
	}

	public void setEkipa2(String ekipa2) {
		this.ekipa2 = ekipa2;
	}

	public String getIshod() {
		return ishod;
	}

	public void setIshod(String ishod) {
		this.ishod = ishod;
	}

	public String getMestoodrzavanja() {
		return mestoodrzavanja;
	}

	public void setMestoodrzavanja(String mestoodrzavanja) {
		this.mestoodrzavanja = mestoodrzavanja;
	}

	public String getAekipa1() {
		return aekipa1;
	}

	public void setAekipa1(String aekipa1) {
		this.aekipa1 = aekipa1;
	}

	public String getAekipa2() {
		return aekipa2;
	}

	public void setAekipa2(String aekipa2) {
		this.aekipa2 = aekipa2;
	}

	public String getAshod() {
		return ashod;
	}

	public void setAshod(String ashod) {
		this.ashod = ashod;
	}

	public String getAestoodrzavanja() {
		return aestoodrzavanja;
	}

	public void setAestoodrzavanja(String aestoodrzavanja) {
		this.aestoodrzavanja = aestoodrzavanja;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}
	
	public void dodajUtakmicu(String ekipa1,String ekipa2,String ishod,String mestoodrzavanja)
	{
		service.dodajUtakmicu(ekipa1, ekipa2, ishod, mestoodrzavanja);
	}
	public void izbrisiUtakmicu(String id)
	{
		service.izbrisiUtakmicu(id);
	}
	public void azurirajUtakmicu(String id,String ekipa1,String ekipa2,String ishod,String mestoodrzavanja)
	{
		service.azurirajUtakmicu(id, ekipa1, ekipa2, ishod, mestoodrzavanja);
	}
	public List<Utakmica> spisakUtakmica(){
		return service.spisakUtakmica();
	}

}
