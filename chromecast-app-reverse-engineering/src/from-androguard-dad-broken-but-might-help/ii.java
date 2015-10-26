	private java.util.WeakHashMap a
	
	    ii()
	    {
	        this.a = 0;
	        return;
	    }
	
	
	    private void d(ih p3, android.view.View p4)
	    {
	        ij v0_0 = 0;
	        if (this.a != null) {
	            v0_0 = ((Runnable) this.a.get(p4));
	        }
	        if (v0_0 == null) {
	            v0_0 = new ij(this, p3, p4);
	            if (this.a == null) {
	                this.a = new java.util.WeakHashMap();
	            }
	            this.a.put(p4, v0_0);
	        }
	        p4.removeCallbacks(v0_0);
	        p4.post(v0_0);
	        return;
	    }
	
	
	    public void a(android.view.View p1, long p2)
	    {
	        return;
	    }
	
	
	    public void a(android.view.View p1, android.view.animation.Interpolator p2)
	    {
	        return;
	    }
	
	
	    public void a(android.view.View p1, iw p2)
	    {
	        return;
	    }
	
	
	    public void a(ih p1, android.view.View p2)
	    {
	        this.d(p1, p2);
	        return;
	    }
	
	
	    public void a(ih p1, android.view.View p2, float p3)
	    {
	        this.d(p1, p2);
	        return;
	    }
	
	
	    public void a(ih p2, android.view.View p3, iu p4)
	    {
	        p3.setTag(2113929216, p4);
	        return;
	    }
	
	
	    public void b(ih p2, android.view.View p3)
	    {
	        if (this.a != null) {
	            Runnable v0_3 = ((Runnable) this.a.get(p3));
	            if (v0_3 != null) {
	                p3.removeCallbacks(v0_3);
	            }
	        }
	        this.c(p2, p3);
	        return;
	    }
	
	
	    public void b(ih p1, android.view.View p2, float p3)
	    {
	        this.d(p1, p2);
	        return;
	    }
	
	
	    void c(ih p4, android.view.View p5)
	    {
	        java.util.WeakHashMap v0_2;
	        java.util.WeakHashMap v0_1 = p5.getTag(2113929216);
	        if (!(v0_1 instanceof iu)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = ((iu) v0_1);
	        }
	        Runnable v1_1 = ih.a(p4);
	        Runnable v2_1 = ih.b(p4);
	        if (v1_1 != null) {
	            v1_1.run();
	        }
	        if (v0_2 != null) {
	            v0_2.a(p5);
	            v0_2.b(p5);
	        }
	        if (v2_1 != null) {
	            v2_1.run();
	        }
	        if (this.a != null) {
	            this.a.remove(p5);
	        }
	        return;
	    }
	
	
	    public void c(ih p1, android.view.View p2, float p3)
	    {
	        this.d(p1, p2);
	        return;
	    }
	
	
	    public void d(ih p1, android.view.View p2, float p3)
	    {
	        this.d(p1, p2);
	        return;
	    }
	
