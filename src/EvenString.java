/**
 * Created by Pierre on 28/11/2014.
 */
public class EvenString extends String {

   public boolean printEven() {
       if (this == null) {
           return (false);
       } else {
           for (int i=0 ; i< this.length() && (i%2 == 0) ; i++)
               System.out.println(this.charAt(i));
           return(true);
       }
   }
}
