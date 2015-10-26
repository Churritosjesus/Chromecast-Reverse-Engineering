	public static final iq b
	public java.lang.ref.WeakReference a
	private java.lang.Runnable c
	private java.lang.Runnable d
	private  e
	
	    static ih()
	    {
	        ii v0_0 = android.os.Build$VERSION.SDK_INT;
	        if (v0_0 < 21) {
	            if (v0_0 < 19) {
	                if (v0_0 < 18) {
	                    if (v0_0 < 16) {
	                        if (v0_0 < 14) {
	                            ih.b = new ii();
	                        } else {
	                            ih.b = new ik();
	                        }
	                    } else {
	                        ih.b = new in();
	                    }
	                } else {
	                    ih.b = new im();
	                }
	            } else {
	                ih.b = new io();
	            }
	        } else {
	            ih.b = new ip();
	        }
	        return;
	    }
	
	
	    ih(android.view.View p2)
	    {
	        this.c = 0;
	        this.d = 0;
	        this.e = -1;
	        this.a = new ref.WeakReference(p2);
	        return;
	    }
	
	
	    static synthetic int a(ih p1, int p2)
	    {
	        p1.e = -1;
	        return -1;
	    }
	
	
	    static synthetic Runnable a(ih p1)
	    {
	        return 0;
	    }
	
	
	    static synthetic Runnable b(ih p1)
	    {
	        return 0;
	    }
	
	
	    static synthetic int c(ih p1)
	    {
	        return p1.e;
	    }
	
	
	    public final ih a(float p3)
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get());
	        if (v0_2 != null) {
	            ih.b.a(this, v0_2, p3);
	        }
	        return this;
	    }
	
	
	    public final ih a(long p4)
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get());
	        if (v0_2 != null) {
	            ih.b.a(v0_2, p4);
	        }
	        return this;
	    }
	
	
	    public final ih a(android.view.animation.Interpolator p3)
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get());
	        if (v0_2 != null) {
	            ih.b.a(v0_2, p3);
	        }
	        return this;
	    }
	
	
	    public final ih a(iu p3)
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get());
	        if (v0_2 != null) {
	            ih.b.a(this, v0_2, p3);
	        }
	        return this;
	    }
	
	
	    public final ih a(iw p3)
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get());
	        if (v0_2 != null) {
	            ih.b.a(v0_2, p3);
	        }
	        return this;
	    }
	
	
	    public final void a()
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get());
	        if (v0_2 != null) {
	            ih.b.a(this, v0_2);
	        }
	        return;
	    }
	
	
	    public final ih b(float p3)
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get());
	        if (v0_2 != null) {
	            ih.b.b(this, v0_2, p3);
	        }
	        return this;
	    }
	
	
	    public final void b()
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get());
	        if (v0_2 != null) {
	            ih.b.b(this, v0_2);
	        }
	        return;
	    }
	
	
	    public final ih c(float p3)
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get());
	        if (v0_2 != null) {
	            ih.b.c(this, v0_2, p3);
	        }
	        return this;
	    }
	
