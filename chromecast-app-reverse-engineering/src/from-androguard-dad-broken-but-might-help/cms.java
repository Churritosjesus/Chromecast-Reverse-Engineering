	public bridge  n
	
	    public cms()
	    {
	        this.n = -1;
	        return;
	    }
	
	
	    public static final cms a(cms p2, byte[] p3)
	    {
	        return cms.a(p2, p3, 0, p3.length);
	    }
	
	
	    private static cms a(cms p2, byte[] p3, int p4, int p5)
	    {
	        try {
	            RuntimeException v0_1 = cmj.a(p3, 0, p5);
	            p2.a(v0_1);
	            v0_1.a(0);
	            return p2;
	        } catch (RuntimeException v0) {
	            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
	        } catch (RuntimeException v0_4) {
	            throw v0_4;
	        }
	    }
	
	
	    public static final byte[] a(cms p3)
	    {
	        IllegalStateException v0_1 = new byte[p3.f()];
	        try {
	            String v1_1 = cmk.a(v0_1, 0, v0_1.length);
	            p3.a(v1_1);
	        } catch (IllegalStateException v0_4) {
	            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", v0_4);
	        }
	        if (v1_1.a.remaining() == 0) {
	            return v0_1;
	        } else {
	            throw new IllegalStateException("Did not write as much data as expected.");
	        }
	    }
	
	
	    protected int a()
	    {
	        return 0;
	    }
	
	
	    public void a(cmk p1)
	    {
	        return;
	    }
	
	
	    public synthetic Object clone()
	    {
	        return this.d();
	    }
	
	
	    public cms d()
	    {
	        return ((cms) super.clone());
	    }
	
	
	    public final int e()
	    {
	        if (this.n < 0) {
	            this.f();
	        }
	        return this.n;
	    }
	
	
	    public final int f()
	    {
	        int v0 = this.a();
	        this.n = v0;
	        return v0;
	    }
	
	
	    public String toString()
	    {
	        return a.a(this);
	    }
	
