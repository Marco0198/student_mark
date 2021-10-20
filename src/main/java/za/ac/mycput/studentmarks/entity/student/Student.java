package za.ac.mycput.studentmarks.entity.student;
import javax.persistence.*;
/*
 * author:marco Mulondayi
 * 219049505
 *
 */

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_id")
    private int studentId;
    private long  studentNumber;
    private String  studentName;
    private long  studentPhoneNumber;
    private String  studentEmail;
    private String  studentPassword;
    private String  studentAddress;

    public Student(Builder builder) {
        this.studentId= builder.studentId;
        this.studentName=builder.studentName;
        this.studentEmail= builder.studentEmail;
        this.studentPassword= builder.studentPassword;
        this.studentPhoneNumber=builder.studentPhoneNumber;
        this.studentAddress=builder.studentAddress;
    }

    public Student() {

    }

    public int getStudentId() {
        return studentId;
    }
    public long getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public long getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentPhoneNumber='" + studentPhoneNumber + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentPassword='" + studentPassword + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
    public static class Builder{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="student_id")
        private int studentId;
        @Column(name="student_number")
        private long  studentNumber;
        @Column(name="student_name")
        private String  studentName;
        @Column(name="student_phone_number")
        private long  studentPhoneNumber;
        @Column(name="student_email")
        private String  studentEmail;
        @Column(name="student_password")
        private String  studentPassword;
        @Column(name="student_address")
        private String  studentAddress;



        public Builder setStudentId(int studentId){
            this.studentId= studentId;
            return this;
        }
        public Builder setStudentNumber(long studentNumber){
            this.studentNumber= studentNumber;
            return this;
        }

        public Builder setStudentName(String studentName){
            this.studentName= studentName;
            return this;
        }
        public Builder setStudentPhoneNumber(long studentPhoneNumber){
            this.studentPhoneNumber= studentPhoneNumber;
            return this;
        }
        public Builder setStudentEmail(String studentEmail){
            this.studentEmail= studentEmail;
            return this;
        }
        public Builder setStudentPassword(String studentPassword){
            this.studentPassword= studentPassword;
            return this;
        }
        public Builder setStudentAddress(String studentAddress){
            this.studentAddress= studentAddress;
            return this;
        }
        public Builder copy(Student student){

            this.studentId=student.studentId;
            this.studentNumber=student.studentNumber;
            this.studentName=student.studentName;
            this.studentPhoneNumber=student.studentPhoneNumber;
            this.studentEmail=student.studentEmail;
            this.studentPassword=student.studentPassword;
            this.studentAddress=student.studentAddress;

            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}