	final  a
	  b
	  c
	  d
	private final aga e
	private final android.os.Handler f
	
	    ahc(android.os.Handler p3, aga p4)
	    {
	        this.e = p4;
	        this.f = p3;
	        this.a = afv.g();
	        return;
	    }
	
	
	    final void a()
	    {
	        if (this.b > this.c) {
	            agh v3_0 = this.e.e;
	            if ((this.d > 0) && ((v3_0 instanceof agh))) {
	                if (this.f != null) {
	                    this.f.post(new ahd(this, ((agh) v3_0), this.b, this.d));
	                }
	                this.c = this.b;
	            }
	        }
	        return;
	    }
	
