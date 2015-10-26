	  a
	  b
	  c
	  d
	  e
	  f
	  g
	  h
	 java.lang.String i
	  j
	  k
	 org.json.JSONObject l
	
	    public bty()
	    {
	        this.a();
	        return;
	    }
	
	
	    static int a(String p6)
	    {
	        int v0 = 0;
	        if ((p6 != null) && ((p6.length() == 9) && (p6.charAt(0) == 35))) {
	            try {
	                v0 = android.graphics.Color.argb(Integer.parseInt(p6.substring(7, 9), 16), Integer.parseInt(p6.substring(1, 3), 16), Integer.parseInt(p6.substring(3, 5), 16), Integer.parseInt(p6.substring(5, 7), 16));
	            } catch (NumberFormatException v1) {
	            }
	        }
	        return v0;
	    }
	
	
	    void a()
	    {
	        this.a = 1065353216;
	        this.b = 0;
	        this.c = 0;
	        this.d = -1;
	        this.e = 0;
	        this.f = -1;
	        this.g = 0;
	        this.h = 0;
	        this.i = 0;
	        this.j = -1;
	        this.k = -1;
	        this.l = 0;
	        return;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v2 = 0;
	        if (this != p5) {
	            if ((p5 instanceof bty)) {
	                int v0_2;
	                if (this.l != null) {
	                    v0_2 = 0;
	                } else {
	                    v0_2 = 1;
	                }
	                int v3_1;
	                if (((bty) p5).l != null) {
	                    v3_1 = 0;
	                } else {
	                    v3_1 = 1;
	                }
	                if (((v0_2 == v3_1) && ((this.l == null) || ((((bty) p5).l == null) || (cae.a(this.l, ((bty) p5).l))))) && ((this.a == ((bty) p5).a) && ((this.b == ((bty) p5).b) && ((this.c == ((bty) p5).c) && ((this.d == ((bty) p5).d) && ((this.e == ((bty) p5).e) && ((this.f == ((bty) p5).f) && ((this.h == ((bty) p5).h) && ((a.d(this.i, ((bty) p5).i)) && ((this.j == ((bty) p5).j) && (this.k == ((bty) p5).k))))))))))) {
	                    v2 = 1;
	                }
	            }
	        } else {
	            v2 = 1;
	        }
	        return v2;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_1 = new Object[12];
	        v0_1[0] = Float.valueOf(this.a);
	        v0_1[1] = Integer.valueOf(this.b);
	        v0_1[2] = Integer.valueOf(this.c);
	        v0_1[3] = Integer.valueOf(this.d);
	        v0_1[4] = Integer.valueOf(this.e);
	        v0_1[5] = Integer.valueOf(this.f);
	        v0_1[6] = Integer.valueOf(this.g);
	        v0_1[7] = Integer.valueOf(this.h);
	        v0_1[8] = this.i;
	        v0_1[9] = Integer.valueOf(this.j);
	        v0_1[10] = Integer.valueOf(this.k);
	        v0_1[11] = this.l;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
