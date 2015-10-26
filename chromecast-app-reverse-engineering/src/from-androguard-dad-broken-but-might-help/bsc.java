	private synthetic bsb a
	
	    bsc(bsb p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
	            bsb v0_2 = this.a.b();
	            bsb.a(this.a, 0);
	            if ((v0_2 != null) && (!bsb.b(this.a))) {
	                this.a.a();
	            }
	        } else {
	            bsb.a(this.a).b().a(this);
	        }
	        return;
	    }
	
