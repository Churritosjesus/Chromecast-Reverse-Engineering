	public  a
	public bj b
	public  c
	public  d
	private  e
	private  f
	private  g
	
	    public bi(android.content.Context p3)
	    {
	        this.c = 0;
	        this.d = 0;
	        this.e = 1;
	        this.f = 0;
	        this.g = 0;
	        p3.getApplicationContext();
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.c = 1;
	        this.e = 0;
	        this.d = 0;
	        this.b();
	        return;
	    }
	
	
	    public final void a(bj p3)
	    {
	        if (this.b != null) {
	            if (this.b == p3) {
	                this.b = 0;
	                return;
	            } else {
	                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
	            }
	        } else {
	            throw new IllegalStateException("No listener register");
	        }
	    }
	
	
	    public final void a(Object p2)
	    {
	        if (this.b != null) {
	            this.b.a(this, p2);
	        }
	        return;
	    }
	
	
	    public void a(String p3, java.io.FileDescriptor p4, java.io.PrintWriter p5, String[] p6)
	    {
	        p5.print(p3);
	        p5.print("mId=");
	        p5.print(this.a);
	        p5.print(" mListener=");
	        p5.println(this.b);
	        if (this.c) {
	            p5.print(p3);
	            p5.print("mStarted=");
	            p5.print(this.c);
	            p5.print(" mContentChanged=");
	            p5.print(0);
	            p5.print(" mProcessingChange=");
	            p5.println(0);
	        }
	        if ((this.d) || (this.e)) {
	            p5.print(p3);
	            p5.print("mAbandoned=");
	            p5.print(this.d);
	            p5.print(" mReset=");
	            p5.println(this.e);
	        }
	        return;
	    }
	
	
	    public void b()
	    {
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.c = 0;
	        this.d();
	        return;
	    }
	
	
	    public void d()
	    {
	        return;
	    }
	
	
	    public final void e()
	    {
	        this.f();
	        this.e = 1;
	        this.c = 0;
	        this.d = 0;
	        this.f = 0;
	        this.g = 0;
	        return;
	    }
	
	
	    public void f()
	    {
	        return;
	    }
	
	
	    public String toString()
	    {
	        String v0_1 = new StringBuilder(64);
	        a.a(this, v0_1);
	        v0_1.append(" id=");
	        v0_1.append(this.a);
	        v0_1.append("}");
	        return v0_1.toString();
	    }
	
