package de.uka.ipd.sdq.dsexplore.bayesnets.utility;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class for visualizing a Bayesian Network or a Graph.
 * @author Apoorv
 *
 */
public class DrawGraph extends JPanel{
	/**
	 * Adjacency matrix for the network/graph
	 */
	int[][] Graph;
	
	/**
	 * Consructor for the class
	 * @param Graph - Adjacency matrix for the network/graph
	 */
	public DrawGraph(int[][] Graph){
		this.Graph = Graph;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] gr = new int[4][4];
		Random r = new Random();
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				gr[i][j] = r.nextInt(2);
			}
			
		}
		System.out.println(Math.sin(Math.PI/2));
		JFrame frame = new JFrame("Mini Tennis");
		frame.add(new DrawGraph(gr));
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawGraph dg = new DrawGraph(gr);
		dg.saveImage();
	}
	
	/**
	 * Used for saving the image as a JPEG file.
	 * @param None
	 * @return Nothing
	 * @author Apoorv
	 */
	public void saveImage(){
		BufferedImage img = new BufferedImage(800, 500, BufferedImage.TYPE_INT_ARGB);
		//BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D ig2 = img.createGraphics();
		paint(ig2);
		ig2.drawImage(img, null, 0, 0);
		
		try {
			ImageIO.write(img, "JPEG", new File("foo.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		int num = Graph.length;
		double radius=100;
		double[][] coor = new double[num][2];
		for(int i=0;i<num;i++){
				String str = Integer.toString(i);
				coor[i][0] = radius*Math.sin(i*2*Math.PI/num)+500;
				coor[i][1] = radius*Math.cos(i*2*Math.PI/num)+110;
				//g2d.drawOval((int)coor[i][0], (int)coor[i][1], 30, 30);
				drawCenteredCircle(g2d,(int)coor[i][0],(int)coor[i][1],15);
				g.drawString(str, (int)coor[i][0]-14, (int)coor[i][1]-14);
		}
		for(int i=0;i<num;i++){
			ArrayList<Integer> targets = getTargetNodes(i);
			for(int j=0;j<targets.size();j++){
				drawArrowLine(g,(int)coor[i][0], (int)coor[i][1], (int)coor[targets.get(j)][0], (int)coor[targets.get(j)][1],7,7);
			}
		}
		
		
		g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
		
		//BufferedImage img = new BufferedImage(1700, 1700, BufferedImage.TYPE_INT_ARGB); 
		
	}
	
	/**
	 * Gets the list of all nodes (children) to which 
	 * the node Node points.
	 * @param Node - Node in the Graph
	 * @return An ArrayList of integers which are the indices of the 
	 * target nodes
	 * @author Apoorv
	 */
	public ArrayList<Integer> getTargetNodes(int Node){
		ArrayList<Integer> TargetNodes = new ArrayList<Integer>();
		for(int i=0;i<Graph.length;i++){
			if(Graph[Node][i] == 1){
				TargetNodes.add(i);
			}
		}
		return TargetNodes;
	}
	
	/**
	 * Draws a circle with radius r and center (x,y)
	 * @param g - Graphics2D object
	 * @param x - x coordinate of circle center
	 * @param y - y coordinate of circle center
	 * @param r - radius of circle
	 * @return Nothing
	 * @author Apoorv
	 */
	public void drawCenteredCircle(Graphics2D g, int x, int y, int r) {
		  x = x-(r/2);
		  y = y-(r/2);
		  g.fillOval(x,y,r,r);
		}
	
	/**
     * Draw an arrow line betwwen two point 
     * @param g the graphic component
     * @param x1 x-position of first point
     * @param y1 y-position of first point
     * @param x2 x-position of second point
     * @param y2 y-position of second point
     * @param d  the width of the arrow
     * @param h  the height of the arrow
     */
    private void drawArrowLine(Graphics g, int x1, int y1, int x2, int y2, int d, int h){
       int dx = x2 - x1, dy = y2 - y1;
       double D = Math.sqrt(dx*dx + dy*dy);
       double xm = D - d, xn = xm, ym = h, yn = -h, x;
       double sin = dy/D, cos = dx/D;

       x = xm*cos - ym*sin + x1;
       ym = xm*sin + ym*cos + y1;
       xm = x;

       x = xn*cos - yn*sin + x1;
       yn = xn*sin + yn*cos + y1;
       xn = x;

       int[] xpoints = {x2, (int) xm, (int) xn};
       int[] ypoints = {y2, (int) ym, (int) yn};

       g.drawLine(x1, y1, x2, y2);
       g.fillPolygon(xpoints, ypoints, 3);
    }

}
