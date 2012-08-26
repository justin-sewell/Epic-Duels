package mapPackage;

public class KaminoPlatformMap extends MainMap {

	public KaminoPlatformMap() {
		map = new int[][] {

				{ 0, 0, 4, 0, 0, 0, 1, 1, 1, 1 }, 
				{ 0, 0, 0, 0, 0, 5, 2, 2, 2, 0 },
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 5 },
				{ 0, 0, 4, 1, 0, 0, 5, 5, 0, 0 },
				{ 0, 1, 1, 1, 0, 5, 0, 0, 0, 5 },
				{ 0, 4, 1, 1, 0, 0, 2, 2, 2, 0 },
				{ 0, 0, 0, 4, 0, 0, 1, 1, 1, 1 } };
		name = "kamino";
	}

}
