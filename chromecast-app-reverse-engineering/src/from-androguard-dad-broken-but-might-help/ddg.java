	
	    public ddg()
	    {
	        return;
	    }
	
	
	    public final byte[] e()
	    {
	        try {
	            java.io.IOException v0_1 = new byte[this.a()];
	            RuntimeException v1_0 = ddo.a(v0_1);
	            this.a(v1_0);
	            v1_0.a();
	            return v0_1;
	        } catch (java.io.IOException v0_2) {
	            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", v0_2);
	        }
	    }
	
