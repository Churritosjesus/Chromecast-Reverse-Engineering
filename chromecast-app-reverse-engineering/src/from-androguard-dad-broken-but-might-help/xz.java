	  a
	  b
	  c
	  d
	  e
	  f
	  g
	  h
	  i
	 java.util.List j
	
	    xz()
	    {
	        this.a = 1;
	        this.h = 0;
	        this.j = 0;
	        return;
	    }
	
	
	    final android.view.View a(zl p6)
	    {
	        android.view.View v0_1;
	        if (this.j == null) {
	            v0_1 = p6.a(this.d, 0);
	            this.d = (this.d + this.e);
	        } else {
	            int v2_1 = this.j.size();
	            int v1_5 = 0;
	            while (v1_5 < v2_1) {
	                android.view.View v0_4 = ((zr) this.j.get(v1_5));
	                if ((v0_4.n()) || (this.d != v0_4.d())) {
	                    v1_5++;
	                } else {
	                    this.a(v0_4);
	                    v0_1 = v0_4.a;
	                }
	            }
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final void a(zr p9)
	    {
	        int v5 = this.j.size();
	        int v3 = 0;
	        int v2_0 = 2147483647;
	        int v4 = 0;
	        while (v4 < v5) {
	            int v1_4;
	            int v0_5;
	            int v0_2 = ((zr) this.j.get(v4));
	            if ((v0_2 == p9) || (v0_2.n())) {
	                v0_5 = v2_0;
	                v1_4 = v3;
	            } else {
	                int v1_3 = ((v0_2.d() - this.d) * this.e);
	                if ((v1_3 < 0) || (v1_3 >= v2_0)) {
	                } else {
	                    if (v1_3 == 0) {
	                        int v0_6;
	                        if (v0_2 != 0) {
	                            v0_6 = v0_2.d();
	                        } else {
	                            v0_6 = -1;
	                        }
	                        this.d = v0_6;
	                        return;
	                    } else {
	                        v1_4 = v0_2;
	                        v0_5 = v1_3;
	                    }
	                }
	            }
	            v4++;
	            v3 = v1_4;
	            v2_0 = v0_5;
	        }
	        v0_2 = v3;
	    }
	
	
	    final boolean a(zp p3)
	    {
	        if ((this.d < 0) || (this.d >= p3.a())) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
