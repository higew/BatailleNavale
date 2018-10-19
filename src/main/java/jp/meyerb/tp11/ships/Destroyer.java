/**
 * 
 */
package jp.meyerb.tp11.ships;

import java.util.ArrayList;

import jp.meyerb.tp11.map.Case;

/**
 * @author Brice
 *
 */
public class Destroyer extends DefaultShip {
	public Destroyer(int idShip, int wShip, int nbShip, ArrayList<Case> caseShip) {
		super(2, 3, 2, caseShip);
	}
}
