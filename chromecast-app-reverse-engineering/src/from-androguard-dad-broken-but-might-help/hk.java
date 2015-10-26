	private static hn a
	
	    static hk()
	    {
	        hn v0_0 = android.os.Build$VERSION.SDK_INT;
	        if (v0_0 < 21) {
	            if (v0_0 < 18) {
	                if (v0_0 < 14) {
	                    if (v0_0 < 11) {
	                        hk.a = new hn();
	                    } else {
	                        hk.a = new hl();
	                    }
	                } else {
	                    hk.a = new hm();
	                }
	            } else {
	                hk.a = new ho();
	            }
	        } else {
	            hk.a = new hp();
	        }
	        return;
	    }
	
	
	    public static void a(android.view.ViewGroup p2, boolean p3)
	    {
	        hk.a.a(p2, 0);
	        return;
	    }
	
