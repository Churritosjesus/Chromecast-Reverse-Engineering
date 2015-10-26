.class public final Lbcc;
.super Latt;
.source "PG"


# instance fields
.field private n:Laea;

.field private final o:Lblp;


# direct methods
.method public constructor <init>(Ldbl;Laea;Ladz;)V
    .locals 3

    .prologue
    .line 27
    const-string v0, "LoadOffersRequest"

    const-string v1, "/browse/offers"

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-static {p1}, Ldbl;->a(Ldew;)[B

    move-result-object v2

    .line 27
    invoke-direct {p0, v0, v1, v2, p3}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 23
    new-instance v0, Lblp;

    const-string v1, "LoadOffersRequest"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbcc;->o:Lblp;

    .line 29
    iput-object p2, p0, Lbcc;->n:Laea;

    .line 30
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 17
    check-cast p1, [B

    .line 1045
    :try_start_0
    iget-object v1, p0, Lbcc;->n:Laea;

    .line 1101
    new-instance v0, Ldbm;

    invoke-direct {v0}, Ldbm;-><init>()V

    invoke-static {v0, p1}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldbm;

    .line 1045
    invoke-interface {v1, v0}, Laea;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 1048
    :goto_0
    return-void

    .line 1046
    :catch_0
    move-exception v0

    .line 1047
    iget-object v1, p0, Lbcc;->o:Lblp;

    const-string v2, "Couldn\'t parse OffersResponse: %s"

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
    .line 34
    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    return-object v0
.end method
