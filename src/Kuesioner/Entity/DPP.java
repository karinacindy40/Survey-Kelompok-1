/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Entity;

/**
 *
 * @author demi
 */
public class DPP {
    private boolean visited;
    private int status;

    public DPP(boolean visited, int status) {
        this.visited = visited;
        this.status = status;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DPP{" + "visited=" + visited + ", status=" + status + '}';
    }
    
    
}
