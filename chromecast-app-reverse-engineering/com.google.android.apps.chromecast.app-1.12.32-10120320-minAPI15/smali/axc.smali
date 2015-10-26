.class public final Laxc;
.super Latt;
.source "PG"


# static fields
.field private static final n:Ljava/lang/String; = "/details"

.field private static final o:Ljava/lang/String; = "/search/details"


# instance fields
.field private p:Laea;


# direct methods
.method public constructor <init>(Ldbh;ZLaea;)V
    .locals 4

    .prologue
    .line 33
    const-string v1, "ContentDetails"

    if-eqz p2, :cond_0

    sget-object v0, Laxc;->o:Ljava/lang/String;

    :goto_0
    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 34
    invoke-static {p1}, Ldbh;->a(Ldew;)[B

    move-result-object v2

    const/4 v3, 0x0

    .line 33
    invoke-direct {p0, v1, v0, v2, v3}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 35
    iput-object p3, p0, Laxc;->p:Laea;

    .line 36
    return-void

    .line 33
    :cond_0
    sget-object v0, Laxc;->n:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 17
    check-cast p1, [B

    .line 1051
    :try_start_0
    iget-object v1, p0, Laxc;->p:Laea;

    .line 1078
    new-instance v0, Ldbi;

    invoke-direct {v0}, Ldbi;-><init>()V

    invoke-static {v0, p1}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldbi;

    .line 1051
    invoke-interface {v1, v0}, Laea;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 1054
    :goto_0
    return-void

    .line 1052
    :catch_0
    move-exception v0

    .line 1053
    const-string v1, "ContentDetailsRequest"

    const-string v2, "Could not read server response"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
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
