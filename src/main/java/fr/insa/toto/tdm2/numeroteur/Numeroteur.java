/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.toto.tdm2.numeroteur;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author francois
 */
public class Numeroteur<TO> {

    private ArrayList<TO> objets;
    private HashMap<TO, Integer> index;

    public Numeroteur() {
        this.objets = new ArrayList<TO>();
        this.index = new HashMap<>();
    }

    public TO getObject(int index) {
        return this.objets.get(index);
    }

    public int getIndex(TO obj) {
        Integer index = this.index.get(obj);
        if (index == null) {
            throw new Error("objet n'existe pas");
        }
        return index;
    }

    public int add(TO obj) {
        if (this.index.get(obj) != null) {
            throw new Error("objet deja dans numéroteur");
        }
        this.objets.add(obj);
        int position = this.objets.size() - 1;
        this.index.put(obj, position);
        return position;
    }

    public int getOrAdd(TO obj) {
        Integer index = this.index.get(obj);
        if (index == null) {
            return this.add(obj);
        } else {
            return index;
        }
    }

}
