package Demo01;


public class thongtinsinhvien {
    public static void main(String[] args) {
        Studen sv1 = new Studen();
        sv1.code="SE161090";
        sv1.name="Nguyen Tuan Loc";
        sv1.gpa=8.5f;
        sv1.viewgpa();
        
        Studen sv2=new Studen();
        sv2.code="SE171090";
        sv2.name="Nguyen Van An";
        sv2.gpa=8.0f;
        sv2.viewgpa();

        Studen sv3= new Studen();
        sv3.code="SE161099";
        sv3.name="Nguyen Tuan Vu";
        sv3.gpa=8.1f;
        sv3.viewgpa();

    }
}
