	private synthetic kj a
	
	    public kk(kj p2)
	    {
	        this.a = p2;
	        this(new android.os.Handler());
	        return;
	    }
	
	
	    public final boolean deliverSelfNotifications()
	    {
	        return 1;
	    }
	
	
	    public final void onChange(boolean p3)
	    {
	        kj v0 = this.a;
	        if ((v0.b) && ((v0.c != null) && (!v0.c.isClosed()))) {
	            v0.a = v0.c.requery();
	        }
	        return;
	    }
	
