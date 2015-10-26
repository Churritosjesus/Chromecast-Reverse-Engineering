	private synthetic aqm a
	
	    aqn(aqm p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        String v0_3 = aqj.c(this.a.a).b();
	        if ((v0_3 != null) && (v0_3.a != null)) {
	            String v0_8;
	            aow v4 = aqj.b(this.a.a);
	            bth v5 = v0_3.a;
	            int v3_3 = aqj.d(this.a.a);
	            atu v6 = v4.o();
	            String v0_7 = v5.b("com.google.android.gms.cast.metadata.TITLE");
	            if (android.text.TextUtils.equals(v6.f, v0_7)) {
	                v0_8 = 0;
	            } else {
	                v6.f = v0_7;
	                v0_8 = 1;
	            }
	            boolean v7_3 = new java.util.ArrayList(2);
	            switch (v5.c) {
	                case 0:
	                    if (v5.a("com.google.android.gms.cast.metadata.SUBTITLE")) {
	                        v7_3.add(v5.b("com.google.android.gms.cast.metadata.SUBTITLE"));
	                    }
	                    if (!v5.a("com.google.android.gms.cast.metadata.ARTIST")) {
	                    } else {
	                        v7_3.add(v5.b("com.google.android.gms.cast.metadata.ARTIST"));
	                    }
	                    break;
	                case 1:
	                    if (!v5.a("com.google.android.gms.cast.metadata.SUBTITLE")) {
	                    } else {
	                        v7_3.add(v5.b("com.google.android.gms.cast.metadata.SUBTITLE"));
	                    }
	                    break;
	                case 2:
	                    if ((!v5.a("com.google.android.gms.cast.metadata.SERIES_TITLE")) || ((!v5.a("com.google.android.gms.cast.metadata.SEASON_NUMBER")) || (!v5.a("com.google.android.gms.cast.metadata.EPISODE_NUMBER")))) {
	                    } else {
	                        Object[] v9_1 = new Object[3];
	                        v9_1[0] = v5.b("com.google.android.gms.cast.metadata.SERIES_TITLE");
	                        v9_1[1] = Integer.valueOf(v5.c("com.google.android.gms.cast.metadata.SEASON_NUMBER"));
	                        v9_1[2] = Integer.valueOf(v5.c("com.google.android.gms.cast.metadata.EPISODE_NUMBER"));
	                        v7_3.add(v3_3.getString(b.dR, v9_1));
	                    }
	                    break;
	                case 3:
	                case 4:
	                    if (!v5.a("com.google.android.gms.cast.metadata.ARTIST")) {
	                    } else {
	                        v7_3.add(v5.b("com.google.android.gms.cast.metadata.ARTIST"));
	                    }
	                    break;
	                default:
	                    if (v7_3.size() >= 2) {
	                        int v3_28;
	                        int v3_27 = android.text.TextUtils.join("\n", v7_3);
	                        if (android.text.TextUtils.equals(v3_27, v6.g)) {
	                            v3_28 = v0_8;
	                        } else {
	                            v6.g = v3_27;
	                            v3_28 = 1;
	                        }
	                        if (!v5.a.isEmpty()) {
	                            String v0_15;
	                            String v0_14 = ((com.google.android.gms.common.images.WebImage) v5.a.get(0)).b;
	                            if (v0_14 != null) {
	                                v0_15 = v0_14.toString();
	                            } else {
	                                v0_15 = "";
	                            }
	                            if (!android.text.TextUtils.equals(v0_15, v6.h)) {
	                                v6.h = v0_15;
	                                v3_28 = 1;
	                            }
	                        } else {
	                            if (v6.h != null) {
	                                v3_28 = 1;
	                            }
	                            v6.h = 0;
	                        }
	                        if ((v6.b != null) || ((v6.c != null) || ((v6.e == null) || (v6.i != null)))) {
	                            v3_28 = 1;
	                        }
	                        v6.b = 0;
	                        v6.c = 0;
	                        v6.e = 0;
	                        v6.i = 0;
	                        if (v3_28 != 0) {
	                            v4.p();
	                        }
	                    } else {
	                        if ((v6.a == null) || (android.text.TextUtils.isEmpty(v6.f))) {
	                        } else {
	                            v7_3.add(v6.a);
	                        }
	                    }
	            }
	            if ((v7_3.size() < 2) && ((v6.a != null) && (!android.text.TextUtils.isEmpty(v6.f)))) {
	            }
	        }
	        return;
	    }
	
