	private  a
	
	    protected cah(byte[] p3)
	    {
	        int v0_1;
	        if (p3.length != 25) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        a.b(v0_1, "cert hash data has incorrect length");
	        this.a = java.util.Arrays.hashCode(p3);
	        return;
	    }
	
	
	    protected static byte[] a(String p2)
	    {
	        try {
	            return p2.getBytes("ISO-8859-1");
	        } catch (java.io.UnsupportedEncodingException v0_2) {
	            throw new AssertionError(v0_2);
	        }
	    }
	
	
	    public boolean equals(Object p3)
	    {
	        if ((p3 != null) && ((p3 instanceof cah))) {
	            boolean v0_2 = java.util.Arrays.equals(this.a(), ((cah) p3).a());
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public int hashCode()
	    {
	        return this.a;
	    }
	
