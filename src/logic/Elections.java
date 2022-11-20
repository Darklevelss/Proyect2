package logic;


import java.util.Random;

public class Elections {

    private int [][] votes;
    private Candidate []candidates;
    private Town []towns;

    /***
     * constructor
     * @param candidates arreglo de candidatos
     * @param towns arreglo de ciudades
     */
    public Elections( Candidate[]candidates,Town[]towns ) {

        this.candidates=candidates;
        this.towns=towns;
        votes=new int [candidates.length][towns.length];
        fillMatriz();
        totalOfVotesCandidate();
        totalOfVotesTowns();


    }
   private void fillMatriz(){

        for( var i = 0 ; i < votes.length ; i++ ){
            for( var j = 0 ; j < votes[i].length; j++ ){

                votes[i][j] = new Random().nextInt(100 ) ;}

            }
        }

    /***
     * metodo que me retorna la matriz de votos
      * @return
     */
    private int[][] getVotes(){
        return votes.clone();
    }
    //establece el total de votos de cada candidatos
    private void totalOfVotesCandidate(){
    for (int i =0;i<votes.length;i++){
        for(int j=0;j<votes[0].length;j++){
            candidates[i].setTotalVotes(candidates[i].getTotalVotes()+votes[i][j]);
        }
    }
    }
    //setea el total de votos de cada ciudad
    private void totalOfVotesTowns(){
        for (int i =0;i<votes.length;i++){
            for(int j=0;j<votes[0].length;j++){
                towns[i].setTotalVotes(towns[i].getTotalVotes()+votes[j][i]);
            }
        }

    }
    //retorna la posicion de el candidato ganador
    public Candidate getWinner(){
        int pos=0;
        for (int i=1;i< candidates.length;i++){
            if(candidates[i-1].getTotalVotes()<candidates[i].getTotalVotes()){
                pos=i;
            }
        }
        return candidates[pos];
    }

    /***
     * recibe la posicion del candidato y establece cual es el promedio de votos
     * @param pos posicion del candidato(usar con el findCandidate
     * @return el promedio
     */
    public double average(int pos){

        return candidates[pos].getTotalVotes()/ towns.length;
    }

    /**
     * metodo que recibe la posicion del candidato y me retorna donde tuvo menos votos
     * @param posCandidate posicion del candidato(usarlo con el findCandidate)
     * @return pos dentro del arreglo de ciudades donde obtuvo menos votos
     */
    public int getLessVotes(int posCandidate){
        int posLess=0,min=0;
        for(int i=0;i<votes.length;i++){
            if(votes[posCandidate][i]<min){
                posLess=i;
                min=votes[posCandidate][i];
            }
        }
        return posLess;
    }

    /***
     * método que me retorna donde un candidato tuvo mas votos
     * @param posCandidate posicion del candidato(usarlo con el findCandidate)
     * @return pos dentro del arreglo de ciudades donde obtuvo más votos
     */
    public int getMostVotes(int posCandidate){
        int posMost=0, max=0;

        for(int i=0;i<votes.length;i++){
            if(votes[posCandidate][i]>max){
                posMost=i;
                max=votes[posCandidate][i];
            }
        }
        return posMost;
    }

    /***
     * metodo privado que me encuentra a un candidato por el nombre, si pos=-1 lanzar un error
     * @param name nombre del candidato
     * @return posicion del candidato
     */
    public int findCandidate(String name){
        int pos=-1;

        for (int i=0;i<candidates.length;i++){
            if(candidates[i].getName().equalsIgnoreCase(name)){
                pos=i;
            }
        }

        return pos;
    }

}
