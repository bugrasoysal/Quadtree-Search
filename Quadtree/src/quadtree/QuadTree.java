package quadtree;



public class QuadTree {
    private Node node;
    private Node node2;
    public static int sayi=0,sayi2=0;
    public static double xx,yy;
    public static double minx, miny, maxx, maxy;
    

   

   
    public Node getNode() {
        return node;
    }

    public void insert(double x, double y, double minx, double miny, double maxx, double maxy) {
        
        if (node == null) {
        if(sayi2==0){
            this.minx=minx;
            this.miny=miny;
            this.maxx=maxx;
            this.maxy=maxy;
        }    
        node = new Node(x, y, this.minx, this.miny, this.maxx, this.maxy);
            System.out.println(" "+x+" "+y);    
        } else {
            
            insert(node, x, y, minx, miny, maxx, maxy);
        }
    }
   
    public void insert(Node node, double x, double y ,double minx, double miny, double maxx, double maxy) {
        
        if (x <= node.x && y <= node.y)  {
            this.sayi=2;
            
                             
          
            if (node.SW == null) {
                node.SW = new QuadTree();
                  
                  
                  this.minx=node.minx;
                  this.miny=node.miny; 
                  this.maxx=this.xx;
                  this.maxy=this.yy;
                 
            }
            
            node.SW.insert(x, y, minx, miny, maxx, maxy);
           
        }
        else if (x <= node.x && y > node.y) {
            this.sayi=1;
            
                             
                 

            if (node.NW == null) {
                node.NW = new QuadTree();
                 
                  this.minx=node.minx;
                  this.miny=this.yy;
                  this.maxx=this.xx;      
                  this.maxy=node.maxy;
                
            }
           
            node.NW.insert(x, y, minx, miny, maxx, maxy);
        }
        else if (x > node.x && y <= node.y)  {
            this.sayi=4;
            

            if (node.SE == null) {
                node.SE = new QuadTree();
               
               
                this.minx=this.xx;
                this.miny=node.miny;
                this.maxx=node.maxx;
                this.maxy=this.yy;
            }
            node.SE.insert(x, y, minx, miny, maxx, maxy);
        }
        else if (x > node.x && y > node.y) {
            this.sayi=3;
           

            if (node.NE == null) {
                
                node.NE = new QuadTree();
              
               
                this.minx=this.xx;
                this.maxx=node.maxx;
                this.miny=this.yy;
                this.maxy=node.maxy;
                
            }
            node.NE.insert(x, y, minx, miny, maxx, maxy);
        }
    }
    
  public void bolgebul(double x, double y) {
        
        if (node2 == null) {
             
        node2 = new Node(x, y);
        
        } else {
            
            bolgebul(node2, x, y);
        }
    }
 public void bolgebul(Node node2, double x, double y) {
        
        if (x <= node2.x && y <= node2.y)  {
            this.sayi2=2;
            
         
            if (node2.SW == null) {
                node2.SW = new QuadTree();  
                this.xx=node2.x;
                this.yy=node2.y;
            }
            
            node2.SW.bolgebul(x, y);
           
        }
        else if (x <= node2.x && y > node2.y) {
            this.sayi2=1;
           
         
            if (node2.NW == null) {
                node2.NW = new QuadTree();
                this.xx=node2.x;
                this.yy=node2.y;  
            }
           
            node2.NW.bolgebul(x, y);
        }
        else if (x > node2.x && y <= node2.y)  {
            this.sayi2=4;
            

            if (node2.SE == null) {
                node2.SE = new QuadTree();
                this.xx=node2.x;
                this.yy=node2.y;
            }
            node2.SE.bolgebul(x, y);
        }
        else if (x > node2.x && y > node2.y) {
            this.sayi2=3;

            if (node2.NE == null) {
                
                node2.NE = new QuadTree();
                this.xx=node2.x;
                this.yy=node2.y;
                
                
            }
            node2.NE.bolgebul(x, y);
        }
    }
 public void ara(double x1, double x2, double y1, double y2)
 {
    
     if(node==null)
     {
      System.out.println("Nokta Bitti3");
     } 
     else
     {   
         if(x1<node.x && node.x<x2 && y1<node.y && node.y<y2)
         {
          System.out.println("Nokta-x="+node.x+" Nokta-y="+node.y);
          ara(node, x1,x2,y1,y2);
         }
         else
         {
           // System.out.println("Nokta Bitti1");
            ara(node, x1,x2,y1,y2);
         } 
     } 
 }
public void ara(Node node, double x1, double x2,double y1,double y2)
 {    
      
     
          if(node.SE==null){
               //System.out.println("Nokta Bitti2");   
          }
          else
               node.SE.ara(x1, x2, y1, y2);
      
          if(node.NE==null)
          {
               //System.out.println("Nokta Bitti2");
               
          }
          else
               node.NE.ara(x1, x2, y1, y2);
     
          if(node.SW==null)
          {
              // System.out.println("Nokta Bitti2");
          }
          else
               node.SW.ara(x1, x2, y1, y2);
     
          if(node.NW==null)
          {
               //System.out.println("Nokta Bitti2");
          }
          else
               node.NW.ara(x1, x2, y1, y2);
      }
    
}
