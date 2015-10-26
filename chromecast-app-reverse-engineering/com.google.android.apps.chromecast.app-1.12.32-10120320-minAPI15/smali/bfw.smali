.class public final Lbfw;
.super Latt;
.source "PG"


# instance fields
.field private n:Laea;


# direct methods
.method public constructor <init>(Ldbo;Laea;Ladz;)V
    .locals 4

    .prologue
    .line 30
    const-string v0, "ContentSearchRequest"

    const-string v1, "/search"

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-static {p1}, Ldas;->a(Ldew;)[B

    move-result-object v2

    .line 30
    invoke-direct {p0, v0, v1, v2, p3}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 32
    new-instance v0, Laec;

    .line 34
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 33
    invoke-static {v1}, Lblf;->x(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3}, Laec;-><init>(IIF)V

    .line 1202
    iput-object v0, p0, Lads;->i:Laec;

    .line 36
    iput-object p2, p0, Lbfw;->n:Laea;

    .line 37
    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 21
    check-cast p1, [B

    .line 2052
    :try_start_0
    iget-object v0, p0, Lbfw;->n:Laea;

    invoke-static {p1}, Ldbp;->a([B)Ldbp;

    move-result-object v1

    invoke-interface {v0, v1}, Laea;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 2055
    :goto_0
    return-void

    .line 2053
    :catch_0
    move-exception v0

    .line 2054
    const-string v1, "ContentSearchRequest"

    const-string v2, "Couldn\'t parse SearchResponse"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x0

    return-object v0
.end method
