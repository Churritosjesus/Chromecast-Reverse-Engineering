	private synthetic bk a
	
	    bl(bk p1, android.os.Looper p2)
	    {
	        this.a = p1;
	        this(p2);
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p2)
	    {
	        switch (p2.what) {
	            case 1:
	                bk.a(this.a);
	                break;
	            default:
	                super.handleMessage(p2);
	        }
	        return;
	    }
	
