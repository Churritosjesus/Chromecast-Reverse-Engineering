.class public final Lbwr;
.super Ljava/lang/Object;

# interfaces
.implements Lbxj;


# instance fields
.field private final a:Lbwz;


# direct methods
.method public constructor <init>(Lbwz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbwr;->a:Lbwz;

    return-void
.end method

.method private a(Lbxi;)V
    .locals 3

    iget-object v0, p0, Lbwr;->a:Lbwz;

    invoke-virtual {v0, p1}, Lbwz;->a(Lbxi;)V

    iget-object v0, p0, Lbwr;->a:Lbwz;

    invoke-interface {p1}, Lbxi;->e()Lbwe;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbwz;->a(Lbwe;)Lbwc;

    move-result-object v0

    invoke-interface {v0}, Lbwc;->k()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lbwr;->a:Lbwz;

    iget-object v1, v1, Lbwz;->k:Ljava/util/Map;

    invoke-interface {p1}, Lbxi;->e()Lbwe;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {p1, v0}, Lbxi;->d(Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    return-void

    :cond_0
    invoke-interface {p1, v0}, Lbxi;->b(Lbwc;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Lbwp;)Lbwp;
    .locals 1

    invoke-virtual {p0, p1}, Lbwr;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 3

    :goto_0
    iget-object v0, p0, Lbwr;->a:Lbwz;

    iget-object v0, v0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lbwr;->a:Lbwz;

    iget-object v0, v0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbxi;

    invoke-direct {p0, v0}, Lbwr;->a(Lbxi;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "GoogleApiClientConnected"

    const-string v2, "Service died while flushing queue"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 6

    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    if-eqz v1, :cond_3

    iget-object v0, p0, Lbwr;->a:Lbwz;

    invoke-virtual {v0}, Lbwz;->f()V

    iget-object v0, p0, Lbwr;->a:Lbwz;

    iget-object v0, v0, Lbwz;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_0
    iget-object v0, p0, Lbwr;->a:Lbwz;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lbwz;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    if-nez v1, :cond_1

    iget-object v0, p0, Lbwr;->a:Lbwz;

    iget-object v0, v0, Lbwz;->c:Lbyx;

    invoke-virtual {v0, p1}, Lbyx;->a(I)V

    :cond_1
    iget-object v0, p0, Lbwr;->a:Lbwz;

    iget-object v0, v0, Lbwz;->c:Lbyx;

    invoke-virtual {v0}, Lbyx;->a()V

    return-void

    :cond_2
    const/4 v0, 0x0

    move v1, v0

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lbwr;->a:Lbwz;

    iget-object v0, v0, Lbwz;->q:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbxi;

    new-instance v3, Lcom/google/android/gms/common/api/Status;

    const/16 v4, 0x8

    const-string v5, "The connection to Google Play services was lost"

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v3}, Lbxi;->c(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_1
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/common/ConnectionResult;Lbvz;I)V
    .locals 0

    return-void
.end method

.method public final b(Lbwp;)Lbwp;
    .locals 1

    :try_start_0
    invoke-direct {p0, p1}, Lbwr;->a(Lbxi;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    :catch_0
    move-exception v0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lbwr;->a(I)V

    goto :goto_0
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "CONNECTED"

    return-object v0
.end method
