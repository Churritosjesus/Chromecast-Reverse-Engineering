	public bth a
	private final java.lang.String b
	private  c
	private java.lang.String d
	private  e
	private java.util.List f
	private org.json.JSONObject g
	
	    btg(org.json.JSONObject p11)
	    {
	        this.b = p11.getString("contentId");
	        org.json.JSONObject v0_3 = p11.getString("streamType");
	        if (!"NONE".equals(v0_3)) {
	            if (!"BUFFERED".equals(v0_3)) {
	                if (!"LIVE".equals(v0_3)) {
	                    this.c = -1;
	                } else {
	                    this.c = 2;
	                }
	            } else {
	                this.c = 1;
	            }
	        } else {
	            this.c = 0;
	        }
	        this.d = p11.getString("contentType");
	        if (p11.has("metadata")) {
	            org.json.JSONObject v0_11 = p11.getJSONObject("metadata");
	            this.a = new bth(v0_11.getInt("metadataType"));
	            bty v2_7 = this.a;
	            v2_7.b.clear();
	            v2_7.a.clear();
	            v2_7.c = 0;
	            try {
	                v2_7.c = v0_11.getInt("metadataType");
	            } catch (int v3) {
	            }
	            cjf.a(v2_7.a, v0_11);
	            switch (v2_7.c) {
	                case 0:
	                    int v3_15 = new String[4];
	                    v3_15[0] = "com.google.android.gms.cast.metadata.TITLE";
	                    v3_15[1] = "com.google.android.gms.cast.metadata.ARTIST";
	                    v3_15[2] = "com.google.android.gms.cast.metadata.SUBTITLE";
	                    v3_15[3] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
	                    v2_7.a(v0_11, v3_15);
	                    break;
	                case 1:
	                    int v3_14 = new String[4];
	                    v3_14[0] = "com.google.android.gms.cast.metadata.TITLE";
	                    v3_14[1] = "com.google.android.gms.cast.metadata.STUDIO";
	                    v3_14[2] = "com.google.android.gms.cast.metadata.SUBTITLE";
	                    v3_14[3] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
	                    v2_7.a(v0_11, v3_14);
	                    break;
	                case 2:
	                    int v3_13 = new String[5];
	                    v3_13[0] = "com.google.android.gms.cast.metadata.TITLE";
	                    v3_13[1] = "com.google.android.gms.cast.metadata.SERIES_TITLE";
	                    v3_13[2] = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
	                    v3_13[3] = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
	                    v3_13[4] = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
	                    v2_7.a(v0_11, v3_13);
	                    break;
	                case 3:
	                    int v3_11 = new String[8];
	                    v3_11[0] = "com.google.android.gms.cast.metadata.TITLE";
	                    v3_11[1] = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
	                    v3_11[2] = "com.google.android.gms.cast.metadata.ARTIST";
	                    v3_11[3] = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
	                    v3_11[4] = "com.google.android.gms.cast.metadata.COMPOSER";
	                    v3_11[5] = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
	                    v3_11[6] = "com.google.android.gms.cast.metadata.DISC_NUMBER";
	                    v3_11[7] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
	                    v2_7.a(v0_11, v3_11);
	                    break;
	                case 4:
	                    int v3_9 = new String[8];
	                    v3_9[0] = "com.google.android.gms.cast.metadata.TITLE";
	                    v3_9[1] = "com.google.android.gms.cast.metadata.ARTIST";
	                    v3_9[2] = "com.google.android.gms.cast.metadata.LOCATION_NAME";
	                    v3_9[3] = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
	                    v3_9[4] = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
	                    v3_9[5] = "com.google.android.gms.cast.metadata.WIDTH";
	                    v3_9[6] = "com.google.android.gms.cast.metadata.HEIGHT";
	                    v3_9[7] = "com.google.android.gms.cast.metadata.CREATION_DATE";
	                    v2_7.a(v0_11, v3_9);
	                    break;
	                default:
	                    int v3_16 = new String[0];
	                    v2_7.a(v0_11, v3_16);
	            }
	        }
	        this.e = -1;
	        if ((p11.has("duration")) && (!p11.isNull("duration"))) {
	            bty v2_10 = p11.optDouble("duration", 0);
	            if ((!Double.isNaN(v2_10)) && (!Double.isInfinite(v2_10))) {
	                this.e = ((long) (v2_10 * 1000.0));
	            }
	        }
	        if (!p11.has("tracks")) {
	            this.f = 0;
	        } else {
	            this.f = new java.util.ArrayList();
	            bty v2_13 = p11.getJSONArray("tracks");
	            org.json.JSONObject v0_25 = 0;
	            while (v0_25 < v2_13.length()) {
	                this.f.add(new btk(v2_13.getJSONObject(v0_25)));
	                v0_25++;
	            }
	        }
	        if (p11.has("textTrackStyle")) {
	            org.json.JSONObject v0_29 = p11.getJSONObject("textTrackStyle");
	            bty v2_15 = new bty();
	            v2_15.a();
	            v2_15.a = ((float) v0_29.optDouble("fontScale", 1.0));
	            v2_15.b = bty.a(v0_29.optString("foregroundColor"));
	            v2_15.c = bty.a(v0_29.optString("backgroundColor"));
	            if (v0_29.has("edgeType")) {
	                int v3_29 = v0_29.getString("edgeType");
	                if (!"NONE".equals(v3_29)) {
	                    if (!"OUTLINE".equals(v3_29)) {
	                        if (!"DROP_SHADOW".equals(v3_29)) {
	                            if (!"RAISED".equals(v3_29)) {
	                                if ("DEPRESSED".equals(v3_29)) {
	                                    v2_15.d = 4;
	                                }
	                            } else {
	                                v2_15.d = 3;
	                            }
	                        } else {
	                            v2_15.d = 2;
	                        }
	                    } else {
	                        v2_15.d = 1;
	                    }
	                } else {
	                    v2_15.d = 0;
	                }
	            }
	            v2_15.e = bty.a(v0_29.optString("edgeColor"));
	            if (v0_29.has("windowType")) {
	                int v3_37 = v0_29.getString("windowType");
	                if (!"NONE".equals(v3_37)) {
	                    if (!"NORMAL".equals(v3_37)) {
	                        if ("ROUNDED_CORNERS".equals(v3_37)) {
	                            v2_15.f = 2;
	                        }
	                    } else {
	                        v2_15.f = 1;
	                    }
	                } else {
	                    v2_15.f = 0;
	                }
	            }
	            v2_15.g = bty.a(v0_29.optString("windowColor"));
	            if (v2_15.f == 2) {
	                v2_15.h = v0_29.optInt("windowRoundedCornerRadius", 0);
	            }
	            v2_15.i = v0_29.optString("fontFamily", 0);
	            if (v0_29.has("fontGenericFamily")) {
	                int v3_50 = v0_29.getString("fontGenericFamily");
	                if (!"SANS_SERIF".equals(v3_50)) {
	                    if (!"MONOSPACED_SANS_SERIF".equals(v3_50)) {
	                        if (!"SERIF".equals(v3_50)) {
	                            if (!"MONOSPACED_SERIF".equals(v3_50)) {
	                                if (!"CASUAL".equals(v3_50)) {
	                                    if (!"CURSIVE".equals(v3_50)) {
	                                        if ("SMALL_CAPITALS".equals(v3_50)) {
	                                            v2_15.j = 6;
	                                        }
	                                    } else {
	                                        v2_15.j = 5;
	                                    }
	                                } else {
	                                    v2_15.j = 4;
	                                }
	                            } else {
	                                v2_15.j = 3;
	                            }
	                        } else {
	                            v2_15.j = 2;
	                        }
	                    } else {
	                        v2_15.j = 1;
	                    }
	                } else {
	                    v2_15.j = 0;
	                }
	            }
	            if (v0_29.has("fontStyle")) {
	                int v3_57 = v0_29.getString("fontStyle");
	                if (!"NORMAL".equals(v3_57)) {
	                    if (!"BOLD".equals(v3_57)) {
	                        if (!"ITALIC".equals(v3_57)) {
	                            if ("BOLD_ITALIC".equals(v3_57)) {
	                                v2_15.k = 3;
	                            }
	                        } else {
	                            v2_15.k = 2;
	                        }
	                    } else {
	                        v2_15.k = 1;
	                    }
	                } else {
	                    v2_15.k = 0;
	                }
	            }
	            v2_15.l = v0_29.optJSONObject("customData");
	        }
	        this.g = p11.optJSONObject("customData");
	        return;
	    }
	
	
	    public final boolean equals(Object p9)
	    {
	        int v2 = 0;
	        if (this != p9) {
	            if ((p9 instanceof btg)) {
	                long v0_2;
	                if (this.g != null) {
	                    v0_2 = 0;
	                } else {
	                    v0_2 = 1;
	                }
	                bth v3_1;
	                if (((btg) p9).g != null) {
	                    v3_1 = 0;
	                } else {
	                    v3_1 = 1;
	                }
	                if (((v0_2 == v3_1) && ((this.g == null) || ((((btg) p9).g == null) || (cae.a(this.g, ((btg) p9).g))))) && ((a.d(this.b, ((btg) p9).b)) && ((this.c == ((btg) p9).c) && ((a.d(this.d, ((btg) p9).d)) && ((a.d(this.a, ((btg) p9).a)) && (this.e == ((btg) p9).e)))))) {
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
	        int v0_1 = new Object[6];
	        v0_1[0] = this.b;
	        v0_1[1] = Integer.valueOf(this.c);
	        v0_1[2] = this.d;
	        v0_1[3] = this.a;
	        v0_1[4] = Long.valueOf(this.e);
	        v0_1[5] = String.valueOf(this.g);
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
