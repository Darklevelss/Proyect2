package logic;



public class Runner {
    public static void main(String[] args) {


        Candidate candidate1, candidate2, candidate3, candidate4, candidate5;
        candidate1 = new Candidate("Luis",Gender.MALE);
        candidate2 = new Candidate("Daniela",Gender.FEMALE);
        candidate3 = new Candidate("Carolina",Gender.FEMALE);
        candidate4 = new Candidate("Ricardo",Gender.MALE);
        candidate5 = new Candidate("Paco",Gender.MALE);
        Candidate[] candidates = new Candidate[]{candidate1, candidate2, candidate3, candidate4, candidate5};
        new Town("Sogamoso");

        Town []towns=new Town[]{new Town("Sogamoso"),new Town("Duitama"),new Town("Paipa")};
        Elections elections = new Elections(towns.length,candidates.length);
        matriz(elections,candidates,towns);
    }
    private static void matriz(Elections elections,Candidate[]candidates,Town[]towns) {
        int[][] matriz = elections.getVotes();
        //System.out.println(Arrays.toString(candidates));
        for( var i = 0 ; i < matriz.length; i++ ){
           // System.out.print(towns[i].getName()+"\t");
            for ( var j = 0 ; j < matriz[0].length ; j++ ){

                System.out.print( matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
