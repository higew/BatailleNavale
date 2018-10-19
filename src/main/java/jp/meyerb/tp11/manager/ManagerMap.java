/**
 * 
 */
package jp.meyerb.tp11.manager;

/**
 * @author Brice
 *
 */

//fonction placement bateau (play)
//rand.nextInt(tailleX)

//bateau placable, (switch?)
//

public class ManagerMap {
	private int tailleY = gethMap();
	private int tailleX = getwMap();
	private double x = Math.random() * tailleY;
	private double y = Math.random() * tailleX;
	private double direction = Math.random() * 100;
	private boolean flag = true;
	
	public int PlaceShip (){
		if (direction == 0) {
			for (int i = 0; 0 < getwShip()-1; i++) {
				if (NON((x+i) < tailleX) || map[x+i][y] != 0) {
					flag = false;
				}
			}
		}
		else {
			for (int i = 0; 0 < getwShip()-1; i++) {
				if (NON((y+i) < tailleY) || map[x][y+i] != 0) {
					flag = false;
				}
			}
		}
	
		if (flag == true) {
			PlaceBateau(map,bateauId,bateauWidth,x,y,direction)
		}
		else {
			TestPlaceBateau(map,bateauId,bateauWidth)
		}
		return;
	}
	
	public int 
}
