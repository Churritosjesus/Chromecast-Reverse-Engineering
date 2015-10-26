	  a
	 Ljava.lang.String b
	 Ljava.lang.String c
	  d
	
	    public dfl(dfk p2)
	    {
	        this.a = p2.d;
	        this.b = dfk.a(p2);
	        this.c = dfk.b(p2);
	        this.d = p2.g;
	        return;
	    }
	
	
	    dfl(boolean p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final dfk a()
	    {
	        return new dfk(this);
	    }
	
	
	    public final dfl a(boolean p3)
	    {
	        if (this.a) {
	            this.d = 1;
	            return this;
	        } else {
	            throw new IllegalStateException("no TLS extensions for cleartext connections");
	        }
	    }
	
	
	    public final varargs dfl a(dgg[] p4)
	    {
	        if (this.a) {
	            if (p4.length != 0) {
	                String[] v1_0 = new String[p4.length];
	                int v0_3 = 0;
	                while (v0_3 < p4.length) {
	                    v1_0[v0_3] = p4[v0_3].d;
	                    v0_3++;
	                }
	                this.c = v1_0;
	                return this;
	            } else {
	                throw new IllegalArgumentException("At least one TlsVersion is required");
	            }
	        } else {
	            throw new IllegalStateException("no TLS versions for cleartext connections");
	        }
	    }
	
	
	    public final varargs dfl a(String[] p3)
	    {
	        if (this.a) {
	            if (p3 != null) {
	                this.b = ((String[]) p3.clone());
	            } else {
	                this.b = 0;
	            }
	            return this;
	        } else {
	            throw new IllegalStateException("no cipher suites for cleartext connections");
	        }
	    }
	
	
	    public final varargs dfl b(String[] p3)
	    {
	        if (this.a) {
	            if (p3 != null) {
	                this.c = ((String[]) p3.clone());
	            } else {
	                this.c = 0;
	            }
	            return this;
	        } else {
	            throw new IllegalStateException("no TLS versions for cleartext connections");
	        }
	    }
	
