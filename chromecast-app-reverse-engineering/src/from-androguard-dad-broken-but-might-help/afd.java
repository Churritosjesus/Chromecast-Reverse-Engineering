	final android.content.SharedPreferences a
	private final afe b
	private agr c
	
	    public afd()
	    {
	        this(afv.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new afe());
	        return;
	    }
	
	
	    private afd(android.content.SharedPreferences p1, afe p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    private afb c()
	    {
	        afb v0 = 0;
	        org.json.JSONException v1_1 = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", 0);
	        if (v1_1 != null) {
	            try {
	                v0 = afb.a(new org.json.JSONObject(v1_1));
	            } catch (org.json.JSONException v1) {
	            }
	        }
	        return v0;
	    }
	
	
	    public final afb a()
	    {
	        afb v0 = 0;
	        if (!this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
	            if (afv.c()) {
	                agr v1_4 = this.b().a();
	                if ((v1_4 != null) && (agr.a(v1_4))) {
	                    v0 = afb.a(v1_4);
	                }
	                if (v0 != null) {
	                    this.a(v0);
	                    this.b().b();
	                }
	            }
	        } else {
	            v0 = this.c();
	        }
	        return v0;
	    }
	
	
	    public final void a(afb p5)
	    {
	        ajp.a(p5, "accessToken");
	        try {
	            org.json.JSONException v0_2 = new org.json.JSONObject();
	            v0_2.put("version", 1);
	            v0_2.put("token", p5.d);
	            v0_2.put("expires_at", p5.a.getTime());
	            v0_2.put("permissions", new org.json.JSONArray(p5.b));
	            v0_2.put("declined_permissions", new org.json.JSONArray(p5.c));
	            v0_2.put("last_refresh", p5.f.getTime());
	            v0_2.put("source", p5.e.name());
	            v0_2.put("application_id", p5.g);
	            v0_2.put("user_id", p5.h);
	            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", v0_2.toString()).apply();
	        } catch (org.json.JSONException v0) {
	        }
	        return;
	    }
	
	
	    agr b()
	    {
	        if (this.c == null) {
	            if (this.c == null) {
	                this.c = new agr(afv.f());
	            }
	        }
	        return this.c;
	    }
	
