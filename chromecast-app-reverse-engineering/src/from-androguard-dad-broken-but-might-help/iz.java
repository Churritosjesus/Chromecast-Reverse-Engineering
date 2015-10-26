	private static final jc a
	
	    static iz()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 19) {
	            if (android.os.Build$VERSION.SDK_INT < 14) {
	                iz.a = new jc();
	            } else {
	                iz.a = new ja();
	            }
	        } else {
	            iz.a = new jb();
	        }
	        return;
	    }
	
	
	    public static jx a(android.view.accessibility.AccessibilityEvent p1)
	    {
	        return new jx(p1);
	    }
	
	
	    public static void a(android.view.accessibility.AccessibilityEvent p1, int p2)
	    {
	        iz.a.a(p1, p2);
	        return;
	    }
	
	
	    public static int b(android.view.accessibility.AccessibilityEvent p1)
	    {
	        return iz.a.a(p1);
	    }
	
