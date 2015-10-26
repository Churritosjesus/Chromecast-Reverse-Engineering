	private final java.lang.String a
	private java.lang.StringBuilder b
	
	    public eg(String p3)
	    {
	        this.b = new StringBuilder(128);
	        this.a = p3;
	        return;
	    }
	
	
	    private void a()
	    {
	        if (this.b.length() > 0) {
	            this.b.delete(0, this.b.length());
	        }
	        return;
	    }
	
	
	    public final void close()
	    {
	        this.a();
	        return;
	    }
	
	
	    public final void flush()
	    {
	        this.a();
	        return;
	    }
	
	
	    public final void write(char[] p4, int p5, int p6)
	    {
	        int v0 = 0;
	        while (v0 < p6) {
	            char v1_1 = p4[(p5 + v0)];
	            if (v1_1 != 10) {
	                this.b.append(v1_1);
	            } else {
	                this.a();
	            }
	            v0++;
	        }
	        return;
	    }
	
