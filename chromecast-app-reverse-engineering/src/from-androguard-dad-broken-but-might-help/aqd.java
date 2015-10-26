	final blp a
	final android.content.Context b
	final java.lang.String c
	final java.lang.String d
	 aqf e
	 tz f
	 ua g
	 apk h
	  i
	  j
	
	    public aqd(android.content.Context p1, String p2, String p3, blp p4)
	    {
	        this.b = p1;
	        this.c = p2;
	        this.d = p3;
	        this.a = p4;
	        return;
	    }
	
	
	    void a()
	    {
	        if ((this.f != null) && (this.g != null)) {
	            this.f.a(this.g);
	            this.g = 0;
	        }
	        return;
	    }
	
	
	    void a(boolean p2)
	    {
	        if (!this.i) {
	            this.i = 1;
	            this.a();
	            if (this.h != null) {
	                this.h.c();
	            }
	            if ((p2) && (this.e != null)) {
	                this.e.b();
	            }
	        }
	        return;
	    }
	
	
	    boolean a(uh p3, String p4, boolean p5)
	    {
	        int v0_5;
	        if (!com.google.android.gms.cast.CastDevice.a(p3.m).d.getHostAddress().equals(p4)) {
	            v0_5 = 0;
	        } else {
	            this.h = apk.a(p3, com.google.android.apps.chromecast.app.SetupApplication.a(), new aqg(this, p5));
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
