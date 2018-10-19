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
public class Corvette extends DefaultShip {
	public Corvette(int idShip, int wShip, int nbShip, ArrayList<Case> caseShip) {
		super(1, 1, 1, caseShip);
	}
}
