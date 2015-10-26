	private bjn a
	private apd b
	
	    public bjp()
	    {
	        return;
	    }
	
	
	    public static bjp a(long p4)
	    {
	        bjp v0_1 = new bjp();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putLong("uptimeMs", p4);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p5, android.view.ViewGroup p6, android.os.Bundle p7)
	    {
	        int v1_7;
	        android.widget.TextView v0_4 = new apd(33).a(((int) java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(this.m.getLong("uptimeMs", 0))));
	        v0_4.h = this.a.A();
	        this.b = v0_4;
	        android.view.View v2_3 = p5.inflate(a.gN, p6, 0);
	        v2_3.findViewById(f.aS).setOnClickListener(this);
	        if (!this.a.F().h) {
	            v1_7 = b.bl;
	        } else {
	            v1_7 = b.bm;
	        }
	        ((android.widget.TextView) v2_3.findViewById(f.aT)).setText(v1_7);
	        return v2_3;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.a = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.a = ((bjn) p1);
	        return;
	    }
	
	
	    public final void h_()
	    {
	        ape.a().a(this.b);
	        super.h_();
	        return;
	    }
	
	
	    public final void onClick(android.view.View p3)
	    {
	        this.a.a(bjo.i);
	        return;
	    }
	
