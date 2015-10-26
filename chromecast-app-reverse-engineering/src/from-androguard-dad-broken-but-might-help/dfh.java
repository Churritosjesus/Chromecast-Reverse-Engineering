	final dfi a
	public final dgf b
	public java.net.Socket c
	  d
	 dgx e
	 djb f
	public dfx g
	  h
	public dfn i
	  j
	 java.lang.Object k
	
	    public dfh(dfi p2, dgf p3)
	    {
	        this.d = 0;
	        this.g = dfx.b;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    final void a(Object p4)
	    {
	        if (!this.e()) {
	            try {
	                if (this.k == null) {
	                    this.k = p4;
	                } else {
	                    throw new IllegalStateException("Connection already has an owner!");
	                }
	            } catch (IllegalStateException v0_4) {
	                throw v0_4;
	            }
	        }
	        return;
	    }
	
	
	    final boolean a()
	    {
	        try {
	            int v0_2;
	            if (this.k != null) {
	                this.k = 0;
	                v0_2 = 1;
	            } else {
	                v0_2 = 0;
	            }
	        } catch (int v0_3) {
	            throw v0_3;
	        }
	        return v0_2;
	    }
	
	
	    final boolean b()
	    {
	        if ((this.c.isClosed()) || ((this.c.isInputShutdown()) || (this.c.isOutputShutdown()))) {
	            int v0_6 = 0;
	        } else {
	            v0_6 = 1;
	        }
	        return v0_6;
	    }
	
	
	    final boolean c()
	    {
	        if ((this.f != null) && (!this.f.a())) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    final long d()
	    {
	        long v0_2;
	        if (this.f != null) {
	            v0_2 = this.f.b();
	        } else {
	            v0_2 = this.h;
	        }
	        return v0_2;
	    }
	
	
	    final boolean e()
	    {
	        int v0_1;
	        if (this.f == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final String toString()
	    {
	        String v0_10;
	        int v1_17 = new StringBuilder("Connection{").append(this.b.a.b).append(":").append(this.b.a.c).append(", proxy=").append(this.b.b).append(" hostAddress=").append(this.b.c.getAddress().getHostAddress()).append(" cipherSuite=");
	        if (this.i == null) {
	            v0_10 = "none";
	        } else {
	            v0_10 = this.i.a;
	        }
	        return v1_17.append(v0_10).append(" protocol=").append(this.g).append(125).toString();
	    }
	
