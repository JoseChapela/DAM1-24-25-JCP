package ud2.ejerciciosFunciones;

public class E0405 {
  
    public static boolean esVocal ( char letra ) {


        switch (Character.toLowerCase(letra)) {
            case 'a', 'e', 'i', 'o', 'u': return true;
            default: return false; 
        }
    }
    
}
