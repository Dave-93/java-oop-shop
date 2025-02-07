
import java.util.Random;

public class Prodotto {
   
    //ATTRIBUTI
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;
    //

    //COSTRUTTORE con PARAMETRI se dentro le parentesi aggiungiamo dei valori richiesti
    public Prodotto(String nome, double prezzo, double iva){
        codiceRandom();//richiamandolo nel costruttore viene generato direttamente il codice ogni volta che viene creato un nuovo oggetto
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
    }   
    //

    //METODI
    public void codiceRandom (){
        Random numero = new Random();
        this.codice = numero.nextInt(100, 900);//
    } 
   
    public void prezzoBase(){
        this.prezzo = prezzo;
        System.out.println(String.format("Il prezzo base del prodotto %s è: %f", nome, prezzo));
    }

    public void prezzoIvato(){
        double prezzoIvato = prezzo + (prezzo * iva)/100 ;
        System.out.println(String.format("Il prezzo ivato del prodotto %s è %f", nome, prezzoIvato));
    }

    public void nomeEsteso(){
        String codiceConvertitaInString = Integer.toString(codice);//codice + ""; aggiungendo la stringa vuota trasformo l'int in string
        System.out.println(String.format("Il nome esteso del prodotto è: %s-%s", codiceConvertitaInString, nome));
    }
    //
}
