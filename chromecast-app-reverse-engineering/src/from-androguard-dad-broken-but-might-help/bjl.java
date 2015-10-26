	private bjn a
	
	    public bjl()
	    {
	        return;
	    }
	
	
	    public static bjl a(int p3, long p4)
	    {
	        bjl v0_1 = new bjl();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putInt("devicePosition", p3);
	        v1_1.putLong("scanStart", p4);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p11, android.view.ViewGroup p12, android.os.Bundle p13)
	    {
	        android.view.View v1 = p11.inflate(a.fJ, p12, 0);
	        apd v0_3 = ((android.widget.ImageView) v1.findViewById(f.ab));
	        switch (bjm.a[(this.a.F().b() - 1)]) {
	            case 1:
	                v0_3.setImageResource(a.en);
	                break;
	            case 2:
	                v0_3.setImageResource(a.em);
	                break;
	            default:
	                v0_3.setImageResource(a.el);
	        }
	        apd v0_14;
	        v1.findViewById(f.dZ).setOnClickListener(this);
	        apd v0_8 = ((android.widget.TextView) v1.findViewById(f.bj));
	        ape v3_4 = new Object[1];
	        v3_4[0] = this.a.F().b;
	        v0_8.setText(this.a(b.bx, v3_4));
	        aph v2_8 = this.m.getInt("devicePosition", -1);
	        long v4_4 = this.m.getLong("scanStart", 0);
	        ape v3_7 = ape.a();
	        if (!this.a.F().w) {
	            v0_14 = 16;
	        } else {
	            v0_14 = 106;
	        }
	        apd v0_15 = new apd(v0_14, Integer.valueOf(v2_8)).b((android.os.SystemClock.elapsedRealtime() - v4_4));
	        v0_15.h = this.a.A();
	        v3_7.a(v0_15);
	        this.d(1);
	        return v1;
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
	
	
	    public final void onClick(android.view.View p3)
	    {
	        this.a.a(bjo.a);
	        return;
	    }
	
