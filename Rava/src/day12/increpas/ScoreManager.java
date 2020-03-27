package day12.increpas;

public class ScoreManager {

	public static void main(String[] args) {
		
		
		ScoreInfoDto[] cls = new ScoreInfoDto[5];
		String[] name = {"±èÁ¾Çü", "¹İÀå´Ô", "¾ÈÈ«ÁÖ", "¿ìÇö¿ì", "¹Ú±âÀ±"};
		for(int i=0; i<5; i++) {
			cls[i] = new ScoreInfoDto();
		}
		
		for(int i=0; i<5; i++) {
			cls[i].setName(name[i]);
			cls[i].setJava(randomScore());
			cls[i].setCss(randomScore());
			cls[i].setDb(randomScore());
			cls[i].setHtml(randomScore());
			cls[i].setJs(randomScore());
			cls[i].setSum();
			cls[i].setAvg(cls[0].getSum() );
		}
		
		System.out.println(cls[0].getName());
		System.out.println(cls[0].getSum());
		System.out.println(cls[0].getAvg());
		
	}
	
	public static int randomScore() {
		return (int)(Math.random() * 41) + 60;
	}

}
