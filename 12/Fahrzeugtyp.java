import java.util.HashMap;
import java.util.Map;

public class Fahrzeugtyp {
	
	private static final Map<String, Fahrzeugtyp> instances = new HashMap<String, Fahrzeugtyp>();

	private int Gebuehr = 0;
	private int Parkflaeche = 0;
	
    private Fahrzeugtyp() {
    	
    }
    public static Fahrzeugtyp getInstance(String key) {
        synchronized (instances) {
            Fahrzeugtyp instance = instances.get(key);
            if (instance == null) {
                instance = new Fahrzeugtyp();
                instances.put(key, instance);
            }
            return instance;
        }
    }
    public static void setGebuehr(String key, int g) {
    	instances.get(key).Gebuehr = g;
    }
    public static void setParkflaeche(String key, int p) {
    	instances.get(key).Parkflaeche = p;
    }
    public static int getGebuehr(String key) {
    	return instances.get(key).Gebuehr;
    }
    public static int getParkflaeche(String key) {
    	return instances.get(key).Parkflaeche;
    }
}