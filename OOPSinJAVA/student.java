package OOPSinJAVA;

public class student {
    public String name;
    private int rno;  // Here rno is private
    public double percent;

    // for accessing rollno.
    public int getRno(){
        return rno;
    }
    // for getting rollno
    public void setRno(int roll){
        rno = roll;
    }

}
