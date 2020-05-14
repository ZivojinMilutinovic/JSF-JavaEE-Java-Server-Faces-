import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "kladionicar")
public class Kladionicar {
	@TableGenerator(name = "kladionicar_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "kladionicar_gen")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "kladionicar_gen")
    @Column(name = "kid",updatable=false,nullable=false)
	private int id;
	
    private String ime;
	
	public Kladionicar(String ime, String prezime, int racun, int starost, String adresa, int pogodjeni,
			int promaseni) {
		
		
		this.ime = ime;
		this.prezime = prezime;
		this.racun = racun;
		this.starost = starost;
		this.adresa = adresa;
		this.pogodjeni = pogodjeni;
		this.promaseni = promaseni;
	}
	private String prezime;
	
	private int racun;
	
	private int starost;
	
	private String adresa;
	
	private int pogodjeni;
	
	private int promaseni;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getRacun() {
		return racun;
	}
	public void setRacun(int racun) {
		this.racun = racun;
	}
	public int getStarost() {
		return starost;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getPogodjeni() {
		return pogodjeni;
	}
	public void setPogodjeni(int pogodjeni) {
		this.pogodjeni = pogodjeni;
	}
	public int getPromaseni() {
		return promaseni;
	}
	public void setPromaseni(int promaseni) {
		this.promaseni = promaseni;
	}
	
	

	public Kladionicar()
	{}
	@Override
	public String toString() {
		return "Kladionicar [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", racun=" + racun + ", starost="
				+ starost + ", adresa=" + adresa + ", pogodjeni=" + pogodjeni + ", promaseni=" + promaseni + "]";
	}
	

}
