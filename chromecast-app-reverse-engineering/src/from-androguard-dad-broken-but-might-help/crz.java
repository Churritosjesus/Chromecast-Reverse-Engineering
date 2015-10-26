	public static final crz a
	private Ljava.util.regex.Pattern b
	private Ljava.lang.String c
	
	    static crz()
	    {
	        crz.a = new crz();
	        return;
	    }
	
	
	    private crz()
	    {
	        String[] v0_0 = new java.util.regex.Pattern[0];
	        this.b = v0_0;
	        String[] v0_1 = new String[0];
	        this.c = v0_1;
	        return;
	    }
	
	
	    public final declared_synchronized String a(String p4)
	    {
	        try {
	            String v0_2;
	            if (!android.text.TextUtils.isEmpty(p4)) {
	                int v1 = 0;
	                v0_2 = p4;
	                while (v1 < this.b.length) {
	                    String v4_1 = this.b[v1].matcher(v0_2).replaceAll(this.c[v1]);
	                    v1++;
	                    v0_2 = v4_1;
	                }
	            } else {
	                v0_2 = 0;
	            }
	        } catch (String v0_3) {
	            throw v0_3;
	        }
	        return v0_2;
	    }
	
	
	    public final declared_synchronized void a(String[] p4, String[] p5)
	    {
	        int v0_0 = 0;
	        try {
	            java.util.regex.Pattern[] v1_1;
	            if (p4.length != p5.length) {
	                v1_1 = 0;
	            } else {
	                v1_1 = 1;
	            }
	        } catch (int v0_1) {
	            throw v0_1;
	        }
	        a.b(v1_1);
	        java.util.regex.Pattern[] v1_3 = new java.util.regex.Pattern[p4.length];
	        this.b = v1_3;
	        this.c = p5;
	        while (v0_0 < p4.length) {
	            this.b[v0_0] = java.util.regex.Pattern.compile(p4[v0_0]);
	            v0_0++;
	        }
	        return;
	    }
	
