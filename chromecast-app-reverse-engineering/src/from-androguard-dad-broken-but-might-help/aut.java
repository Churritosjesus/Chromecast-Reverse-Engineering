	private synthetic java.util.UUID a
	private synthetic aus b
	
	    aut(aus p1, android.os.Looper p2, java.util.UUID p3)
	    {
	        this.b = p1;
	        this.a = p3;
	        this(p2);
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p4)
	    {
	        switch (p4.what) {
	            case 0:
	                this.b.a(((String) p4.obj).getBytes(blj.a), this.a);
	                break;
	            case 1:
	                this.b.a.obtainMessage(1).sendToTarget();
	                break;
	        }
	        return;
	    }
	
