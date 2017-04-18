/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author UPEU
 * @param <Pojo>
 */
public interface Operaciones<Pojo> {
    public int create(Pojo p);
    public int edit(Pojo p);
    public int delete(int key);
    public List<Pojo> readAll();
    public Pojo read(int key);
}
