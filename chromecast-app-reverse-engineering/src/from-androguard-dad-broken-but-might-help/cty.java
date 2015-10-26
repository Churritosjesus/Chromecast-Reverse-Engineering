	private synthetic ctw a
	
	    cty(ctw p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(java.util.List p5)
	    {
	        java.util.Iterator v1 = p5.iterator();
	        while (v1.hasNext()) {
	            java.util.concurrent.CountDownLatch v0_4 = ((ctz) v1.next());
	            ctw.a(this.a, ctw.b(v0_4.a, v0_4.b));
	        }
	        ctw.a(this.a).countDown();
	        return;
	    }
	
