	public final android.content.ComponentName a
	public final  b
	public final  c
	
	    public rp(android.content.ComponentName p1, long p2, float p4)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p4;
	        return;
	    }
	
	
	    public rp(String p3, long p4, float p6)
	    {
	        this(android.content.ComponentName.unflattenFromString(p3), p4, p6);
	        return;
	    }
	
	
	    public final boolean equals(Object p7)
	    {
	        int v0 = 1;
	        if (this != p7) {
	            if (p7 != null) {
	                if (this.getClass() == p7.getClass()) {
	                    if (this.a != null) {
	                        if (!this.a.equals(((rp) p7).a)) {
	                            v0 = 0;
	                            return v0;
	                        }
	                    } else {
	                        if (((rp) p7).a != null) {
	                            v0 = 0;
	                            return v0;
	                        }
	                    }
	                    if (this.b == ((rp) p7).b) {
	                        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(((rp) p7).c)) {
	                            v0 = 0;
	                        }
	                    } else {
	                        v0 = 0;
	                    }
	                } else {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_2;
	        if (this.a != null) {
	            v0_2 = this.a.hashCode();
	        } else {
	            v0_2 = 0;
	        }
	        return (((((v0_2 + 31) * 31) + ((int) (this.b ^ (this.b >> 32)))) * 31) + Float.floatToIntBits(this.c));
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder();
	        v0_1.append("[");
	        v0_1.append("; activity:").append(this.a);
	        v0_1.append("; time:").append(this.b);
	        v0_1.append("; weight:").append(new java.math.BigDecimal(((double) this.c)));
	        v0_1.append("]");
	        return v0_1.toString();
	    }
	
