	private synthetic dkw a
	private synthetic java.io.InputStream b
	
	    dkm(dkw p1, java.io.InputStream p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final long a(djz p7, long p8)
	    {
	        long v0_0 = 0;
	        if (p8 >= 0) {
	            if (p8 != 0) {
	                this.a.f();
	                long v0_3 = p7.e(1);
	                int v1_3 = this.b.read(v0_3.a, v0_3.c, ((int) Math.min(p8, ((long) (2048 - v0_3.c)))));
	                if (v1_3 != -1) {
	                    v0_3.c = (v0_3.c + v1_3);
	                    p7.b = (p7.b + ((long) v1_3));
	                    v0_0 = ((long) v1_3);
	                } else {
	                    v0_0 = -1;
	                }
	            }
	            return v0_0;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(p8).toString());
	        }
	    }
	
	
	    public final dkw a()
	    {
	        return this.a;
	    }
	
	
	    public final void close()
	    {
	        this.b.close();
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("source(").append(this.b).append(")").toString();
	    }
	
