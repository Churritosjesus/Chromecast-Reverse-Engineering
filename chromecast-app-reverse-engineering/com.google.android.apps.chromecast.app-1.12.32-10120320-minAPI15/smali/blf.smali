.class public final Lblf;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:Lblg;

.field private static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 85
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    .line 86
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 87
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x14

    .line 88
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 125
    sget-object v0, Lblg;->a:Lblg;

    sput-object v0, Lblf;->a:Lblg;

    .line 137
    sget v0, Lblh;->a:I

    sput v0, Lblf;->b:I

    return-void
.end method

.method public static A(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 382
    invoke-static {p0}, Lblf;->y(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "/cast/discover"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static B(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 386
    const-string v0, "PREF_COUNTRY_OVERRIDE"

    .line 2392
    const/4 v0, 0x0

    .line 386
    return-object v0
.end method

.method public static C(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 399
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:ble_enabled"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static D(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 440
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "gms:cast:mirroring_enabled"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static E(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 448
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:cast_screen_tips"

    const-string v2, "https://support.google.com/chromecast/answer/6050397"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static F(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 457
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:cast_screen_no_devices"

    const-string v2, "https://support.google.com/chromecast/answer/6053262"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static G(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 466
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "gms:cast:mirroring_app_id"

    const-string v2, "674A0243"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static H(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 474
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "gms:cast:audio_mirroring_app_id"

    const-string v2, "8E6C866D"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static I(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 479
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "gms:cast:cast_nearby_device_scanner:device_id"

    const-string v2, "__cast_nearby__"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static J(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 484
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:crash_search_url"

    const-string v2, "http://go/crash/browse?stbtiq=%s"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static K(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 490
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "gms:cast:cast_nearby_device_scanner:is_enabled"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static L(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 498
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:analytics"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static M(Landroid/content/Context;)Lblg;
    .locals 3

    .prologue
    .line 503
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:opencast_set_during_setup"

    sget-object v2, Lblf;->a:Lblg;

    .line 505
    invoke-virtual {v2}, Lblg;->ordinal()I

    move-result v2

    .line 503
    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    .line 506
    invoke-static {}, Lblg;->values()[Lblg;

    move-result-object v1

    aget-object v0, v1, v0

    return-object v0
.end method

.method public static N(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 510
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:stats_opt_in_override"

    sget v2, Lblf;->b:I

    .line 512
    add-int/lit8 v2, v2, -0x1

    .line 510
    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    .line 513
    invoke-static {}, Lblh;->a()[I

    move-result-object v1

    aget v0, v1, v0

    return v0
.end method

.method public static O(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 529
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "cast_screen_help_url"

    const-string v2, "https://support.google.com/chromecast/answer/6059461"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static P(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 534
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:backdrop_help_url"

    const-string v2, "https://support.google.com/chromecast/answer/6080931"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static Q(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 546
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:empty_device_list_url"

    const-string v2, "https://support.google.com/chromecast/answer/2998456"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static R(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 552
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:hdr_learn_more_url"

    const-string v2, "https://support.google.com/chromecast/answer/6290498"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static S(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 561
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:min_update_version"

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static T(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 571
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:no_update_help_url"

    const-string v2, "https://support.google.com/chromecast/?p=honeycomb"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static U(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 595
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:network_scan_time_ms"

    const-wide/16 v2, 0xfa0

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static V(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 603
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:country_switch_delay_ms"

    const-wide/16 v2, 0x3e8

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static W(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 611
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:google_play_apps_link"

    const-string v2, "https://play.google.com/store/apps/collection/promotion_collections_google_cast"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static X(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 622
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:backdrop_timeout_ms"

    const/16 v2, 0x2710

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static Y(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 631
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:network_switch_settle_time_ms"

    const/16 v2, 0x2710

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 147
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:developer_mode"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 221
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:learn_video_url"

    const-string v2, "https://www.google.%s/intl/%s/cast/about/audio/update-tutorial/learn.mp4"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 223
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/os/Bundle;Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 640
    const-string v0, "gservices-imax-url"

    invoke-static {p1}, Lblf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 641
    const-string v0, "gservices-is-cast-screen-enabled"

    .line 642
    invoke-static {}, Lblf;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    .line 641
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 643
    const-string v0, "gservices-is-cast-screen-approved"

    .line 644
    invoke-static {p1}, Lblf;->D(Landroid/content/Context;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    .line 643
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 645
    const-string v0, "gservices-is-open-cast-enabled"

    .line 646
    invoke-static {p1}, Lblf;->K(Landroid/content/Context;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    .line 645
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 647
    const-string v0, "gservices-is-open-cast-enabled-in-setup"

    .line 648
    invoke-static {p1}, Lblf;->M(Landroid/content/Context;)Lblg;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 647
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    const-string v0, "gservices-is-offers-enabled"

    invoke-static {p1}, Lblf;->b(Landroid/content/Context;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 651
    const-string v0, "gservices-offers-app-id"

    invoke-static {p1}, Lblf;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 652
    return-void
.end method

.method public static a()Z
    .locals 4

    .prologue
    const/16 v3, 0x13

    const/4 v0, 0x0

    .line 407
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 2418
    if-ge v1, v3, :cond_1

    .line 2428
    :cond_0
    :goto_0
    return v0

    .line 2425
    :cond_1
    if-ne v1, v3, :cond_2

    .line 2426
    const-string v1, "4.4"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "4.4.1"

    .line 2427
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2432
    :cond_2
    const/4 v0, 0x1

    .line 407
    goto :goto_0
.end method

.method public static b()Z
    .locals 1

    .prologue
    .line 636
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 157
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:offers_enabled"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 167
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:previews_enabled"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 176
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:offers_app_id"

    const-string v2, "B03290DF"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 185
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:offers_url"

    const-string v2, "https://cast.google.com/chromecast/offers/#code/"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 194
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:offers_terms_url"

    const-string v2, "https://support.google.com/chromecast/answer/6008836"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 204
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:offer_batch_delay"

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static h(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 212
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:learn_url"

    const-string v2, "http://chromecast.com/learn"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static i(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 230
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:check_ota_status_delay_ms"

    const-wide/16 v2, 0x3e8

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static j(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 239
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:ota_percent_done_threshold"

    const/16 v2, 0x61

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static k(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 248
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:num_ota_errors_allowed"

    const/4 v2, 0x5

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static l(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 257
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:ww_auto_scroll_delay_ms"

    const-wide/16 v2, 0x2710

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static m(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 266
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:ota_device_scan_timeout_ms"

    const-wide/32 v2, 0x1d4c0

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static n(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 275
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:ota_download_slow_percent"

    const/4 v2, 0x7

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static o(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 283
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:ota_check_download_scan_time"

    const-wide/32 v2, 0x1d4c0

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static p(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 288
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:ota_troubleshoot_display_help_url"

    const-string v2, "https://support.google.com/chromecast/answer/6284322"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static q(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 294
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:ota_troubleshoot_audio_help_url"

    const-string v2, "https://support.google.com/chromecast/answer/6284174"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static r(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 304
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:backdrop_history_enabled"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static s(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 313
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:backdrop_history_timeout_ms"

    const-wide/16 v2, 0x4e20

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static t(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 321
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:backdrop_update_setting_delay_ms"

    const-wide/16 v2, 0x1f4

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static u(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 330
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:connection_teardown_delay_ms"

    const-wide/32 v2, 0x1d4c0

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static v(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 338
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:backdrop_refresh_ms"

    const-wide/16 v2, 0x7530

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static w(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 347
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:content_discovery_refresh_ms"

    const-wide/32 v2, 0x927c0

    invoke-static {v0, v1, v2, v3}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static x(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 356
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:content_discovery_timeout_ms"

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static y(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 368
    const-string v0, "PREF_SERVER_URL"

    .line 1392
    const/4 v0, 0x0

    .line 369
    if-eqz v0, :cond_0

    .line 372
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "chromecast:server_url"

    const-string v2, "https://clients3.google.com"

    invoke-static {v0, v1, v2}, Lczp;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static z(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 378
    invoke-static {p0}, Lblf;->y(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "/cast/chromecast/home"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method
