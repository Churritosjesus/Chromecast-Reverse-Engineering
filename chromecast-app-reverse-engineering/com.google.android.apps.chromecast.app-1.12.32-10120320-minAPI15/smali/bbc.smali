.class public final Lbbc;
.super Latt;
.source "PG"


# instance fields
.field private n:Laea;


# direct methods
.method public constructor <init>(Ldas;Laea;Ladz;)V
    .locals 4

    .prologue
    .line 29
    const-string v0, "BrowseContent"

    const-string v1, "/browse/apps"

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-static {p1}, Ldas;->a(Ldew;)[B

    move-result-object v2

    .line 29
    invoke-direct {p0, v0, v1, v2, p3}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 31
    new-instance v0, Laec;

    .line 33
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 32
    invoke-static {v1}, Lblf;->x(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3}, Laec;-><init>(IIF)V

    .line 1202
    iput-object v0, p0, Lads;->i:Laec;

    .line 35
    iput-object p2, p0, Lbbc;->n:Laea;

    .line 36
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 20
    check-cast p1, [B

    .line 2051
    :try_start_0
    iget-object v0, p0, Lbbc;->n:Laea;

    invoke-static {p1}, Ldat;->a([B)Ldat;

    move-result-object v1

    invoke-interface {v0, v1}, Laea;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 2054
    :goto_0
    return-void

    .line 2052
    :catch_0
    move-exception v0

    .line 2053
    const-string v1, "GetAppsRequest"

    const-string v2, "Couldn\'t parse GetAppsResponse: "

    invoke-virtual {v0}, Ldev;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    return-object v0
.end method
