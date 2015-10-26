	private synthetic bcd a
	private synthetic bcm b
	private synthetic  c
	private synthetic bch d
	
	    public bcl(bch p1, bcd p2, bcm p3, int p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final boolean a(android.view.MenuItem p5)
	    {
	        if (p5.getItemId() != f.dl) {
	            if (p5.getItemId() != f.eh) {
	                if (p5.getItemId() == f.bt) {
	                    bcm v0_4 = apg.a(145);
	                    v0_4.b = this.a.a.a;
	                    v0_4.b();
	                    this.b.a(this.a, this.c);
	                }
	            } else {
	                bcm v0_7 = apg.a(146);
	                v0_7.b = this.a.a.a;
	                v0_7.b();
	                bcm v0_10 = this.d.a.getContext();
	                v0_10.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(blf.f(v0_10))));
	            }
	        } else {
	            bcm v0_12 = apg.a(144);
	            v0_12.b = this.a.a.a;
	            v0_12.b();
	            this.b.a(this.a);
	        }
	        return 0;
	    }
	
