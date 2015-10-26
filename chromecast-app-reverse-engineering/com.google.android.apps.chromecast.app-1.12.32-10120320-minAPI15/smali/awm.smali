.class public final Lawm;
.super Latt;
.source "PG"


# instance fields
.field private n:Laea;

.field private final o:Lblp;


# direct methods
.method public constructor <init>(Ldas;Laea;Ladz;)V
    .locals 4

    .prologue
    .line 30
    const-string v0, "BrowseContent"

    const-string v1, "/browse/whatson"

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-static {p1}, Ldas;->a(Ldew;)[B

    move-result-object v2

    .line 30
    invoke-direct {p0, v0, v1, v2, p3}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 25
    new-instance v0, Lblp;

    const-string v1, "BrowseContentRequest"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lawm;->o:Lblp;

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
    iput-object p2, p0, Lawm;->n:Laea;

    .line 37
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 19
    check-cast p1, [B

    .line 2052
    :try_start_0
    iget-object v0, p0, Lawm;->n:Laea;

    invoke-static {p1}, Ldat;->a([B)Ldat;

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
    iget-object v1, p0, Lawm;->o:Lblp;

    const-string v2, "Couldn\'t parse BrowseContentResponse: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

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
