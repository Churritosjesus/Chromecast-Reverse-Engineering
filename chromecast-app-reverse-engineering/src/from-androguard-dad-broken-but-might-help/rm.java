	public final android.content.pm.ResolveInfo a
	public  b
	
	    public final synthetic int compareTo(Object p3)
	    {
	        return (Float.floatToIntBits(((rm) p3).b) - Float.floatToIntBits(this.b));
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if (p5 != null) {
	                if (this.getClass() == p5.getClass()) {
	                    if (Float.floatToIntBits(this.b) != Float.floatToIntBits(((rm) p5).b)) {
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
	        return (Float.floatToIntBits(this.b) + 31);
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder();
	        v0_1.append("[");
	        v0_1.append("resolveInfo:").append(this.a.toString());
	        v0_1.append("; weight:").append(new java.math.BigDecimal(((double) this.b)));
	        v0_1.append("]");
	        return v0_1.toString();
	    }
	
