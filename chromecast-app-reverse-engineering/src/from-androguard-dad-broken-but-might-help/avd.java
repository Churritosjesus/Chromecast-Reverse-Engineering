	private synthetic bdn a
	
	    avd(ava p1, android.os.Looper p2, bdn p3)
	    {
	        this.a = p3;
	        this(p2);
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p3)
	    {
	        switch (p3.what) {
	            case 0:
	                this.a.a(0);
	                break;
	            case 1:
	                this.a.b_(-1);
	                break;
	        }
	        return;
	    }
	
