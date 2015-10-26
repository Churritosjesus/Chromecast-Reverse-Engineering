	
	    public ddh()
	    {
	        return;
	    }
	
	
	    private ddh a(byte[] p4, int p5, int p6)
	    {
	        try {
	            java.io.IOException v0_1 = ddn.a(p4, 0, p6);
	            this.a(v0_1, ddp.a());
	            v0_1.a(0);
	            return this;
	        } catch (java.io.IOException v0_3) {
	            throw v0_3;
	        } catch (java.io.IOException v0_2) {
	            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", v0_2);
	        }
	    }
	
	
	    public final synthetic deb a(byte[] p3)
	    {
	        return this.a(p3, 0, p3.length);
	    }
	
	
	    public synthetic Object clone()
	    {
	        return this.a();
	    }
	
