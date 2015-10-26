	private static gh a
	
	    static gd()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 12) {
	            if (android.os.Build$VERSION.SDK_INT < 9) {
	                if (android.os.Build$VERSION.SDK_INT < 5) {
	                    gd.a = new gh();
	                } else {
	                    gd.a = new ge();
	                }
	            } else {
	                gd.a = new gf();
	            }
	        } else {
	            gd.a = new gg();
	        }
	        return;
	    }
	
	
	    public static int a(android.view.MotionEvent p1)
	    {
	        return (p1.getAction() & 255);
	    }
	
	
	    public static int a(android.view.MotionEvent p1, int p2)
	    {
	        return gd.a.a(p1, p2);
	    }
	
	
	    public static int b(android.view.MotionEvent p1)
	    {
	        return ((p1.getAction() >> 8) & 255);
	    }
	
	
	    public static int b(android.view.MotionEvent p1, int p2)
	    {
	        return gd.a.b(p1, p2);
	    }
	
	
	    public static float c(android.view.MotionEvent p1, int p2)
	    {
	        return gd.a.c(p1, p2);
	    }
	
	
	    public static int c(android.view.MotionEvent p1)
	    {
	        return gd.a.a(p1);
	    }
	
	
	    public static float d(android.view.MotionEvent p1, int p2)
	    {
	        return gd.a.d(p1, p2);
	    }
	
	
	    public static int d(android.view.MotionEvent p1)
	    {
	        return gd.a.b(p1);
	    }
	
	
	    public static float e(android.view.MotionEvent p1, int p2)
	    {
	        return gd.a.e(p1, p2);
	    }
	
