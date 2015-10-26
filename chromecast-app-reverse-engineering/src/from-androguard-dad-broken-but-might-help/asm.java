	private synthetic  a
	private synthetic  b
	private synthetic java.lang.String c
	private synthetic ash d
	
	    asm(ash p1, boolean p2, int p3, String p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final synthetic void a(Object p9)
	    {
	        if ((((dbz) p9) != null) && (((dbz) p9).a != null)) {
	            ash.f(this.d);
	            if (this.a) {
	                ash.f(this.d).a.remove(new atd(this.b, this.c));
	            }
	            int v1_3;
	            int v1_1 = ash.f(this.d);
	            dbq[] v4_2 = ((dbz) p9).a;
	            dbq v5_0 = ((dbz) p9).b;
	            java.util.List v6_1 = new atd(this.b, this.c);
	            ash v0_10 = ((ate) v1_1.a.get(v6_1));
	            if (v0_10 == null) {
	                ash v0_12 = new ate(new java.util.ArrayList(v4_2.length), v5_0);
	                v1_1.a.put(v6_1, v0_12);
	                v1_3 = v0_12;
	            } else {
	                v0_10.b = v5_0;
	                v1_3 = v0_10;
	            }
	            int v3_4 = v4_2.length;
	            ash v0_13 = 0;
	            while (v0_13 < v3_4) {
	                v1_3.a.add(v4_2[v0_13]);
	                v0_13++;
	            }
	            this.d.b(3);
	        }
	        return;
	    }
	
