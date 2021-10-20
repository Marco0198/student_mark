package za.ac.mycput.studentmarks.entity.examination;
/* student_mark.java
 Entity for Examinations

 Author: Siyamtanda Tonjeni (217107958)
 Date: 20 October 2021
 */

import javax.persistence.*;
@Entity
@Table (name="Examinations")
public class Examinations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="exam_id")
    private int examId;
    private String examDate;
    private String examName;
    private String examType;
    private String  examDescription;

    public Examinations(Builder builder) {
        this.examId= builder.examId;
        this.examDate= builder.examDate;
        this.examName= builder.examName;
        this.examType=builder.examType;
        this.examDescription=builder.examDescription;
    }
    public Examinations(){}

    public void setExam_id(int examId) {
        this.examId = examId;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public void setExamDescription(String examDescription) {
        this.examDescription = examDescription;
    }

    @Override
    public String toString() {
        return "Examinations{" +
                "exam_id=" + examId +
                ", exam_date='" + examDate + '\'' +
                ", exam_name='" + examName + '\'' +
                ", exam_type='" + examType + '\'' +
                ", exam_description='" + examDescription + '\'' +
                '}';
    }

    public int getExamId() {
        return examId;
    }


    public static class Builder{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="exam_id")
        private int examId;
        @Column(name="exam_date")
        private String  examDate;
        @Column(name="exam_name")
        private String examName;
        @Column(name="exam_type")
        private String  examType;
        @Column(name="exam_description")
        private String examDescription;

        public Builder setExamId(int examId){
            this.examId= examId;
            return this;
        }
        public Builder setExamDate(String examDate){
            this.examDate= examDate;
            return this;
        }
        public Builder setExamName(String examName){
            this.examName= examName;
            return this;
        }
        public Builder setExamType(String examType){
            this.examType= examType;
            return this;
        }
        public Builder setExamDescription(String examDescription){
            this.examDescription= examDescription;
            return this;
        }

        public Builder copy(Examinations examinations){
            this.examId=examinations.examId;
            this.examDate=examinations.examDate;
            this.examName=examinations.examName;
            this.examType=examinations.examType;
            this.examDescription=examinations.examDescription;

            return this;
        }
        public Examinations build(){
            return new Examinations(this);
        }
    }
}
