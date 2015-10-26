	private static final java.util.WeakHashMap a
	
	    static bz()
	    {
	        bz.a = new java.util.WeakHashMap();
	        return;
	    }
	
	
	    bz()
	    {
	        return;
	    }
	
	
	    public static bz a(android.content.Context p3)
	    {
	        try {
	            cb v0_2 = ((bz) bz.a.get(p3));
	        } catch (cb v0_6) {
	            throw v0_6;
	        }
	        if (v0_2 == null) {
	            if (android.os.Build$VERSION.SDK_INT < 17) {
	                v0_2 = new cb(p3);
	            } else {
	                v0_2 = new ca(p3);
	            }
	            bz.a.put(p3, v0_2);
	        }
	        return v0_2;
	    }
	
