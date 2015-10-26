	private synthetic bcn a
	
	    bcp(bcn p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final synthetic void a(Object p10)
	    {
	        bcn.a(this.a);
	        int v1_2 = new Object[1];
	        v1_2[0] = ((dbm) p10);
	        bcn.b(this.a);
	        dbk[] v4 = ((dbm) p10).a;
	        int v5 = v4.length;
	        int v2 = 0;
	        int v1_4 = 0;
	        while (v2 < v5) {
	            String v6_0 = v4[v2];
	            int v0_2 = 0;
	            if (bcn.c(this.a).containsKey(v6_0.c)) {
	                v0_2 = ((aow) bcn.c(this.a).get(v6_0.c));
	            }
	            int v0_9;
	            bcd v7_5 = new bcd(v6_0, v0_2);
	            if (bcn.d(this.a).contains(v7_5.a())) {
	                v0_9 = v1_4;
	            } else {
	                v0_9 = (bcn.b(this.a).add(v7_5) | v1_4);
	            }
	            v2++;
	            v1_4 = v0_9;
	        }
	        if (v1_4 != 0) {
	            this.a.a();
	        }
	        return;
	    }
	
