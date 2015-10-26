	  a
	  b
	  c
	  d
	  e
	private final dkd f
	
	    public dik(dkd p1)
	    {
	        this.f = p1;
	        return;
	    }
	
	
	    public final long a(djz p11, long p12)
	    {
	        java.io.IOException v0_0 = -1;
	        while (this.d == 0) {
	            this.f.f(((long) this.e));
	            this.e = 0;
	            if ((this.b & 4) == 0) {
	                Byte v2_6 = this.c;
	                int v3_3 = dij.a(this.f);
	                this.d = v3_3;
	                this.a = v3_3;
	                int v3_6 = ((byte) this.f.g());
	                this.b = ((byte) this.f.g());
	                if (dij.b().isLoggable(java.util.logging.Level.FINE)) {
	                    dij.b().fine(dil.a(1, this.c, this.a, v3_6, this.b));
	                }
	                this.c = (this.f.i() & 2147483647);
	                if (v3_6 == 9) {
	                    if (this.c != v2_6) {
	                        Object[] v1_0 = new Object[0];
	                        throw dij.a("TYPE_CONTINUATION streamId changed", v1_0);
	                    }
	                } else {
	                    Object[] v1_1 = new Object[1];
	                    v1_1[0] = Byte.valueOf(v3_6);
	                    throw dij.a("%s != TYPE_CONTINUATION", v1_1);
	                }
	            }
	            return v0_0;
	        }
	        Byte v2_2 = this.f.a(p11, Math.min(p12, ((long) this.d)));
	        if (v2_2 != -1) {
	            this.d = ((int) (((long) this.d) - v2_2));
	            v0_0 = v2_2;
	        }
	        return v0_0;
	    }
	
	
	    public final dkw a()
	    {
	        return this.f.a();
	    }
	
	
	    public final void close()
	    {
	        return;
	    }
	
