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
public class PorteAvion extends DefaultShip {
	public PorteAvion(int idShip, int wShip, int nbShip, ArrayList<Case> caseShip) {
		super(4, 6, 1, caseShip);
	}
}
