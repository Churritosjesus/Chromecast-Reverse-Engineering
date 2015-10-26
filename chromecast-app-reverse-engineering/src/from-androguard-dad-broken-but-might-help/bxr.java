	public final com.google.android.gms.common.api.GoogleApiClient e
	  f
	private com.google.android.gms.common.ConnectionResult g
	
	    public bxr(android.content.Context p1, com.google.android.gms.common.api.GoogleApiClient p2)
	    {
	        this(p1);
	        this.e = p2;
	        return;
	    }
	
	
	    private void b(com.google.android.gms.common.ConnectionResult p2)
	    {
	        this.g = p2;
	        if ((this.c) && (!this.d)) {
	            this.a(p2);
	        }
	        return;
	    }
	
	
	    public final void a(int p1)
	    {
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p2)
	    {
	        this.f = 0;
	        this.b(com.google.android.gms.common.ConnectionResult.a);
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p2)
	    {
	        this.f = 1;
	        this.b(p2);
	        return;
	    }
	
	
	    public final void a(String p2, java.io.FileDescriptor p3, java.io.PrintWriter p4, String[] p5)
	    {
	        super.a(p2, p3, p4, p5);
	        this.e.a(p2, p3, p4, p5);
	        return;
	    }
	
	
	    protected final void b()
	    {
	        super.b();
	        this.e.a(this);
	        this.e.a(this);
	        if (this.g != null) {
	            this.a(this.g);
	        }
	        if ((!this.e.d()) && ((!this.e.e()) && (!this.f))) {
	            this.e.b();
	        }
	        return;
	    }
	
	
	    protected final void d()
	    {
	        this.e.c();
	        return;
	    }
	
	
	    protected final void f()
	    {
	        this.g = 0;
	        this.f = 0;
	        this.e.b(this);
	        this.e.b(this);
	        this.e.c();
	        return;
	    }
	
