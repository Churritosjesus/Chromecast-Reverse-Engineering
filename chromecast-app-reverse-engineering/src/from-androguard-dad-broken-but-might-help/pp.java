	final java.util.ArrayList a
	 iu b
	  c
	private  d
	private android.view.animation.Interpolator e
	private final iv f
	
	    public pp()
	    {
	        this.d = -1;
	        this.f = new pq(this);
	        this.a = new java.util.ArrayList();
	        return;
	    }
	
	
	    public final pp a(long p3)
	    {
	        if (!this.c) {
	            this.d = 250;
	        }
	        return this;
	    }
	
	
	    public final pp a(android.view.animation.Interpolator p2)
	    {
	        if (!this.c) {
	            this.e = p2;
	        }
	        return this;
	    }
	
	
	    public final pp a(ih p2)
	    {
	        if (!this.c) {
	            this.a.add(p2);
	        }
	        return this;
	    }
	
	
	    public final pp a(iu p2)
	    {
	        if (!this.c) {
	            this.b = p2;
	        }
	        return this;
	    }
	
	
	    public final void a()
	    {
	        if (!this.c) {
	            java.util.Iterator v1 = this.a.iterator();
	            while (v1.hasNext()) {
	                int v0_5 = ((ih) v1.next());
	                if (this.d >= 0) {
	                    v0_5.a(this.d);
	                }
	                if (this.e != null) {
	                    v0_5.a(this.e);
	                }
	                if (this.b != null) {
	                    v0_5.a(this.f);
	                }
	                v0_5.b();
	            }
	            this.c = 1;
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        if (this.c) {
	            java.util.Iterator v1 = this.a.iterator();
	            while (v1.hasNext()) {
	                ((ih) v1.next()).a();
	            }
	            this.c = 0;
	        }
	        return;
	    }
	
