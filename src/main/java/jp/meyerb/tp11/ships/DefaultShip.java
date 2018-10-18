/**
 * 
 */
package jp.meyerb.tp11.ships;

/**
 * @author Brice
 *
 */
public abstract class DefaultShip {
	private int idShip;
	private int wShip;
	private int nbShip;
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
	
	public DefaultShip(int idShip, int wShip, int nbShip) {
		super();
		this.idShip = idShip;
		this.wShip = wShip;
		this.nbShip = nbShip;
	}
	
	
}

