	private static final Ljava.lang.String d
	private static final bti e
	public final java.util.List a
	final android.os.Bundle b
	public  c
	
	    static bth()
	    {
	        bti v0_1 = new String[5];
	        v0_1[0] = 0;
	        v0_1[1] = "String";
	        v0_1[2] = "int";
	        v0_1[3] = "double";
	        v0_1[4] = "ISO-8601 date String";
	        bth.d = v0_1;
	        bth.e = new bti().a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", "title", 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
	        return;
	    }
	
	
	    public bth()
	    {
	        this(0);
	        return;
	    }
	
	
	    public bth(int p2)
	    {
	        this.a = new java.util.ArrayList();
	        this.b = new android.os.Bundle();
	        this.c = p2;
	        return;
	    }
	
	
	    private static void a(String p3, int p4)
	    {
	        if (!android.text.TextUtils.isEmpty(p3)) {
	            IllegalArgumentException v0_2 = bth.e.a(p3);
	            if ((v0_2 == p4) || (v0_2 == null)) {
	                return;
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("Value for ").append(p3).append(" must be a ").append(bth.d[p4]).toString());
	            }
	        } else {
	            throw new IllegalArgumentException("null and empty keys are not allowed");
	        }
	    }
	
	
	    private boolean a(android.os.Bundle p8, android.os.Bundle p9)
	    {
	        int v0_3;
	        if (p8.size() == p9.size()) {
	            java.util.Iterator v6 = p8.keySet().iterator();
	            while (v6.hasNext()) {
	                int v0_5 = ((String) v6.next());
	                Object v2 = p8.get(v0_5);
	                Object v4 = p9.get(v0_5);
	                if ((!(v2 instanceof android.os.Bundle)) || ((!(v4 instanceof android.os.Bundle)) || (this.a(((android.os.Bundle) v2), ((android.os.Bundle) v4))))) {
	                    if (v2 != null) {
	                        if (!v2.equals(v4)) {
	                            v0_3 = 0;
	                        }
	                    } else {
	                        if ((v4 != null) || (!p9.containsKey(v0_5))) {
	                            v0_3 = 0;
	                        }
	                    }
	                } else {
	                    v0_3 = 0;
	                }
	            }
	            v0_3 = 1;
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    varargs void a(org.json.JSONObject p11, String[] p12)
	    {
	        java.util.HashSet v5_1 = new java.util.HashSet(java.util.Arrays.asList(p12));
	        java.util.Iterator v6 = p11.keys();
	        while (v6.hasNext()) {
	            String v2_3 = ((String) v6.next());
	            if (!"metadataType".equals(v2_3)) {
	                Double v3_5 = ((String) bth.e.a.get(v2_3));
	                if (v3_5 == null) {
	                    Double v3_6 = p11.get(v2_3);
	                    if (!(v3_6 instanceof String)) {
	                        if (!(v3_6 instanceof Integer)) {
	                            if (!(v3_6 instanceof Double)) {
	                            } else {
	                                this.b.putDouble(v2_3, ((Double) v3_6).doubleValue());
	                            }
	                        } else {
	                            this.b.putInt(v2_3, ((Integer) v3_6).intValue());
	                        }
	                    } else {
	                        this.b.putString(v2_3, ((String) v3_6));
	                    }
	                } else {
	                    if (v5_1.contains(v3_5)) {
	                        String v2_4 = p11.get(v2_3);
	                        if (v2_4 != null) {
	                            switch (bth.e.a(v3_5)) {
	                                case 1:
	                                    if ((v2_4 instanceof String)) {
	                                        this.b.putString(v3_5, ((String) v2_4));
	                                    }
	                                    break;
	                                case 2:
	                                    if ((v2_4 instanceof Integer)) {
	                                        this.b.putInt(v3_5, ((Integer) v2_4).intValue());
	                                    }
	                                    break;
	                                case 3:
	                                    if ((v2_4 instanceof Double)) {
	                                        this.b.putDouble(v3_5, ((Double) v2_4).doubleValue());
	                                    }
	                                    break;
	                                case 4:
	                                    if (((v2_4 instanceof String)) && (cjf.a(((String) v2_4)) != null)) {
	                                        this.b.putString(v3_5, ((String) v2_4));
	                                    }
	                                    break;
	                                default:
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final boolean a(String p2)
	    {
	        return this.b.containsKey(p2);
	    }
	
	
	    public final String b(String p2)
	    {
	        bth.a(p2, 1);
	        return this.b.getString(p2);
	    }
	
	
	    public final int c(String p2)
	    {
	        bth.a(p2, 2);
	        return this.b.getInt(p2);
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if ((p5 instanceof bth)) {
	                if ((!this.a(this.b, ((bth) p5).b)) || (!this.a.equals(((bth) p5).a))) {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        java.util.Iterator v2 = this.b.keySet().iterator();
	        int v1_2 = 17;
	        while (v2.hasNext()) {
	            v1_2 = (this.b.get(((String) v2.next())).hashCode() + (v1_2 * 31));
	        }
	        return ((v1_2 * 31) + this.a.hashCode());
	    }
	
