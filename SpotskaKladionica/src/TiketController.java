import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class TiketController {
private String id;
	
	private String utakmicaid;
	
	private String kladionicarid;
	
	private String kvota;
	
	private String ishod;
	
	private String vrednost;
	
	private String sveutakmiceid;
	
	private String dodajid;
	private String dodajuid;
	private String izbrisiid;
	private String izbrisiuid;
	private String bid;
	@EJB
	private TiketService service;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUtakmicaid() {
		return utakmicaid;
	}

	public void setUtakmicaid(String utakmicaid) {
		this.utakmicaid = utakmicaid;
	}

	public String getKladionicarid() {
		return kladionicarid;
	}

	public void setKladionicarid(String kladionicarid) {
		this.kladionicarid = kladionicarid;
	}

	public String getKvota() {
		return kvota;
	}

	public void setKvota(String kvota) {
		this.kvota = kvota;
	}

	public String getIshod() {
		return ishod;
	}

	public void setIshod(String ishod) {
		this.ishod = ishod;
	}

	public String getVrednost() {
		return vrednost;
	}

	public void setVrednost(String vrednost) {
		this.vrednost = vrednost;
	}

	public String getSveutakmiceid() {
		return sveutakmiceid;
	}

	public void setSveutakmiceid(String sveutakmiceid) {
		this.sveutakmiceid = sveutakmiceid;
	}

	public String getDodajid() {
		return dodajid;
	}

	public void setDodajid(String dodajid) {
		this.dodajid = dodajid;
	}

	public String getDodajuid() {
		return dodajuid;
	}

	public void setDodajuid(String dodajuid) {
		this.dodajuid = dodajuid;
	}

	public String getIzbrisiid() {
		return izbrisiid;
	}

	public void setIzbrisiid(String izbrisiid) {
		this.izbrisiid = izbrisiid;
	}

	public String getIzbrisiuid() {
		return izbrisiuid;
	}

	public void setIzbrisiuid(String izbrisiuid) {
		this.izbrisiuid = izbrisiuid;
	}
	
	public void dodajTiket(String utakmicaid, String tiketid, String kvota, String ishod, String vrednost)
	{
		service.dodajTiket(utakmicaid, tiketid, kvota, ishod, vrednost);
	}
	public List<Utakmica> spisakUtakmicaZaTiket(String sveutakmiceid){
	return	service.spisakUtakmicaZaTiket(sveutakmiceid);
	}
	public void dodajUtakmicu(String dodajid,String dodajuid) {
		service.dodajUtakmicu(dodajid, dodajuid);
	}
	public void izbrisiUtakmicu(String izbrisiid,String izbrisiuid) {
		service.izbrisiUtakmicu(izbrisiid, izbrisiuid);
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}
	

}
