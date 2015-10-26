	private  a
	private  b
	private  c
	private synthetic ei d
	
	    em(ei p2)
	    {
	        this.d = p2;
	        this.c = 0;
	        this.a = (p2.a() - 1);
	        this.b = -1;
	        return;
	    }
	
	
	    public final boolean equals(Object p6)
	    {
	        String v0_0 = 0;
	        if (this.c) {
	            if (((p6 instanceof java.util.Map$Entry)) && ((ef.a(((java.util.Map$Entry) p6).getKey(), this.d.a(this.b, 0))) && (ef.a(((java.util.Map$Entry) p6).getValue(), this.d.a(this.b, 1))))) {
	                v0_0 = 1;
	            }
	            return v0_0;
	        } else {
	            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	        }
	    }
	
	
	    public final Object getKey()
	    {
	        if (this.c) {
	            return this.d.a(this.b, 0);
	        } else {
	            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	        }
	    }
	
	
	    public final Object getValue()
	    {
	        if (this.c) {
	            return this.d.a(this.b, 1);
	        } else {
	            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	        }
	    }
	
	
	    public final boolean hasNext()
	    {
	        int v0_1;
	        if (this.b >= this.a) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_0 = 0;
	        if (this.c) {
	            int v1_3;
	            int v1_2 = this.d.a(this.b, 0);
	            Object v2_2 = this.d.a(this.b, 1);
	            if (v1_2 != 0) {
	                v1_3 = v1_2.hashCode();
	            } else {
	                v1_3 = 0;
	            }
	            if (v2_2 != null) {
	                v0_0 = v2_2.hashCode();
	            }
	            return (v0_0 ^ v1_3);
	        } else {
	            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	        }
	    }
	
	
	    public final synthetic Object next()
	    {
	        this.b = (this.b + 1);
	        this.c = 1;
	        return this;
	    }
	
	
	    public final void remove()
	    {
	        if (this.c) {
	            this.d.a(this.b);
	            this.b = (this.b - 1);
	            this.a = (this.a - 1);
	            this.c = 0;
	            return;
	        } else {
	            throw new IllegalStateException();
	        }
	    }
	
	
	    public final Object setValue(Object p3)
	    {
	        if (this.c) {
	            return this.d.a(this.b, p3);
	        } else {
	            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	        }
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder().append(this.getKey()).append("=").append(this.getValue()).toString();
	    }
	
