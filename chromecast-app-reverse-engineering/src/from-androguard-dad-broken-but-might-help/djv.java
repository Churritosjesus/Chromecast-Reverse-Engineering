	private synthetic dku a
	private synthetic dju b
	
	    djv(dju p1, dku p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final dkw a()
	    {
	        return this.b;
	    }
	
	
	    public final void a_(djz p5, long p6)
	    {
	        this.b.j_();
	        try {
	            this.a.a_(p5, p6);
	            this.b.a(1);
	            return;
	        } catch (java.io.IOException v0_5) {
	            this.b.a(0);
	            throw v0_5;
	        } catch (java.io.IOException v0_3) {
	            throw this.b.a(v0_3);
	        }
	    }
	
	
	    public final void close()
	    {
	        this.b.j_();
	        try {
	            this.a.close();
	            this.b.a(1);
	            return;
	        } catch (java.io.IOException v0_5) {
	            this.b.a(0);
	            throw v0_5;
	        } catch (java.io.IOException v0_3) {
	            throw this.b.a(v0_3);
	        }
	    }
	
	
	    public final void flush()
	    {
	        this.b.j_();
	        try {
	            this.a.flush();
	            this.b.a(1);
	            return;
	        } catch (java.io.IOException v0_5) {
	            this.b.a(0);
	            throw v0_5;
	        } catch (java.io.IOException v0_3) {
	            throw this.b.a(v0_3);
	        }
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("AsyncTimeout.sink(").append(this.a).append(")").toString();
	    }
	
