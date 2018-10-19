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
public abstract class DefaultShip {
	private int idShip;
	private int wShip;
	private int nbShip;
	private ArrayList <Case> caseShip = new ArrayList<Case>();
	/**
	 * @return the caseShip
	 */
	public ArrayList<Case> getCaseShip() {
		return caseShip;
	}
	/**
	 * @param caseShip the caseShip to set
	 */
	public void setCaseShip(ArrayList<Case> caseShip) {
		this.caseShip = caseShip;
	}
	/**
	 * @return the idShip
	 */
	public int getIdShip() {
		return idShip;
	}
	/**
	 * @return the wShip
	 */
	public int getwShip() {
		return wShip;
	}
	/**
	 * @return the nbShip
	 */
	public int getNbShip() {
		return nbShip;
	}
	
	public DefaultShip(int idShip, int wShip, int nbShip, ArrayList<Case> caseShip) {
		super();
		this.idShip = idShip;
		this.wShip = wShip;
		this.nbShip = nbShip;
		this.caseShip = new ArrayList<Case>();
	}
	
	
}

