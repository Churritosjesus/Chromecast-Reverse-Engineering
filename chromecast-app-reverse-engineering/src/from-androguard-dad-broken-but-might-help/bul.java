	private synthetic bue a
	private synthetic java.lang.String b
	private synthetic java.lang.String c
	
	    bul(buh p1, bue p2, String p3, String p4)
	    {
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final void run()
	    {
	        bue.e(this.a);
	        buu v0_4 = ((btd) bue.e(this.a).get(this.b));
	        if (v0_4 == null) {
	            buu v0_6 = bue.g();
	            Object[] v2_2 = new Object[1];
	            v2_2[0] = this.b;
	            v0_6.b("Discarded message for unknown namespace \'%s\'", v2_2);
	        } else {
	            bue.f(this.a);
	            v0_4.a(this.b, this.c);
	        }
	        return;
	    }
	
