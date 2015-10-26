	private synthetic dkq a
	
	    dkr(dkq p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final int available()
	    {
	        if (!this.a.c) {
	            return ((int) Math.min(this.a.a.b, 2147483647));
	        } else {
	            throw new java.io.IOException("closed");
	        }
	    }
	
	
	    public final void close()
	    {
	        this.a.close();
	        return;
	    }
	
	
	    public final int read()
	    {
	        if (!this.a.c) {
	            if ((this.a.a.b != 0) || (this.a.b.a(this.a.a, 2048) != -1)) {
	                int v0_13 = (this.a.a.g() & 255);
	            } else {
	                v0_13 = -1;
	            }
	            return v0_13;
	        } else {
	            throw new java.io.IOException("closed");
	        }
	    }
	
	
	    public final int read(byte[] p7, int p8, int p9)
	    {
	        if (!this.a.c) {
	            int v0_14;
	            dky.a(((long) p7.length), ((long) p8), ((long) p9));
	            if ((this.a.a.b != 0) || (this.a.b.a(this.a.a, 2048) != -1)) {
	                v0_14 = this.a.a.a(p7, p8, p9);
	            } else {
	                v0_14 = -1;
	            }
	            return v0_14;
	        } else {
	            throw new java.io.IOException("closed");
	        }
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder().append(this.a).append(".inputStream()").toString();
	    }
	
