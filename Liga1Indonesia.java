//Heru subakti_TugasSesi3_PBO
//20210040071_TI21A
package Sesi4class;
public class Liga1Indonesia extends LigaIndonesia {
     @Override
     public void ligaINDO(){
        super.ligaINDO();
        System.out.println("PERSIB");
        System.out.println("PERSIPURA");
        System.out.println("PERSIJA");
        System.out.println("PERSEBAYA");
        System.out.println("AREMA");
        
    }

    public static void main(String[] args) {
        Liga1Indonesia L = new Liga1Indonesia();

        L.ligaINDO();
    }
}

