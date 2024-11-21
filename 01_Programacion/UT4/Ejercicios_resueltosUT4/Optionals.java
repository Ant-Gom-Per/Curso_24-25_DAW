import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        String[] llista = new String[10];
        /*
        Optional<String> GOT = Optional.of("Game of Thrones");            
        Optional<String> nothing = Optional.empty();

        System.out.println(GOT.orElse("Default Value")); 
        System.out.println(nothing.orElse("Default Value")); 
        */

        /*
        String str = llista[9];
        System.out.println(str.substring(1, 3));
        */
        
        /*
        //llista[9] = "HTML";
        Optional<String> optStr = Optional.ofNullable(llista[9]);
        if(optStr.isPresent()){
            System.out.println(optStr.get().substring(1,3));
        }
        else{
            System.out.println("No es pot obtindre (String buit)");
        }
        */

        /*
        //llista[9] = "HTML";
        Optional<String> optStr = Optional.ofNullable(llista[9]);
        optStr.ifPresentOrElse(
            (str)->{
                System.out.println(str.substring(1,3));
            },
            ()->{
                System.out.println("No es pot obtindre (String buit)");
            }
        );       
        */
    }
}
