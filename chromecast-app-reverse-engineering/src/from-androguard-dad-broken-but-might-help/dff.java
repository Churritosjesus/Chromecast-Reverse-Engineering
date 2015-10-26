	public final java.lang.String a
	public final java.lang.String b
	
	    public dff(String p1, String p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final boolean equals(Object p3)
	    {
	        if ((!(p3 instanceof dff)) || ((!dgs.a(this.a, ((dff) p3).a)) || (!dgs.a(this.b, ((dff) p3).b)))) {
	            int v0_7 = 0;
	        } else {
	            v0_7 = 1;
	        }
	        return v0_7;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_1;
	        int v1_0 = 0;
	        if (this.b == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.b.hashCode();
	        }
	        int v0_4 = ((v0_1 + 899) * 31);
	        if (this.a != null) {
	            v1_0 = this.a.hashCode();
	        }
	        return (v0_4 + v1_0);
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder().append(this.a).append(" realm=\"").append(this.b).append("\"").toString();
	    }
	
