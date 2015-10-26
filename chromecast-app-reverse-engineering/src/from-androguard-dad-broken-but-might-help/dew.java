	public bridge  t
	
	    public dew()
	    {
	        this.t = -1;
	        return;
	    }
	
	
	    public static final dew a(dew p2, byte[] p3)
	    {
	        return dew.a(p2, p3, 0, p3.length);
	    }
	
	
	    private static dew a(dew p2, byte[] p3, int p4, int p5)
	    {
	        try {
	            String v1_1 = new deo(p3, 0, p5);
	            p2.a(v1_1);
	            v1_1.a(0);
	            return p2;
	        } catch (RuntimeException v0) {
	            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
	        } catch (RuntimeException v0_4) {
	            throw v0_4;
	        }
	    }
	
	
	    public static final byte[] a(dew p3)
	    {
	        IllegalStateException v0_1 = new byte[p3.d()];
	        try {
	            String v1_1 = dep.a(v0_1, 0, v0_1.length);
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
	
	
	    public int a()
	    {
	        return 0;
	    }
	
	
	    public void a(dep p1)
	    {
	        return;
	    }
	
	
	    public dew c()
	    {
	        return ((dew) super.clone());
	    }
	
	
	    public synthetic Object clone()
	    {
	        return this.c();
	    }
	
	
	    public final int d()
	    {
	        int v0 = this.a();
	        this.t = v0;
	        return v0;
	    }
	
	
	    public String toString()
	    {
	        return a.a(this);
	    }
	
