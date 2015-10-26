	private synthetic aqm a
	
	    aqo(aqm p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        int v5_0 = aqj.c(this.a.a).a();
	        if (v5_0 != 0) {
	            int v0_6;
	            aow v6 = aqj.b(this.a.a);
	            atu v7 = v6.o();
	            if (v7.d != null) {
	                v0_6 = 0;
	            } else {
	                v7.d = new atv();
	                v0_6 = 1;
	            }
	            int v3_1;
	            if ((v5_0.d & 1) == 0) {
	                v3_1 = 0;
	            } else {
	                v3_1 = 1;
	            }
	            int v3_4;
	            if (v3_1 == 0) {
	                v3_4 = 0;
	            } else {
	                if (v5_0.c != 3) {
	                    if (v5_0.c != 2) {
	                    } else {
	                        v3_4 = 1;
	                    }
	                } else {
	                    v3_4 = 2;
	                }
	            }
	            if (v7.d.a != v3_4) {
	                v7.d.a = v3_4;
	                v0_6 = 1;
	            }
	            if (v0_6 != 0) {
	                v6.p();
	            }
	        }
	        aqj.h();
	        int v0_10 = new Object[2];
	        v0_10[0] = aqj.b(this.a.a).g();
	        v0_10[1] = aqj.b(this.a.a).o().a();
	        return;
	    }
	
