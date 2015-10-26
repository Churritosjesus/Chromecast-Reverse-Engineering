	final B a
	  b
	  c
	  d
	  e
	 dks f
	 dks g
	
	    dks()
	    {
	        int v0_1 = new byte[2048];
	        this.a = v0_1;
	        this.e = 1;
	        this.d = 0;
	        return;
	    }
	
	
	    dks(dks p4)
	    {
	        this(p4.a, p4.b, p4.c);
	        p4.d = 1;
	        return;
	    }
	
	
	    private dks(byte[] p2, int p3, int p4)
	    {
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.e = 0;
	        this.d = 1;
	        return;
	    }
	
	
	    public final dks a()
	    {
	        int v0_1;
	        if (this.f == this) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.f;
	        }
	        this.g.f = this.f;
	        this.f.g = this.g;
	        this.f = 0;
	        this.g = 0;
	        return v0_1;
	    }
	
	
	    public final dks a(dks p2)
	    {
	        p2.g = this;
	        p2.f = this.f;
	        this.f.g = p2;
	        this.f = p2;
	        return p2;
	    }
	
	
	    public final void a(dks p7, int p8)
	    {
	        if (p7.e) {
	            if ((p7.c + p8) > 2048) {
	                if (!p7.d) {
	                    if (((p7.c + p8) - p7.b) <= 2048) {
	                        System.arraycopy(p7.a, p7.b, p7.a, 0, (p7.c - p7.b));
	                        p7.c = (p7.c - p7.b);
	                        p7.b = 0;
	                    } else {
	                        throw new IllegalArgumentException();
	                    }
	                } else {
	                    throw new IllegalArgumentException();
	                }
	            }
	            System.arraycopy(this.a, this.b, p7.a, p7.c, p8);
	            p7.c = (p7.c + p8);
	            this.b = (this.b + p8);
	            return;
	        } else {
	            throw new IllegalArgumentException();
	        }
	    }
	
