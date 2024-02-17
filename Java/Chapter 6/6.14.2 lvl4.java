import java.util.Scanner;
import java.util.ArrayList;

public class RecordsManager {
   private ArrayList<Certificate> certificateList = new ArrayList<Certificate>();

   public void inputCertificates(Scanner scnr) {
      while (scnr.nextInt() > 0) {
         Certificate cert = new Certificate();
         cert.readLevelAndHolder(scnr);
         certificateList.add(cert);
      }
   }

   public void printCertificates() {
      Certificate currCertificate;
      int i;

      for (i = 0; i < certificateList.size(); ++i) {
         currCertificate = certificateList.get(i);
         currCertificate.print();
      }
   }
}
