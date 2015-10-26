	private axx a
	private dbf b
	private android.support.v7.widget.RecyclerView c
	private final blp d
	
	    public bge()
	    {
	        this.d = new blp("SearchResultsGrid");
	        return;
	    }
	
	
	    public static bge a(dbf p3)
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        v0_1.putByteArray("contentShelf", dbf.a(p3));
	        bge v1_2 = new bge();
	        v1_2.f(v0_1);
	        return v1_2;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p9, android.view.ViewGroup p10, android.os.Bundle p11)
	    {
	        android.view.View v1 = p9.inflate(a.gF, p10, 0);
	        try {
	            android.view.View v0_14;
	            this.b = ((dbf) dew.a(new dbf(), this.m.getByteArray("contentShelf")));
	            xe v2_3 = this.e();
	        } catch (android.view.View v0_11) {
	            xe v2_4 = this.d;
	            m v4_1 = new Object[1];
	            v4_1[0] = v0_11;
	            v2_4.a("Error parsing shelf proto: %s", v4_1);
	            android.view.View v0_12 = v1;
	            return v0_12;
	        }
	        if (this.b.g[0].a.b.intValue() <= this.b.g[0].a.c.intValue()) {
	            v0_14 = v2_3.getDimensionPixelSize(a.eb);
	        } else {
	            v0_14 = v2_3.getDimensionPixelSize(a.ea);
	        }
	        axx v3_10 = this.b.g[0].a;
	        android.view.View v0_17 = ((v0_14 * v3_10.b.intValue()) / v3_10.c.intValue());
	        m v4_9 = (blx.a(this.y) - (v2_3.getDimensionPixelSize(a.ed) * 2));
	        int v5_3 = (v4_9 / v0_17);
	        int v6 = v2_3.getDimensionPixelSize(a.dH);
	        android.view.View v0_22 = ((((v4_9 / v5_3) - (v6 * 2)) * v3_10.c.intValue()) / v3_10.b.intValue());
	        this.a = new axx(this.y, this.b, v0_22, (v2_3.getDimensionPixelSize(a.dI) + v0_22));
	        this.c = ((android.support.v7.widget.RecyclerView) v1.findViewById(f.aj));
	        this.c.a(this.a);
	        this.c.a(new xq(this.y, v5_3));
	        this.c.a(new bgf(this, v6));
	        this.c.a(new xe());
	        v0_12 = v1;
	        return v0_12;
	    }
	
