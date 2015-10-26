.class public final Lauh;
.super Latt;
.source "PG"


# instance fields
.field private final n:Laea;

.field private final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;IILaea;Ladz;)V
    .locals 7

    .prologue
    .line 41
    const-string v2, "LoadAlbums"

    .line 1069
    if-nez p6, :cond_0

    .line 1070
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "[,\"%d\",\"%d\",\"%d\",,,%b,,\"%d\",\"%s\",\"%d\"]"

    const/4 v4, 0x7

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 1071
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x3

    const/4 v6, 0x1

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x4

    invoke-static {p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x5

    aput-object p7, v4, v5

    const/4 v5, 0x6

    invoke-static/range {p9 .. p9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    .line 1070
    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1076
    :goto_0
    const-string v3, "/photo-album-metadata?f.req=%s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "utf-8"

    invoke-static {v1, v6}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 41
    invoke-static {p1, v1}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p11

    invoke-direct {p0, v2, v1, v0}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;Ladz;)V

    .line 45
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-static {v1}, Lasr;->a(Landroid/content/Context;)Laec;

    move-result-object v1

    .line 1202
    iput-object v1, p0, Lads;->i:Laec;

    .line 46
    move-object/from16 v0, p10

    iput-object v0, p0, Lauh;->n:Laea;

    .line 47
    iput-object p2, p0, Lauh;->o:Ljava/lang/String;

    .line 48
    return-void

    .line 1073
    :cond_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "[,\"%d\",\"%d\",\"%d\",,\"%s\",%b,,\"%d\",\"%s\",\"%d\"]"

    const/16 v4, 0x8

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 1074
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x3

    aput-object p6, v4, v5

    const/4 v5, 0x4

    const/4 v6, 0x1

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x5

    invoke-static {p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x6

    aput-object p7, v4, v5

    const/4 v5, 0x7

    invoke-static/range {p9 .. p9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    .line 1073
    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 22
    check-cast p1, [B

    .line 2053
    iget-object v0, p0, Lauh;->n:Laea;

    if-eqz v0, :cond_0

    .line 2054
    const/4 v1, 0x0

    .line 2055
    if-eqz p1, :cond_1

    .line 2166
    :try_start_0
    new-instance v0, Ldbz;

    invoke-direct {v0}, Ldbz;-><init>()V

    invoke-static {v0, p1}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldbz;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 2062
    :goto_0
    iget-object v1, p0, Lauh;->n:Laea;

    invoke-interface {v1, v0}, Laea;->a(Ljava/lang/Object;)V

    .line 22
    :cond_0
    return-void

    .line 2058
    :catch_0
    move-exception v0

    .line 2059
    const-string v2, "LoadAlbums"

    const-string v3, "Could not load albums: "

    invoke-virtual {v0}, Ldev;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    const-string v0, "oauth2:https://www.google.com/accounts/OAuthLogin"

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lauh;->o:Ljava/lang/String;

    return-object v0
.end method
