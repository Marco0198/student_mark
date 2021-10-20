package za.ac.mycput.studentmarks.factory.results;

import za.ac.mycput.studentmarks.entity.results.Results;




public class ResultsFactory {

    public static Results createResults( String resultsDesc, String resultsType){

        return new Results.Builder().resultsDesc(resultsDesc).resultsType(resultsType).build();

    }

}