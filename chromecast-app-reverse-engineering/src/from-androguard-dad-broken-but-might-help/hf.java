	private static hj a
	
	    static hf()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 14) {
	            if (android.os.Build$VERSION.SDK_INT < 11) {
	                if (android.os.Build$VERSION.SDK_INT < 8) {
	                    hf.a = new hj();
	                } else {
	                    hf.a = new hg();
	                }
	            } else {
	                hf.a = new hh();
	            }
	        } else {
	            hf.a = new hi();
	        }
	        return;
	    }
	
	
	    public static int a(android.view.ViewConfiguration p1)
	    {
	        return hf.a.a(p1);
	    }
	
	
	    public static boolean b(android.view.ViewConfiguration p1)
	    {
	        return hf.a.b(p1);
	    }
	
