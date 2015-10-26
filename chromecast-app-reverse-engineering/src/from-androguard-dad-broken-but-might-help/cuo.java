	private synthetic cum a
	
	    cuo(cum p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final boolean handleMessage(android.os.Message p6)
	    {
	        if ((1 == p6.what) && (cum.e().equals(p6.obj))) {
	            this.a.c();
	            if ((cum.b(this.a) > 0) && (!cum.c(this.a))) {
	                cum.d(this.a).sendMessageDelayed(cum.d(this.a).obtainMessage(1, cum.e()), ((long) cum.b(this.a)));
	            }
	        }
	        return 1;
	    }
	
