	public  a
	public btg b
	public  c
	public  d
	private  e
	private  f
	private  g
	private  h
	private  i
	private J j
	
	    public btj(org.json.JSONObject p2)
	    {
	        this.a(p2, 0);
	        return;
	    }
	
	
	    public final int a(org.json.JSONObject p13, int p14)
	    {
	        int v0_2;
	        int v4_0 = 2;
	        String v2_0 = 0;
	        String v1_0 = 1;
	        long v8_0 = p13.getLong("mediaSessionId");
	        if (v8_0 == this.a) {
	            v0_2 = 0;
	        } else {
	            this.a = v8_0;
	            v0_2 = 1;
	        }
	        if (p13.has("playerState")) {
	            boolean v3_5;
	            boolean v3_3 = p13.getString("playerState");
	            if (!v3_3.equals("IDLE")) {
	                if (!v3_3.equals("PLAYING")) {
	                    if (!v3_3.equals("PAUSED")) {
	                        if (!v3_3.equals("BUFFERING")) {
	                            v3_5 = 0;
	                        } else {
	                            v3_5 = 4;
	                        }
	                    } else {
	                        v3_5 = 3;
	                    }
	                } else {
	                    v3_5 = 2;
	                }
	            } else {
	                v3_5 = 1;
	            }
	            if (v3_5 != this.c) {
	                this.c = v3_5;
	                v0_2 |= 2;
	            }
	            if ((v3_5 == 1) && (p13.has("idleReason"))) {
	                boolean v3_9 = p13.getString("idleReason");
	                if (!v3_9.equals("CANCELLED")) {
	                    if (!v3_9.equals("INTERRUPTED")) {
	                        if (!v3_9.equals("FINISHED")) {
	                            if (!v3_9.equals("ERROR")) {
	                                v4_0 = 0;
	                            } else {
	                                v4_0 = 4;
	                            }
	                        } else {
	                            v4_0 = 1;
	                        }
	                    } else {
	                        v4_0 = 3;
	                    }
	                }
	                if (v4_0 != this.f) {
	                    this.f = v4_0;
	                    v0_2 |= 2;
	                }
	            }
	        }
	        if (p13.has("playbackRate")) {
	            int v4_6 = p13.getDouble("playbackRate");
	            if (this.e != v4_6) {
	                this.e = v4_6;
	                v0_2 |= 2;
	            }
	        }
	        if ((p13.has("currentTime")) && ((p14 & 2) == 0)) {
	            int v4_9 = ((long) (p13.getDouble("currentTime") * 1000.0));
	            if (v4_9 != this.g) {
	                this.g = v4_9;
	                v0_2 |= 2;
	            }
	        }
	        if (p13.has("supportedMediaCommands")) {
	            int v4_10 = p13.getLong("supportedMediaCommands");
	            if (v4_10 != this.d) {
	                this.d = v4_10;
	                v0_2 |= 2;
	            }
	        }
	        if ((p13.has("volume")) && ((p14 & 1) == 0)) {
	            boolean v3_29 = p13.getJSONObject("volume");
	            int v4_12 = v3_29.getDouble("level");
	            if (v4_12 != this.h) {
	                this.h = v4_12;
	                v0_2 |= 2;
	            }
	            boolean v3_30 = v3_29.getBoolean("muted");
	            if (v3_30 != this.i) {
	                this.i = v3_30;
	                v0_2 |= 2;
	            }
	        }
	        String v1_1;
	        if (!p13.has("activeTrackIds")) {
	            if (this.j == null) {
	                v1_1 = 0;
	            } else {
	                v2_0 = 1;
	                v1_1 = 0;
	            }
	        } else {
	            long v5_1 = p13.getJSONArray("activeTrackIds");
	            int v6_7 = v5_1.length();
	            boolean v3_33 = new long[v6_7];
	            int v4_18 = 0;
	            while (v4_18 < v6_7) {
	                v3_33[v4_18] = v5_1.getLong(v4_18);
	                v4_18++;
	            }
	            if ((this.j != null) && (this.j.length == v6_7)) {
	                int v4_22 = 0;
	                while (v4_22 < v6_7) {
	                    if (this.j[v4_22] == v3_33[v4_22]) {
	                        v4_22++;
	                    }
	                }
	                v1_0 = 0;
	            }
	            if (v1_0 != null) {
	                this.j = v3_33;
	            }
	            v2_0 = v1_0;
	            v1_1 = v3_33;
	        }
	        if (v2_0 != null) {
	            this.j = v1_1;
	            v0_2 |= 2;
	        }
	        if (p13.has("customData")) {
	            p13.getJSONObject("customData");
	            v0_2 |= 2;
	        }
	        if (p13.has("media")) {
	            String v1_8 = p13.getJSONObject("media");
	            this.b = new btg(v1_8);
	            v0_2 |= 2;
	            if (v1_8.has("metadata")) {
	                v0_2 |= 4;
	            }
	        }
	        return v0_2;
	    }
	
