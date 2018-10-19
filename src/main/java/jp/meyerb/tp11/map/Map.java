/**
 * 
 */
package jp.meyerb.tp11.map;

/**
 * @author Brice
 *
 */
public class Map {
	public int wMap = 24;
	public int hMap = 18;
	private int fullMap[][] = new int[wMap][hMap];
	
	public int[][] generateMap(int fullMap[][]) {
		for(int i = 0; 0 < wMap ; i++) {
			for (int j = 0; 0 < hMap; j++) {
				this.fullMap[i][j] = 0;
			}
		}
		return fullMap;
	}

	/**
	 * @return the hMap
	 */
	public int gethMap() {
		return hMap;
	}

	/**
	 * @return the wMap
	 */
	public int getwMap() {
		return wMap;
	}
	
	public Map(int hMap, int wMap, int fullMap[][]) {
		this.hMap = hMap;
		this.wMap = wMap;
		this.fullMap = fullMap;
	}
	
}

