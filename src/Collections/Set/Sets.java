package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {

    public Set<String> construirHashSet() {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");

        return hashSet;
    }

    public Set<String> construirLinkedHashSet() {

        Set<String> lSet = new LinkedHashSet<>();

        lSet.add("A");
        lSet.add("B");
        lSet.add("C");
        lSet.add("A");
        lSet.add("D");
        lSet.add("E");
        lSet.add("F");
        lSet.add("1Ggggggeegeg");
        lSet.add("2G2gggggeegeg");
        lSet.add("3Gggggeegeg");
        lSet.add("4Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("6Ggggggeegeg");
        lSet.add("G7gggggeegeg");

        return lSet;
    }

    public Set<String> construirTreeSet() {

        Set<String> tSet = new TreeSet<>();

        tSet.add("A");
        tSet.add("B");
        tSet.add("C");
        tSet.add("A");
        tSet.add("D");
        tSet.add("E");
        tSet.add("F");
        tSet.add("1Ggggggeegeg");
        tSet.add("2G2gggggeegeg");
        tSet.add("3Gggggeegeg");
        tSet.add("4Ggggggeegeg");
        tSet.add("5Ggggggeegeg");
        tSet.add("5Ggggggeegeg");
        tSet.add("6Ggggggeegeg");
        tSet.add("G7gggggeegeg");

        return tSet;
    }

    public Set<Contacto> construirHashSetContactos() {

        Set<Contacto> hCSet = new HashSet<>();

        hCSet.add(new Contacto("Juan", "Perez", "123456789"));
        hCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        hCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        hCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        hCSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado
        hCSet.add(new Contacto("Juan", "Lopez", "123456789"));

        return hCSet;
    }
}