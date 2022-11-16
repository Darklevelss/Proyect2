package logic;


import java.util.Random;

public class Elections {

    private int [][] votes;
    public Elections( int columns, int rows ) {


        votes=new int [rows][columns];
        fillMatriz();

    }
   private void fillMatriz(){

        for( var i = 0 ; i < votes.length ; i++ ){
            for( var j = 0 ; j < votes[i].length; j++ ){

                votes[i][j] = new Random().nextInt(100 ) ;}

            }
        }

    public int[][] getVotes(){
        return votes.clone();
    }

}
