import javax.faces.bean.ManagedBean;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;

@ManagedBean
public class KladionicarController {
	  private String adresa="";
	     private String ime="";
	     private String prezime="";
	     private String starost="";
	     private String racun="";
	     private String brisanjeid="";
	     private String azurirajid="";  
	     private String azurirajime="";
	     private String azurirajadresa="";
	     private String azurirajprezime="";
	     private String azurirajstarost="";
	     private String uplatinovacid="";  
	     private String uplatinovac="";
	     private String skininovacid="";
	     private String skininovac="";
	     private String pogodjenaid="";
	     private String promasenaid="";
	     private String ckid="";  
	     
	     @EJB
	 	private KladionicarService service;

		public String getAdresa() {
			return adresa;
		}

		public void setAdresa(String adresa) {
			this.adresa = adresa;
		}
		public String getRacun() {
			return racun;
		}

		public void setRacun(String racun) {
			this.racun =racun;
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

		public String getStarost() {
			return starost;
		}

		public void setStarost(String starost) {
			this.starost = starost;
		}

		public String getBrisanjeid() {
			return brisanjeid;
		}

		public void setBrisanjeid(String brisanjeid) {
			this.brisanjeid = brisanjeid;
		}

		public String getAzurirajid() {
			return azurirajid;
		}

		public void setAzurirajid(String azurirajid) {
			this.azurirajid = azurirajid;
		}

		public String getAzurirajime() {
			return azurirajime;
		}

		public void setAzurirajime(String azurirajime) {
			this.azurirajime = azurirajime;
		}

		public String getAzurirajprezime() {
			return azurirajprezime;
		}

		public void setAzurirajprezime(String azurirajprezime) {
			this.azurirajprezime = azurirajprezime;
		}

		public String getAzurirajstarost() {
			return azurirajstarost;
		}

		public void setAzurirajstarost(String azurirajstarost) {
			this.azurirajstarost = azurirajstarost;
		}

		public String getUplatinovacid() {
			return uplatinovacid;
		}

		public void setUplatinovacid(String uplatinovacid) {
			this.uplatinovacid = uplatinovacid;
		}

		public String getUplatinovac() {
			return uplatinovac;
		}

		public void setUplatinovac(String uplatinovac) {
			this.uplatinovac = uplatinovac;
		}

		public String getSkininovacid() {
			return skininovacid;
		}

		public void setSkininovacid(String skininovacid) {
			this.skininovacid = skininovacid;
		}

		public String getSkininovac() {
			return skininovac;
		}

		public void setSkininovac(String skininovac) {
			this.skininovac = skininovac;
		}

		public String getPogodjenaid() {
			return pogodjenaid;
		}

		public void setPogodjenaid(String pogodjenaid) {
			this.pogodjenaid = pogodjenaid;
		}

		public String getPromasenaid() {
			return promasenaid;
		}

		public void setPromasenaid(String promasenaid) {
			this.promasenaid = promasenaid;
		}
	     
		  public void brisiKladionicar(String brisanjeid){
				service.izbrisiKladionicara(brisanjeid);
			}
		    
		        
			
			public void azurirajKladionicar(String azurirajid, String azurirajadresa,String azurirajime,String azurirajprezime,String azurirajstarost) {
				service.azurirajKladionicara(azurirajid, azurirajadresa, azurirajime, azurirajprezime, azurirajstarost);
			}
		        public void dodajKladionicar(String ime, String prezime, String racun, String starost, String adresa) {
				service.DodajKladionicara( ime,  prezime, racun,  starost, adresa);
			}
		        

		        public List<Kladionicar> sviKladionicari(){
		    		List<Kladionicar> kladionicari=service.spisakKladionicara();
		    		return kladionicari;
		    	}
		        
		        public void uplatiNovacNaRacun(String uplatinovacid,String uplatinovac)
		        {
		        	service.uplatiNovacNaRacun(uplatinovacid, uplatinovac);
		        }
		        public void skiniNovacSaRacuna(String skininovacid,String skininovac)
		        {
		        	service.skiniNovacSaRacuna(skininovacid, skininovac);
		        }
		        public void dodajPogodjenuUtakmicu(String pogodjenaid)
		        {
		        	service.dodajPogodjenuUtakmicu(pogodjenaid);
		        }
		        public void dodajPromaseniUtakmicu(String promasenaid)
		        {
		        	service.dodajPromaseniUtakmicu(promasenaid);
		        }

				public String getAzurirajadresa() {
					return azurirajadresa;
				}

				public void setAzurirajadresa(String azurirajadresa) {
					this.azurirajadresa = azurirajadresa;
				}

				public String getCkid() {
					return ckid;
				}

				public void setCkid(String ckid) {
					this.ckid = ckid;
				}
				public void sendGET(String ckid)
			    {
			    	try {
						service.sendGET(ckid);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    }
			    
		        
	     

}
