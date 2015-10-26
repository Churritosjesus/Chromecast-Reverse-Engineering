	private synthetic avm a
	private synthetic bdn b
	private synthetic ava c
	
	    avk(ava p1, android.os.Looper p2, avm p3, bdn p4)
	    {
	        this.c = p1;
	        this.a = p3;
	        this.b = p4;
	        this(p2);
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p3)
	    {
	        switch (p3.what) {
	            case 0:
	                this.a.a(this.c.a);
	                break;
	            case 1:
	                this.b.b_(-1);
	                break;
	        }
	        return;
	    }
	
