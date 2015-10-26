	private java.lang.ref.WeakReference a
	
	    bxf(bwz p2)
	    {
	        this.a = new ref.WeakReference(p2);
	        return;
	    }
	
	
	    public final void onReceive(android.content.Context p3, android.content.Intent p4)
	    {
	        String v1_0 = p4.getData();
	        bwz v0_0 = 0;
	        if (v1_0 != null) {
	            v0_0 = v1_0.getSchemeSpecificPart();
	        }
	        if ((v0_0 != null) && (v0_0.equals("com.google.android.gms"))) {
	            bwz v0_4 = ((bwz) this.a.get());
	            if (v0_4 != null) {
	                bwz.f(v0_4);
	            }
	        }
	        return;
	    }
	
