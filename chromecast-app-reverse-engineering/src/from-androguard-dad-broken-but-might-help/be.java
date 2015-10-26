	private static final bf a
	
	    static be()
	    {
	        bf v0_0 = android.os.Build$VERSION.SDK_INT;
	        if (v0_0 < 15) {
	            if (v0_0 < 11) {
	                be.a = new bf();
	            } else {
	                be.a = new bg();
	            }
	        } else {
	            be.a = new bh();
	        }
	        return;
	    }
	
	
	    public static android.content.Intent a(android.content.ComponentName p1)
	    {
	        return be.a.a(p1);
	    }
	
