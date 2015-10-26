	private  a
	
	    ckk()
	    {
	        this.a = 0;
	        return;
	    }
	
	
	    public final declared_synchronized void a()
	    {
	        try {
	            this.a = (this.a + 1);
	            return;
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	    }
	
	
	    public final boolean a(long p7, java.util.concurrent.TimeUnit p9)
	    {
	        long v2 = System.currentTimeMillis();
	        long v0_1 = java.util.concurrent.TimeUnit.MILLISECONDS.convert(10, p9);
	        try {
	            while (this.a != 0) {
	                if (v0_1 > 0) {
	                    this.wait(v0_1);
	                    v0_1 -= (System.currentTimeMillis() - v2);
	                } else {
	                    long v0_2 = 0;
	                }
	                return v0_2;
	            }
	        } catch (long v0_3) {
	            throw v0_3;
	        }
	        v0_2 = 1;
	        return v0_2;
	    }
	
	
	    public final declared_synchronized void b()
	    {
	        try {
	            if (this.a != 0) {
	                this.a = (this.a - 1);
	                if (this.a == 0) {
	                    this.notifyAll();
	                }
	                return;
	            } else {
	                throw new RuntimeException("too many decrements");
	            }
	        } catch (int v0_6) {
	            throw v0_6;
	        }
	    }
	
