	private static gs a
	
	    static gp()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 11) {
	            gp.a = new gq();
	        } else {
	            gp.a = new gr();
	        }
	        return;
	    }
	
	
	    public static float a(android.view.VelocityTracker p1, int p2)
	    {
	        return gp.a.a(p1, p2);
	    }
	
	
	    public static float b(android.view.VelocityTracker p1, int p2)
	    {
	        return gp.a.b(p1, p2);
	    }
	
