	private synthetic m a
	
	    n(m p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p3)
	    {
	        switch (p3.what) {
	            case 1:
	                if (!this.a.c) {
	                } else {
	                    this.a.a(0);
	                }
	                break;
	            case 2:
	                this.a.b.m();
	                this.a.b.h();
	                break;
	            default:
	                super.handleMessage(p3);
	        }
	        return;
	    }
	
