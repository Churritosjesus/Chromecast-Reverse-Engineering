	final java.util.Map a
	  b
	private final android.os.Handler c
	private aga d
	private ahc e
	
	    agy(android.os.Handler p2)
	    {
	        this.a = new java.util.HashMap();
	        this.c = p2;
	        return;
	    }
	
	
	    final void a(long p6)
	    {
	        if (this.e == null) {
	            this.e = new ahc(this.c, this.d);
	            this.a.put(this.d, this.e);
	        }
	        int v0_4 = this.e;
	        v0_4.d = (v0_4.d + p6);
	        this.b = ((int) (((long) this.b) + p6));
	        return;
	    }
	
	
	    public final void a(aga p2)
	    {
	        int v0_0;
	        this.d = p2;
	        if (p2 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = ((ahc) this.a.get(p2));
	        }
	        this.e = v0_0;
	        return;
	    }
	
	
	    public final void write(int p3)
	    {
	        this.a(1);
	        return;
	    }
	
	
	    public final void write(byte[] p3)
	    {
	        this.a(((long) p3.length));
	        return;
	    }
	
	
	    public final void write(byte[] p3, int p4, int p5)
	    {
	        this.a(((long) p5));
	        return;
	    }
	
