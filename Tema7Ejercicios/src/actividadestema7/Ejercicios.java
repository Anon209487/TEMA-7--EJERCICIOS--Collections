package actividadestema7;
import java.util.*;
public class Ejercicios {

		    public static void main(String[] args) {
		    	 /* Ejercicio 1 */
		        List<Integer> listaOriginal = new ArrayList<>();
		        for (int i = 1; i <= 10; i++) {
		            listaOriginal.add(i);
		        }
		        
		        List<Integer> listaMezclada = new ArrayList<>(listaOriginal);
		        Collections.shuffle(listaMezclada);
		        
		        System.out.println("Lista Original: " + listaOriginal);
		        System.out.println("Lista Mezclada: " + listaMezclada);
		        
		        /* Ejercicio 2 */
		        Set<Integer> numerosUnicos = new LinkedHashSet<>();
		        Random random = new Random();
		        while (numerosUnicos.size() < 10) {
		            numerosUnicos.add(random.nextInt(20) + 1);
		        }
		        
		        System.out.println("Numeros Generados: " + numerosUnicos);
		       
		        /* Ejercicio 3 */
		        String texto = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		        Map<Character, Integer> conteoLetras = new HashMap<>();
		        
		        for (char letra : texto.toCharArray()) {
		            if (Character.isLetter(letra)) {
		                char letraMin = Character.toLowerCase(letra);
		                conteoLetras.put(letraMin, conteoLetras.getOrDefault(letraMin, 0) + 1);
		            }
		        }
		        
		        System.out.println("Conteo Letras:");
		        for (Map.Entry<Character, Integer> entry : conteoLetras.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
		}

	


