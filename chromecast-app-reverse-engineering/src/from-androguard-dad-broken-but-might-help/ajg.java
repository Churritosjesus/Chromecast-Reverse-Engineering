	private static final java.util.concurrent.ConcurrentHashMap a
	
	    static ajg()
	    {
	        ajg.a = new java.util.concurrent.ConcurrentHashMap();
	        return;
	    }
	
	
	    public static org.json.JSONObject a(String p1)
	    {
	        return ((org.json.JSONObject) ajg.a.get(p1));
	    }
	
	
	    public static void a(String p1, org.json.JSONObject p2)
	    {
	        ajg.a.put(p1, p2);
	        return;
	    }
	
