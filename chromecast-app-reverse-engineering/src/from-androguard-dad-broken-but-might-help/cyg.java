	  a
	private  b
	private  c
	
	    private cyg(double p2)
	    {
	        this.b = p2;
	        this.a = 0;
	        return;
	    }
	
	
	    private cyg(long p2)
	    {
	        this.c = p2;
	        this.a = 1;
	        return;
	    }
	
	
	    public static cyg a(long p2)
	    {
	        return new cyg(p2);
	    }
	
	
	    public static cyg a(Double p4)
	    {
	        return new cyg(p4.doubleValue());
	    }
	
	
	    public static cyg a(String p4)
	    {
	        try {
	            NumberFormatException v0_1 = new cyg(Long.parseLong(p4));
	        } catch (NumberFormatException v0) {
	            try {
	                v0_1 = new cyg(Double.parseDouble(p4));
	            } catch (NumberFormatException v0) {
	                throw new NumberFormatException(new StringBuilder().append(p4).append(" is not a valid TypedNumber").toString());
	            }
	        }
	        return v0_1;
	    }
	
	
	    public final int a(cyg p5)
	    {
	        if ((!this.a) || (!p5.a)) {
	            int v0_3 = Double.compare(this.doubleValue(), p5.doubleValue());
	        } else {
	            v0_3 = new Long(this.c).compareTo(Long.valueOf(p5.c));
	        }
	        return v0_3;
	    }
	
	
	    public final byte byteValue()
	    {
	        return ((byte) ((int) this.longValue()));
	    }
	
	
	    public final synthetic int compareTo(Object p2)
	    {
	        return this.a(((cyg) p2));
	    }
	
	
	    public final double doubleValue()
	    {
	        double v0_1;
	        if (!this.a) {
	            v0_1 = this.b;
	        } else {
	            v0_1 = ((double) this.c);
	        }
	        return v0_1;
	    }
	
	
	    public final boolean equals(Object p2)
	    {
	        if ((!(p2 instanceof cyg)) || (this.a(((cyg) p2)) != 0)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final float floatValue()
	    {
	        return ((float) this.doubleValue());
	    }
	
	
	    public final int hashCode()
	    {
	        return new Long(this.longValue()).hashCode();
	    }
	
	
	    public final int intValue()
	    {
	        return ((int) this.longValue());
	    }
	
	
	    public final long longValue()
	    {
	        long v0_2;
	        if (!this.a) {
	            v0_2 = ((long) this.b);
	        } else {
	            v0_2 = this.c;
	        }
	        return v0_2;
	    }
	
	
	    public final short shortValue()
	    {
	        return ((short) ((int) this.longValue()));
	    }
	
	
	    public final String toString()
	    {
	        String v0_2;
	        if (!this.a) {
	            v0_2 = Double.toString(this.b);
	        } else {
	            v0_2 = Long.toString(this.c);
	        }
	        return v0_2;
	    }
	
