package datar;

public class Persegi {
	int keliling;
	float luas;

	public int kelilingPersegi(int sisiPersegi) {
		keliling = sisiPersegi * 4;
		return keliling;
	}

	public float luasPersegi(int sisiPersegi) {
		luas = sisiPersegi * sisiPersegi;
		return luas;
	}
}