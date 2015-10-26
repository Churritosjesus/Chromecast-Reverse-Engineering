	 Ldan a
	
	    public blv()
	    {
	        return;
	    }
	
	
	    public final dan a(Integer p11, boolean p12, int p13)
	    {
	        int v0_2;
	        if (this.a != null) {
	            int v0_1 = 0;
	            while (v0_1 < this.a.length) {
	                dan[] v2_24;
	                int v5_0 = this.a[v0_1];
	                if ((p11 == null) || ((v5_0.b != null) && (v5_0.b.longValue() > ((long) p11.intValue())))) {
	                    if (v5_0.g != null) {
	                        dan[] v2_10;
	                        int[] v6_1 = v5_0.d;
	                        if ((v6_1 != null) && (v6_1.length != 0)) {
	                            dan[] v2_9 = 0;
	                            while (v2_9 < v6_1.length) {
	                                if (v6_1[v2_9] != 0) {
	                                    v2_9++;
	                                } else {
	                                    v2_10 = 1;
	                                }
	                            }
	                            v2_10 = 0;
	                        } else {
	                            v2_10 = 1;
	                        }
	                        if (v2_10 != null) {
	                            dan[] v2_15;
	                            int[] v6_2 = v5_0.e;
	                            if ((v6_2 != null) && (v6_2.length != 0)) {
	                                if (com.google.android.apps.chromecast.app.SetupApplication.g()) {
	                                    dan[] v2_14 = 0;
	                                    while (v2_14 < v6_2.length) {
	                                        if (!com.google.android.apps.chromecast.app.SetupApplication.a().c.equals(v6_2[v2_14])) {
	                                            v2_14++;
	                                        } else {
	                                            v2_15 = 1;
	                                        }
	                                        if (v2_15 != null) {
	                                            dan[] v2_17;
	                                            if (v5_0.c != 0) {
	                                                v2_17 = 0;
	                                            } else {
	                                                v2_17 = 1;
	                                            }
	                                            if (v2_17 == p12) {
	                                                if ((v5_0.f != null) && (v5_0.f.length > 0)) {
	                                                    if (p13 != 0) {
	                                                        dan[] v2_23;
	                                                        switch (blw.a[(p13 - 1)]) {
	                                                            case 1:
	                                                                v2_23 = 0;
	                                                                break;
	                                                            case 2:
	                                                                v2_23 = 1;
	                                                                break;
	                                                            case 3:
	                                                                v2_23 = 2;
	                                                                break;
	                                                            case 4:
	                                                                v2_23 = 3;
	                                                                break;
	                                                            case 5:
	                                                                v2_23 = 4;
	                                                                break;
	                                                            default:
	                                                                v2_23 = 5;
	                                                        }
	                                                        int[] v6_4 = v5_0.f;
	                                                        int v5_1 = 0;
	                                                        while (v5_1 < v6_4.length) {
	                                                            if (v6_4[v5_1] != v2_23) {
	                                                                v5_1++;
	                                                            }
	                                                        }
	                                                        v2_24 = 0;
	                                                        if (v2_24 == null) {
	                                                            v0_1++;
	                                                        } else {
	                                                            v0_2 = this.a[v0_1];
	                                                        }
	                                                        return v0_2;
	                                                    } else {
	                                                        v2_24 = 0;
	                                                    }
	                                                }
	                                                v2_24 = 1;
	                                            } else {
	                                                v2_24 = 0;
	                                            }
	                                        } else {
	                                            v2_24 = 0;
	                                        }
	                                    }
	                                }
	                                v2_15 = 0;
	                            } else {
	                                v2_15 = 1;
	                            }
	                        } else {
	                            v2_24 = 0;
	                        }
	                    } else {
	                        v2_24 = 0;
	                    }
	                } else {
	                    v2_24 = 0;
	                }
	            }
	            v0_2 = 0;
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
