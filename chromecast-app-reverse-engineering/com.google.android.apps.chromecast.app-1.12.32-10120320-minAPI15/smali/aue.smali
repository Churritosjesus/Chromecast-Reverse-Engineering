.class public final Laue;
.super Latt;
.source "PG"


# instance fields
.field private final n:Lblp;

.field private final o:Laea;

.field private final p:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Laea;Ladz;)V
    .locals 11

    .prologue
    .line 43
    const-string v3, "DeviceBackdropSettings"

    .line 1073
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "[%s,,,%s,%s,%s,,1]"

    const/4 v2, 0x4

    new-array v6, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 1075
    invoke-static {p2}, Laue;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    const/4 v7, 0x1

    .line 1088
    const-wide/16 v8, 0x0

    cmp-long v2, p3, v8

    if-nez v2, :cond_0

    const-string v2, ""

    .line 1076
    :goto_0
    aput-object v2, v6, v7

    const/4 v2, 0x2

    .line 1077
    invoke-static/range {p5 .. p5}, Laue;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    const/4 v2, 0x3

    .line 1078
    invoke-static/range {p6 .. p6}, Laue;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    .line 1073
    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1079
    const-string v4, "utf-8"

    invoke-static {v2, v4}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1080
    const-string v4, "/settings/device?hl=%s&f.req=%s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {}, Lblj;->c()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    aput-object v2, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 43
    invoke-static {p1, v2}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p8

    invoke-direct {p0, v3, v2, v0}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;Ladz;)V

    .line 31
    new-instance v2, Lblp;

    const-string v3, "DeviceBackdropSettings"

    invoke-direct {v2, v3}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Laue;->n:Lblp;

    .line 46
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v2

    invoke-static {v2}, Lasr;->a(Landroid/content/Context;)Laec;

    move-result-object v2

    .line 1202
    iput-object v2, p0, Lads;->i:Laec;

    .line 48
    move-object/from16 v0, p7

    iput-object v0, p0, Laue;->o:Laea;

    .line 49
    iput-object p2, p0, Laue;->p:Ljava/lang/String;

    .line 50
    return-void

    .line 1088
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v8, 0x16

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v8, "\'"

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v8, "\'"

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 84
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 8

    .prologue
    .line 21
    check-cast p1, [B

    .line 2056
    iget-object v0, p0, Laue;->o:Laea;

    if-eqz v0, :cond_0

    .line 2059
    const/4 v1, 0x0

    .line 2060
    if-eqz p1, :cond_1

    .line 2062
    :try_start_0
    invoke-static {p1}, Ldbv;->a([B)Ldbv;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 2067
    :goto_0
    iget-object v1, p0, Laue;->o:Laea;

    invoke-interface {v1, v0}, Laea;->a(Ljava/lang/Object;)V

    .line 21
    :cond_0
    return-void

    .line 2063
    :catch_0
    move-exception v0

    .line 2064
    iget-object v2, p0, Laue;->n:Lblp;

    const-string v3, "DeviceBackdropSettings"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "Could not load device backdrop settings: "

    invoke-virtual {v0}, Ldev;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    const-string v0, "oauth2:https://www.google.com/accounts/OAuthLogin"

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Laue;->p:Ljava/lang/String;

    return-object v0
.end method
