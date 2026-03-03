package OOPSinJAVA;



public class studentclass {

    public static void main(String[] args) {
        student x = new student();
            x.name = "Abhay";

            x.percent = 92.5;
        System.out.println(x.name);
        x.setRno(76);
        System.out.println(x.getRno());
    }
}
