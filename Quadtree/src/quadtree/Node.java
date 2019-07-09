/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadtree;

/**
 *
 * @author Buğra
 */
public class Node {
    double x, y;
    double minx, miny, maxx, maxy;
    QuadTree NW, NE, SW, SE;
   
    public Node(double x, double y, double minx, double miny, double maxx, double maxy) {
        this.x = x;
        this.y = y;
        this.minx=minx;
        this.miny=miny;
        this.maxx=maxx;
        this.maxy=maxy;
    }
    public Node(double x, double y) {
        this.x = x;
        this.y = y;
        
    }
}
