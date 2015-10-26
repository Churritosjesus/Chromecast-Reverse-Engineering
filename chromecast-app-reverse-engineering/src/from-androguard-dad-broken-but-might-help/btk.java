	private  a
	private  b
	private java.lang.String c
	private java.lang.String d
	private java.lang.String e
	private java.lang.String f
	private  g
	private org.json.JSONObject h
	
	    btk(org.json.JSONObject p8)
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.e = 0;
	        this.f = 0;
	        this.g = -1;
	        this.h = 0;
	        this.a = p8.getLong("trackId");
	        String v0_5 = p8.getString("type");
	        if (!"TEXT".equals(v0_5)) {
	            if (!"AUDIO".equals(v0_5)) {
	                if (!"VIDEO".equals(v0_5)) {
	                    throw new org.json.JSONException(new StringBuilder("invalid type: ").append(v0_5).toString());
	                } else {
	                    this.b = 3;
	                }
	            } else {
	                this.b = 2;
	            }
	        } else {
	            this.b = 1;
	        }
	        this.c = p8.optString("trackContentId", 0);
	        this.d = p8.optString("trackContentType", 0);
	        this.e = p8.optString("name", 0);
	        this.f = p8.optString("language", 0);
	        if (!p8.has("subtype")) {
	            this.g = 0;
	        } else {
	            String v0_19 = p8.getString("subtype");
	            if (!"SUBTITLES".equals(v0_19)) {
	                if (!"CAPTIONS".equals(v0_19)) {
	                    if (!"DESCRIPTIONS".equals(v0_19)) {
	                        if (!"CHAPTERS".equals(v0_19)) {
	                            if (!"METADATA".equals(v0_19)) {
	                                throw new org.json.JSONException(new StringBuilder("invalid subtype: ").append(v0_19).toString());
	                            } else {
	                                this.g = 5;
	                            }
	                        } else {
	                            this.g = 4;
	                        }
	                    } else {
	                        this.g = 3;
	                    }
	                } else {
	                    this.g = 2;
	                }
	            } else {
	                this.g = 1;
	            }
	        }
	        this.h = p8.optJSONObject("customData");
	        return;
	    }
	
	
	    public final boolean equals(Object p9)
	    {
	        int v2 = 0;
	        if (this != p9) {
	            if ((p9 instanceof btk)) {
	                int v0_2;
	                if (this.h != null) {
	                    v0_2 = 0;
	                } else {
	                    v0_2 = 1;
	                }
	                int v3_1;
	                if (((btk) p9).h != null) {
	                    v3_1 = 0;
	                } else {
	                    v3_1 = 1;
	                }
	                if (((v0_2 == v3_1) && ((this.h == null) || ((((btk) p9).h == null) || (cae.a(this.h, ((btk) p9).h))))) && ((this.a == ((btk) p9).a) && ((this.b == ((btk) p9).b) && ((a.d(this.c, ((btk) p9).c)) && ((a.d(this.d, ((btk) p9).d)) && ((a.d(this.e, ((btk) p9).e)) && ((a.d(this.f, ((btk) p9).f)) && (this.g == ((btk) p9).g)))))))) {
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
	        int v0_1 = new Object[8];
	        v0_1[0] = Long.valueOf(this.a);
	        v0_1[1] = Integer.valueOf(this.b);
	        v0_1[2] = this.c;
	        v0_1[3] = this.d;
	        v0_1[4] = this.e;
	        v0_1[5] = this.f;
	        v0_1[6] = Integer.valueOf(this.g);
	        v0_1[7] = this.h;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
