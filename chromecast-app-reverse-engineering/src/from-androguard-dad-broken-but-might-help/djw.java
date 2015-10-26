	private synthetic dkv a
	private synthetic dju b
	
	    djw(dju p1, dkv p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final long a(djz p5, long p6)
	    {
	        this.b.j_();
	        try {
	            java.io.IOException v0_2 = this.a.a(p5, p6);
	            this.b.a(1);
	            return v0_2;
	        } catch (java.io.IOException v0_5) {
	            this.b.a(0);
	            throw v0_5;
	        } catch (java.io.IOException v0_3) {
	            throw this.b.a(v0_3);
	        }
	    }
	
	
	    public final dkw a()
	    {
	        return this.b;
	    }
	
	
	    public final void close()
	    {
	        try {
	            this.a.close();
	            this.b.a(1);
	            return;
	        } catch (java.io.IOException v0_4) {
	            this.b.a(0);
	            throw v0_4;
	        } catch (java.io.IOException v0_2) {
	            throw this.b.a(v0_2);
	        }
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("AsyncTimeout.source(").append(this.a).append(")").toString();
	    }
	
