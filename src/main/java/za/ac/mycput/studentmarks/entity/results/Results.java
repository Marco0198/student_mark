package za.ac.mycput.studentmarks.entity.results;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;


@Entity
@Table(name="results")
    public class Results  {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="results_id")
        private int resultsId;
       @Column(name="results_desc")
        private String resultsDesc;
        @Column(name="results_type")
        private String resultsType;

    public int getResultsId() {
        return resultsId;
    }

    public String getResultsDesc() {
        return resultsDesc;
    }

    public String getResultsType() {
        return resultsType;
    }

    private Results(){}

        private Results(Builder builder){
          this.resultsId = builder.resultsId;
            this.resultsDesc = builder.resultsDesc;
            this.resultsType = builder.resultsType;

        }




        @Override
        public String toString() {
            return "Results{" +
                    "resultsId='" + resultsId + '\'' +
                    ", resultsDesc='" + resultsDesc + '\'' +
                    ", resultsType='" + resultsType + '\'' +
                    '}';
        }

        public static class Builder {
            @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            @Column(name="results_id")
            private int resultsId;
            @Column(name="results_desc")
            private String resultsDesc;
            @Column(name="results_type")
            private String resultsType;

            public Builder resultsId(int resultId){
                this.resultsId = resultsId;
                return this;
            }

            public Builder resultsDesc(String resultsDesc){
                this.resultsDesc = resultsDesc;
                return this;
            }

            public Builder resultsType(String resultsType){
                this.resultsType = resultsType;
                return this;
            }


            public Builder copy(Results results){
                this.resultsId = results.resultsId;
                this.resultsDesc = results.resultsDesc;
                this.resultsType = results.resultsType;
                return this;
            }

            public Results build(){ return new Results(this);
            }

        }
    }

