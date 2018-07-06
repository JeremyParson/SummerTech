package hashMaps;

public class MainProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap test = new MyHashMap();
		test.put("gdasgdsgasdgO0WR", 2);
		test.put("E559D1FB1B687811", 1);
		test.put("asfrasoe;a[ep[pewf", 3);
		test.put("raghuioajewaiopghp", 4);
		test.put("gftdsagdafnswioGE", 5);
		test.put("ioetjniowetpuPOFEWQ", 6);
		test.put("agadsgagasgasdgsd", 7);
		test.put("weatwetweatwtaetwet", 8);
		test.put("gtaerygraweyhraweasd", 9);
		
		System.out.println(test.get("gdasgdsgasdgO0WR"));
		
		System.out.println(test.get("E559D1FB1B687811")); //Should return 1
		
		System.out.println(test.get("asfrasoe;a[ep[pewf"));
		System.out.println(test.get("raghuioajewaiopghp"));
		System.out.println(test.get("gftdsagdafnswioGE"));
		System.out.println(test.get("ioetjniowetpuPOFEWQ"));
		System.out.println(test.get("agadsgagasgasdgsd"));
		System.out.println(test.get("weatwetweatwtaetwet"));
		System.out.println(test.get("gtaerygraweyhraweasd"));
		System.out.print(test.size());
		
	}

}
