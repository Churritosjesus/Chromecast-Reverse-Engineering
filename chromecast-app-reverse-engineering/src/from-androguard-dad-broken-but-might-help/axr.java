	final synthetic axq b
	
	    axr(axq p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0_0 = 2147483647;
	        if (((this.b.c.size() - 1) * this.b.g) >= this.b.f) {
	            Object[] v1_5 = new Object[1];
	            v1_5[0] = Integer.valueOf(2147483647);
	        } else {
	            int v0_1 = new Object[1];
	            v0_1[0] = Integer.valueOf(this.b.c.size());
	            v0_0 = this.b.c.size();
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic zr a(android.view.ViewGroup p7, int p8)
	    {
	        int v0_5 = (this.b.g - (this.b.b.getResources().getDimensionPixelSize(a.dT) * 2));
	        return new bch(android.view.LayoutInflater.from(this.b.b).inflate(a.gp, p7, 0), v0_5, ((int) (((float) v0_5) * 1054567863)));
	    }
	
	
	    public final synthetic void a(zr p9, int p10)
	    {
	        bcd v6_1 = ((bcd) this.b.c.get((p10 % this.b.c.size())));
	        axs v7_1 = new axs(this);
	        ((bch) p9).k.a(com.google.android.apps.chromecast.app.SetupApplication.i().m, v6_1.a.b.a, 0, ((bch) p9).l, ((bch) p9).m);
	        ((bch) p9).o.setImageResource(v6_1.c);
	        ((bch) p9).p.setText(v6_1.b);
	        ((bch) p9).q.setOnClickListener(new bci(((bch) p9), v6_1, v7_1));
	        ((bch) p9).a.setOnClickListener(new bcj(((bch) p9), v6_1, v7_1));
	        ((bch) p9).a.setOnTouchListener(new bck(((bch) p9), v7_1));
	        ((bch) p9).n.d = new bcl(((bch) p9), v6_1, v7_1, p10);
	        return;
	    }
	
