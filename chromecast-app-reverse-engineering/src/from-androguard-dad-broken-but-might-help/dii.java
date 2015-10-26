	private final djz a
	
	    dii(djz p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    private void a(int p4, int p5, int p6)
	    {
	        if (p4 >= p5) {
	            this.a.b((p5 | 0));
	            int v0_1 = (p4 - p5);
	            while (v0_1 >= 128) {
	                this.a.b(((v0_1 & 127) | 128));
	                v0_1 >>= 7;
	            }
	            this.a.b(v0_1);
	        } else {
	            this.a.b((p4 | 0));
	        }
	        return;
	    }
	
	
	    private void a(dke p4)
	    {
	        this.a(p4.b.length, 127, 0);
	        this.a.a(p4);
	        return;
	    }
	
	
	    final void a(java.util.List p6)
	    {
	        int v3 = p6.size();
	        int v1 = 0;
	        while (v1 < v3) {
	            int v4_0 = ((die) p6.get(v1)).h.c();
	            int v0_5 = ((Integer) dig.b().get(v4_0));
	            if (v0_5 == 0) {
	                this.a.b(0);
	                this.a(v4_0);
	                this.a(((die) p6.get(v1)).i);
	            } else {
	                this.a((v0_5.intValue() + 1), 15, 0);
	                this.a(((die) p6.get(v1)).i);
	            }
	            v1++;
	        }
	        return;
	    }
	
