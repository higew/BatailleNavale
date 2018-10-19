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
public class Croiseur extends DefaultShip {
	public Croiseur(int idShip, int wShip, int nbShip, ArrayList<Case> caseShip) {
		super(3, 4, 2, caseShip);
	}
}
