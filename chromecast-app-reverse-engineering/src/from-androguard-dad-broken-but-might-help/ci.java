	public static final android.os.Parcelable$Creator CREATOR
	private static final ed a
	private static final Ljava.lang.String b
	private static final Ljava.lang.String c
	private static final Ljava.lang.String d
	private final android.os.Bundle e
	private cf f
	
	    static ci()
	    {
	        cj v0_1 = new ed();
	        ci.a = v0_1;
	        v0_1.put("android.media.metadata.TITLE", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.DURATION", Integer.valueOf(0));
	        ci.a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.WRITER", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.DATE", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.YEAR", Integer.valueOf(0));
	        ci.a.put("android.media.metadata.GENRE", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
	        ci.a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
	        ci.a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
	        ci.a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.ART", Integer.valueOf(2));
	        ci.a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
	        ci.a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
	        ci.a.put("android.media.metadata.RATING", Integer.valueOf(3));
	        ci.a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
	        ci.a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
	        ci.a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
	        cj v0_29 = new String[7];
	        v0_29[0] = "android.media.metadata.TITLE";
	        v0_29[1] = "android.media.metadata.ARTIST";
	        v0_29[2] = "android.media.metadata.ALBUM";
	        v0_29[3] = "android.media.metadata.ALBUM_ARTIST";
	        v0_29[4] = "android.media.metadata.WRITER";
	        v0_29[5] = "android.media.metadata.AUTHOR";
	        v0_29[6] = "android.media.metadata.COMPOSER";
	        ci.b = v0_29;
	        cj v0_30 = new String[3];
	        v0_30[0] = "android.media.metadata.DISPLAY_ICON";
	        v0_30[1] = "android.media.metadata.ART";
	        v0_30[2] = "android.media.metadata.ALBUM_ART";
	        ci.c = v0_30;
	        cj v0_31 = new String[3];
	        v0_31[0] = "android.media.metadata.DISPLAY_ICON_URI";
	        v0_31[1] = "android.media.metadata.ART_URI";
	        v0_31[2] = "android.media.metadata.ALBUM_ART_URI";
	        ci.d = v0_31;
	        ci.CREATOR = new cj();
	        return;
	    }
	
	
	    ci(android.os.Bundle p2)
	    {
	        this.e = new android.os.Bundle(p2);
	        return;
	    }
	
	
	    ci(android.os.Parcel p2)
	    {
	        this.e = p2.readBundle();
	        return;
	    }
	
	
	    public static ci a(Object p6)
	    {
	        if ((p6 != null) && (android.os.Build$VERSION.SDK_INT >= 21)) {
	            String v2_1 = new ck();
	            String v3_0 = ((android.media.MediaMetadata) p6).keySet().iterator();
	            while (v3_0.hasNext()) {
	                String v0_8 = ((String) v3_0.next());
	                IllegalArgumentException v1_4 = ((Integer) ci.a.get(v0_8));
	                if (v1_4 != null) {
	                    switch (v1_4.intValue()) {
	                        case 0:
	                            cl v4_3 = ((android.media.MediaMetadata) p6).getLong(v0_8);
	                            if ((!ci.a.containsKey(v0_8)) || (((Integer) ci.a.get(v0_8)).intValue() == 0)) {
	                                v2_1.a.putLong(v0_8, v4_3);
	                            } else {
	                                throw new IllegalArgumentException(new StringBuilder("The ").append(v0_8).append(" key cannot be used to put a long").toString());
	                            }
	                            break;
	                        case 1:
	                            cl v4_2 = ((android.media.MediaMetadata) p6).getText(v0_8);
	                            if ((!ci.a.containsKey(v0_8)) || (((Integer) ci.a.get(v0_8)).intValue() == 1)) {
	                                v2_1.a.putCharSequence(v0_8, v4_2);
	                            } else {
	                                throw new IllegalArgumentException(new StringBuilder("The ").append(v0_8).append(" key cannot be used to put a CharSequence").toString());
	                            }
	                            break;
	                        case 2:
	                            cl v4_1 = ((android.media.MediaMetadata) p6).getBitmap(v0_8);
	                            if ((!ci.a.containsKey(v0_8)) || (((Integer) ci.a.get(v0_8)).intValue() == 2)) {
	                                v2_1.a.putParcelable(v0_8, v4_1);
	                            } else {
	                                throw new IllegalArgumentException(new StringBuilder("The ").append(v0_8).append(" key cannot be used to put a Bitmap").toString());
	                            }
	                            break;
	                        case 3:
	                            cl v4_0 = cl.a(((android.media.MediaMetadata) p6).getRating(v0_8));
	                            if ((!ci.a.containsKey(v0_8)) || (((Integer) ci.a.get(v0_8)).intValue() == 3)) {
	                                v2_1.a.putParcelable(v0_8, v4_0);
	                            } else {
	                                throw new IllegalArgumentException(new StringBuilder("The ").append(v0_8).append(" key cannot be used to put a Rating").toString());
	                            }
	                            break;
	                        default:
	                    }
	                }
	            }
	            String v0_6 = new ci(v2_1.a);
	        } else {
	            v0_6 = 0;
	        }
	        return v0_6;
	    }
	
	
	    private CharSequence a(String p2)
	    {
	        return this.e.getCharSequence(p2);
	    }
	
	
	    private String b(String p2)
	    {
	        int v0_2;
	        int v0_1 = this.e.getCharSequence(p2);
	        if (v0_1 == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = v0_1.toString();
	        }
	        return v0_2;
	    }
	
	
	    private android.graphics.Bitmap c(String p5)
	    {
	        try {
	            int v0_2 = ((android.graphics.Bitmap) this.e.getParcelable(p5));
	        } catch (int v0_3) {
	            android.util.Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", v0_3);
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final cf a()
	    {
	        cf v0_15;
	        android.net.Uri v3 = 0;
	        if (this.f == null) {
	            String v5 = this.b("android.media.metadata.MEDIA_ID");
	            CharSequence[] v6 = new CharSequence[3];
	            cf v0_3 = this.a("android.media.metadata.DISPLAY_TITLE");
	            if (android.text.TextUtils.isEmpty(v0_3)) {
	                cf v0_4 = 0;
	                int v1_1 = 0;
	                while ((v1_1 < 3) && (v0_4 < ci.b.length)) {
	                    cf v0_7;
	                    String v4_2 = (v0_4 + 1);
	                    boolean v7_1 = this.a(ci.b[v0_4]);
	                    if (android.text.TextUtils.isEmpty(v7_1)) {
	                        v0_7 = v1_1;
	                    } else {
	                        v0_7 = (v1_1 + 1);
	                        v6[v1_1] = v7_1;
	                    }
	                    v1_1 = v0_7;
	                    v0_4 = v4_2;
	                }
	            } else {
	                v6[0] = v0_3;
	                v6[1] = this.a("android.media.metadata.DISPLAY_SUBTITLE");
	                v6[2] = this.a("android.media.metadata.DISPLAY_DESCRIPTION");
	            }
	            cf v0_12 = 0;
	            while (v0_12 < ci.c.length) {
	                int v1_6 = this.c(ci.c[v0_12]);
	                if (v1_6 == 0) {
	                    v0_12++;
	                } else {
	                    cf v0_13 = v1_6;
	                }
	                int v1_7 = 0;
	                while (v1_7 < ci.d.length) {
	                    String v4_7 = this.b(ci.d[v1_7]);
	                    if (android.text.TextUtils.isEmpty(v4_7)) {
	                        v1_7++;
	                    } else {
	                        v3 = android.net.Uri.parse(v4_7);
	                        break;
	                    }
	                }
	                int v1_9 = new ch();
	                v1_9.a = v5;
	                v1_9.b = v6[0];
	                v1_9.c = v6[1];
	                v1_9.d = v6[2];
	                v1_9.e = v0_13;
	                v1_9.f = v3;
	                this.f = v1_9.a();
	                v0_15 = this.f;
	            }
	            v0_13 = 0;
	        } else {
	            v0_15 = this.f;
	        }
	        return v0_15;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeBundle(this.e);
	        return;
	    }
	
