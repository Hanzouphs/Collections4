import java.util.*;

public class ExemploMap {
    public static void main(String[] args) throws Exception {

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos: ");
        System.out.println(" ");
        Map<String, Double> carrosPolulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPolulares.toString());
        System.out.println(" ");
        
        // System.out.println("Substitua o consumo do gol por 15.2 km/l: ");
        // carrosPolulares.put("gol", 15.2);
        // System.out.println(" ");
        // System.out.println(carrosPolulares);
        // System.out.println(" ");
        
        System.out.println("Confira se o modelo Tucson esta no dicionario: " + carrosPolulares.containsKey("tucson"));
        System.out.println(" ");
        
        System.out.println("Exiba o consumo do uno: " + carrosPolulares.get("uno"));
        System.out.println(" ");
        
        System.out.println("Exiba os modelos: " + carrosPolulares.keySet());
        System.out.println(" ");

        System.out.println("Exiba os consumos: " + carrosPolulares.values());
        System.out.println(" ");
        
        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        System.out.println(" ");
        Double consumoMaisEficiente = Collections.max(carrosPolulares.values());
        Set<Map.Entry<String, Double>> entryes = carrosPolulares.entrySet();
        String modeloMaisEficiente = "";
        
        for(Map.Entry<String, Double> entry: entryes){
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println(" ");

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        System.out.println(" ");
        Double consumoMenosEficiente = Collections.min(carrosPolulares.values());
        Set<Map.Entry<String, Double>> entryes2 = carrosPolulares.entrySet();
        String modeloMenosEficiente = "";
        
        for(Map.Entry<String, Double> entry: entryes2){
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        
        System.out.println(" ");
        
        Iterator<Double> iterator = carrosPolulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        
        System.out.println("Exiba a soma dos consumos: " + String.format("%.2f", soma));
        System.out.println("");
        
        System.out.println("Exiba a media dos consumos: " + String.format("%.2f", (soma/carrosPolulares.size())));
        System.out.println("");
        
        // System.out.println("Remova os modelos com consumo igua a 15,6 km/l: ");
        
        // Iterator<Double> iterator1 = carrosPolulares.values().iterator();
        // while(iterator1.hasNext()){
        //     if(iterator1.next().equals(15.6)) iterator1.remove();
        // }
        // System.out.println("");
        // System.out.println(carrosPolulares);
        
        
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(carrosPolulares);
        System.out.println("");
        System.out.println(carrosPopulares1);
        System.out.println("");
        
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPolulares);
        System.out.println("");
        System.out.println(carrosPopulares2);
        System.out.println("");
        
        System.out.println("Apague o dicionario de carros: ");
        carrosPolulares.clear();
        System.out.println("");
        System.out.println("Confira se o dicionario esta vazio: " + carrosPolulares.isEmpty());
        




    }
}
