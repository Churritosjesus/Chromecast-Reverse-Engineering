	final android.content.Context a
	final tt b
	final ts c
	 tr d
	 tp e
	  f
	 tv g
	  h
	
	    tq(android.content.Context p3, tt p4)
	    {
	        this.c = new ts(this);
	        if (p3 != null) {
	            this.a = p3;
	            this.b = p4;
	            return;
	        } else {
	            throw new IllegalArgumentException("context must not be null");
	        }
	    }
	
	
	    public tu a(String p2)
	    {
	        return 0;
	    }
	
	
	    public final void a(tp p3)
	    {
	        tz.f();
	        if ((this.e != p3) && ((this.e == null) || (!this.e.equals(p3)))) {
	            this.e = p3;
	            if (!this.f) {
	                this.f = 1;
	                this.c.sendEmptyMessage(2);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(tr p1)
	    {
	        tz.f();
	        this.d = p1;
	        return;
	    }
	
	
	    public final void a(tv p3)
	    {
	        tz.f();
	        if (this.g != p3) {
	            this.g = p3;
	            if (!this.h) {
	                this.h = 1;
	                this.c.sendEmptyMessage(1);
	            }
	        }
	        return;
	    }
	
	
	    public void b(tp p1)
	    {
	        return;
	    }
	
