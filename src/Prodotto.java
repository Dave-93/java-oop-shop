public class Prodotto {
   
    //ATTRIBUTI
    public int codice;
    public String nome;
    public String descrizione;
    public int prezzo;
    public int iva;
    //

    //COSTRUTTORE con PARAMETRI se dentro le parentesi aggiungiamo dei valori richiesti
    public Prodotto(String nome, int prezzo, int iva){
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    //

    //METODI
    public int codiceRandom (){
        this.codice += (int) ((Math.random() * 100) + 1);//così genera un numero tra 1 e 100
        //System.out.println("Il codice generato è: " + codice); per verificare la creazione del codice
        return codice;
    } 

    public void prezzoBase(){
        this.prezzo = prezzo;
        System.out.println("Il prezzo base del prodotto " + nome + " è: " + prezzo);
    }

    public void prezzoIvato(){
        int prezzoIvato = prezzo + (prezzo * iva)/100 ;
        System.out.println("Il prezzo ivato del prodotto " + nome + " è: " + prezzoIvato);
    }

    public void nomeEsteso(){
        String codiceConvertitaInString = Integer.toString(codice);//codice + ""; aggiungendo la stringa vuota trasformo l'int in string
        System.out.println("Il nome esteso del prodotto è: " + codiceConvertitaInString + "-" + nome);
    }
    //
}
