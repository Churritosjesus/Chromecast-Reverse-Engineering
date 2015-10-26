	private final java.lang.String a
	private final  b
	private synthetic bqp c
	
	    bqq(bqp p4, String p5, long p6)
	    {
	        int v0_2;
	        this.c = p4;
	        a.f(p5);
	        if (p6 <= 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        a.b(v0_2);
	        this.a = p5;
	        this.b = p6;
	        return;
	    }
	
	
	    private void b()
	    {
	        long v0_3 = this.c.d.c.a();
	        android.content.SharedPreferences$Editor v2_2 = this.c.a.edit();
	        v2_2.remove(this.e());
	        v2_2.remove(this.f());
	        v2_2.putLong(this.d(), v0_3);
	        v2_2.commit();
	        return;
	    }
	
	
	    private long c()
	    {
	        return this.c.a.getLong(this.d(), 0);
	    }
	
	
	    private String d()
	    {
	        return new StringBuilder().append(this.a).append(":start").toString();
	    }
	
	
	    private String e()
	    {
	        return new StringBuilder().append(this.a).append(":count").toString();
	    }
	
	
	    private String f()
	    {
	        return new StringBuilder().append(this.a).append(":value").toString();
	    }
	
	
	    public final android.util.Pair a()
	    {
	        android.util.Pair v0_2;
	        android.util.Pair v0_0 = this.c();
	        if (v0_0 != 0) {
	            v0_2 = Math.abs((v0_0 - this.c.d.c.a()));
	        } else {
	            v0_2 = 0;
	        }
	        android.util.Pair v0_10;
	        if (v0_2 >= this.b) {
	            if (v0_2 <= (this.b << 1)) {
	                String v1_1 = this.c.a.getString(this.f(), 0);
	                long v6_4 = this.c.a.getLong(this.e(), 0);
	                this.b();
	                if ((v1_1 != null) && (v6_4 > 0)) {
	                    v0_10 = new android.util.Pair(v1_1, Long.valueOf(v6_4));
	                } else {
	                    v0_10 = 0;
	                }
	            } else {
	                this.b();
	                v0_10 = 0;
	            }
	        } else {
	            v0_10 = 0;
	        }
	        return v0_10;
	    }
	
	
	    public final void a(String p11)
	    {
	        if (this.c() == 0) {
	            this.b();
	        }
	        if (p11 == null) {
	            p11 = "";
	        }
	        try {
	            long v2_1 = this.c.a.getLong(this.e(), 0);
	        } catch (String v0_15) {
	            throw v0_15;
	        }
	        if (v2_1 > 0) {
	            String v0_9;
	            if ((java.util.UUID.randomUUID().getLeastSignificantBits() & nan) >= (nan / (v2_1 + 1))) {
	                v0_9 = 0;
	            } else {
	                v0_9 = 1;
	            }
	            android.content.SharedPreferences$Editor v1_3 = this.c.a.edit();
	            if (v0_9 != null) {
	                v1_3.putString(this.f(), p11);
	            }
	            v1_3.putLong(this.e(), (v2_1 + 1));
	            v1_3.apply();
	        } else {
	            String v0_14 = this.c.a.edit();
	            v0_14.putString(this.f(), p11);
	            v0_14.putLong(this.e(), 1);
	            v0_14.apply();
	        }
	        return;
	    }
	
