public class Main {
    
    public static void main(String[] args) {
        
        Prodotto laptop = new Prodotto("lenovo", 500, 22);//INIZIALIZZAZIONE DINAMICA DELL'ISTANZA TRAMITE PARAMETRI
        //INIZIALIZZAZIONE MANUALE
        /* laptop.prezzo = 500;
        laptop.iva = 22;
        laptop.nome = "LENOVO"; */

        Prodotto smartphone = new Prodotto("Samsung", 899, 22);

        //RICHIAMO DEI METODI DALL'ISTANZA
        laptop.prezzoBase();
        laptop.prezzoIvato();
        laptop.nomeEsteso(); 

        smartphone.prezzoBase();
        smartphone.prezzoIvato();
        smartphone.nomeEsteso();
        // 
    }
}
