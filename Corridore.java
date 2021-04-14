
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author loreb
 */
public class Corridore extends Thread{
    private String nome;
    private static int metri = 100;
    private static ArrayList<String> classificaCorsa = new ArrayList<>();
    private static boolean arrivato = false;
    private static int tempoDiStampa = 1;
    
    public Corridore(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getMetri() {
        return metri;
    }

    public static void setMetri(int metri) {
        Corridore.metri = metri;
    }

    public static ArrayList<String> getClassificaCorsa() {
        return classificaCorsa;
    }

    public static void setClassificaCorsa(ArrayList<String> classificaCorsa) {
        Corridore.classificaCorsa = classificaCorsa;
    }

    public static boolean isArrivato() {
        return arrivato;
    }

    public static void setArrivato(boolean arrivato) {
        Corridore.arrivato = arrivato;
    }

    public static int getTempoDiStampa() {
        return tempoDiStampa;
    }

    public static void setTempoDiStampa(int tempoDiStampa) {
        Corridore.tempoDiStampa = tempoDiStampa;
    }
    
    @Override
    public void run(){
        for(int i = 0; i < metri; i++){
            if((i+1)%tempoDiStampa == 0){
                System.out.println(this.nome + " " + (i+1) + "m");
            }
        }
    }
    
    public static synchronized void addToClassifica(String nome){
        if(arrivato){
            stampArrivo(nome);
            classificaCorsa.add(nome);
        }
    }
    
    public static void stampArrivo(String nome){
        System.out.println(nome + " ha concluso la gara!!!!!");
    }
    
    public static void stampaClassifica(){
        for (int i = 0; i < classificaCorsa.size(); i++) {
            System.out.println("n." + (i+1) + " >>>>> " + classificaCorsa.get(i));
        }
    }
}
