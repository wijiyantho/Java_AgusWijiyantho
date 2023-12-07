package JavaDigitalSkola;

public class Assignment2 {
    public static void main(String[] args) {
        int nilaiAwal = 10; // Assign nilaiAwal sama dengan banyak baris yang mau dibuat

        for(int i = 1; i <= nilaiAwal; i++){
           for(int j = 1; j <= i; j++){
               System.out.print("*");
               if((i+j)==(nilaiAwal+1)){
                   break;
               }
           }System.out.println();
        }
    }
}
