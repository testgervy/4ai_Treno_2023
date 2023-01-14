package prgTreno;

/**
 * <b> classe treno</b>
 * <p>array di oggetti</p>
 * <p>dati in ingresso:</p>
 * <UL>
 * <LI>nome
 * <LI>destinazione
 * <LI>vagoni massimi
 * </UL>

 * @author antonio gervasi
 * versione 3
 */
public class Treno {
	/**
	 * nome = nome del treno
	 */
	private String nome, destinazione;
	private int vagoniMax;
	
	private Vagone[] vagoni; //1 array di oggetti
		
	/**
	 * 
	 * @param nome				nome treno
	 * @param destinazione	citta'
	 * @param vagoniMax 
	 */
	public Treno(String nome, String destinazione, int vagoniMax) {
		this.nome = nome;
		this.destinazione = destinazione;
		this.vagoniMax = vagoniMax;
		vagoni = new Vagone[vagoniMax]; //2 array di oggetti
		
	}
	
	//aggiunta oggetto ad array vagoni
	
	public boolean addVagone(int pos, Vagone vag) {
		
		vagoni[pos]= vag;
		
		return true;
	}

	/**
	 * @return metodo che restituisce il treno completo
	 */
	public String toString() {
		String s="nome treno: "+nome+ " destinazione: "+destinazione+" vagoni max: "+vagoniMax;
		
		for (int i=0; i<vagoni.length; i++) {
			if(vagoni[i]!=null)
				s+=vagoni[i]+"\n"; //s+=vagoni[i]
		}
		return s;
	}

	public static void main(String[] args) {
		Treno t1 = new Treno("freccia rossa", "Milano", 10);
		
		Vagone v1 = new Vagone("prima", 20);
		Vagone v2 = new Vagone("seconda", 18);
		
		System.out.println(t1.addVagone(0, v1));
		System.out.println(t1.addVagone(1, v2));
		System.out.println(t1);	
	}

}
