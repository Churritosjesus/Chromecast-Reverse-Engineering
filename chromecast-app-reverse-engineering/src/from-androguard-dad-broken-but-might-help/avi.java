	private synthetic bdn a
	private synthetic ava b
	
	    avi(ava p1, android.os.Looper p2, bdn p3)
	    {
	        this.b = p1;
	        this.a = p3;
	        this(p2);
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p3)
	    {
	        switch (p3.what) {
	            case 0:
	                this.b.c(this.a);
	                break;
	            case 1:
	                this.a.b_(-1);
	                break;
	        }
	        return;
	    }
	
