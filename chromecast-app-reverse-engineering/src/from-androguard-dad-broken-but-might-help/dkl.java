	private synthetic dkw a
	private synthetic java.io.OutputStream b
	
	    dkl(dkw p1, java.io.OutputStream p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final dkw a()
	    {
	        return this.a;
	    }
	
	
	    public final void a_(djz p9, long p10)
	    {
	        dky.a(p9.b, 0, p10);
	        while (p10 > 0) {
	            this.a.f();
	            dks v0_3 = p9.a;
	            dks v1_2 = ((int) Math.min(p10, ((long) (v0_3.c - v0_3.b))));
	            this.b.write(v0_3.a, v0_3.b, v1_2);
	            v0_3.b = (v0_3.b + v1_2);
	            p10 -= ((long) v1_2);
	            p9.b = (p9.b - ((long) v1_2));
	            if (v0_3.b == v0_3.c) {
	                p9.a = v0_3.a();
	                dkt.a(v0_3);
	            }
	        }
	        return;
	    }
	
	
	    public final void close()
	    {
	        this.b.close();
	        return;
	    }
	
	
	    public final void flush()
	    {
	        this.b.flush();
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("sink(").append(this.b).append(")").toString();
	    }
	
