	private synthetic djz a
	
	    dkb(djz p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final int available()
	    {
	        return ((int) Math.min(this.a.b, 2147483647));
	    }
	
	
	    public final void close()
	    {
	        return;
	    }
	
	
	    public final int read()
	    {
	        int v0_3;
	        if (this.a.b <= 0) {
	            v0_3 = -1;
	        } else {
	            v0_3 = (this.a.g() & 255);
	        }
	        return v0_3;
	    }
	
	
	    public final int read(byte[] p2, int p3, int p4)
	    {
	        return this.a.a(p2, p3, p4);
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder().append(this.a).append(".inputStream()").toString();
	    }
	
