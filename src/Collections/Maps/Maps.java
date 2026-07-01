package Collections.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Collections.Maps.Maps;
import models.Contacto;

public class Maps {
    //set<v>
    //map<k,v>
    //map<tipoClave, Tipo valor>
    //map<String, Interger>
    
    public Map<String, Integer> construirHashMap(){
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A",10);
        mapa.put("B",20);
        mapa.put("C",30);
        mapa.put("A",50);
        System.out.println(mapa.size());
        System.out.println(mapa);

        for(int i=0; i<mapa.size(); i++){
            System.out.println(mapa.values().toArray()[i]);
        }
        for(String key : mapa.keySet()){
            System.out.println(key);
        }

        System.out.println(mapa.get("A"));
        System.out.println(mapa.get("B"));
        System.out.println(mapa.get("F"));

        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);
        System.out.println(mapa);


        return mapa;

    }

    public Map<String, Integer> cLinkedHMap(){
        Map<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("A",10);
        mapa.put("B",20);
        mapa.put("C",30);
        mapa.put("A",50);
        return mapa;
    }

    public Map<String, Integer> cTreeMap() {
    Map<String, Integer> mapa = new TreeMap<>();
    mapa.put("J", 10);
    mapa.put("B", 20);
    mapa.put("C", 30);
    mapa.put("A", 50);

    return mapa;
}
public List<contacto> ordenarUnicos(List<Contacto> contactos){
    //retornar contactos unicos 
    //uniscos solo por el nombre
    Set<Contacto> nueva = new TreeSet<>(
        (c1, c2) -> {
            if (c1.getNombre().equals(c2.getNombre())) {
                return 0;
            }
            return c1.getApellido().compareTo(c2.getApellido());
        }
    );
    for (Contacto contacto : contactos) {
        nueva.add(contacto);
    }
    return nueva;
    }
    //ordenar segun el apellido de manera descendente 
}
        
    
    



