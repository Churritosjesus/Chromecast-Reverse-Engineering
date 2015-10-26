.class final Lda;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lcy;


# instance fields
.field private a:Lcq;

.field private b:Ldc;


# direct methods
.method public constructor <init>(Ldm;)V
    .locals 1

    .prologue
    .line 792
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1718
    iget-object v0, p1, Ldm;->a:Ljava/lang/Object;

    .line 794
    check-cast v0, Landroid/os/IBinder;

    invoke-static {v0}, Lcr;->a(Landroid/os/IBinder;)Lcq;

    move-result-object v0

    iput-object v0, p0, Lda;->a:Lcq;

    .line 795
    return-void
.end method


# virtual methods
.method public final a()Ldc;
    .locals 2

    .prologue
    .line 843
    iget-object v0, p0, Lda;->b:Ldc;

    if-nez v0, :cond_0

    .line 844
    new-instance v0, Lde;

    iget-object v1, p0, Lda;->a:Lcq;

    invoke-direct {v0, v1}, Lde;-><init>(Lcq;)V

    iput-object v0, p0, Lda;->b:Ldc;

    .line 847
    :cond_0
    iget-object v0, p0, Lda;->b:Ldc;

    return-object v0
.end method

.method public final a(Lcu;)V
    .locals 4

    .prologue
    .line 815
    if-nez p1, :cond_0

    .line 816
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback may not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 819
    :cond_0
    :try_start_0
    iget-object v1, p0, Lda;->a:Lcq;

    invoke-static {p1}, Lcu;->c(Lcu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn;

    invoke-interface {v1, v0}, Lcq;->b(Lcn;)V

    .line 821
    iget-object v0, p0, Lda;->a:Lcq;

    invoke-interface {v0}, Lcq;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 822
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcu;->a(Lcu;Z)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 826
    :goto_0
    return-void

    .line 823
    :catch_0
    move-exception v0

    .line 824
    const-string v1, "MediaControllerCompat"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dead object in unregisterCallback. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public final a(Lcu;Landroid/os/Handler;)V
    .locals 4

    .prologue
    .line 799
    if-nez p1, :cond_0

    .line 800
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback may not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 803
    :cond_0
    :try_start_0
    iget-object v0, p0, Lda;->a:Lcq;

    invoke-interface {v0}, Lcq;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 804
    iget-object v1, p0, Lda;->a:Lcq;

    invoke-static {p1}, Lcu;->c(Lcu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn;

    invoke-interface {v1, v0}, Lcq;->a(Lcn;)V

    .line 805
    invoke-static {p1, p2}, Lcu;->a(Lcu;Landroid/os/Handler;)V

    .line 806
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcu;->a(Lcu;Z)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 811
    :goto_0
    return-void

    .line 807
    :catch_0
    move-exception v0

    .line 808
    const-string v1, "MediaControllerCompat"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dead object in registerCallback. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 809
    invoke-virtual {p1}, Lcu;->a()V

    goto :goto_0
.end method

.method public final b()Ldq;
    .locals 4

    .prologue
    .line 853
    :try_start_0
    iget-object v0, p0, Lda;->a:Lcq;

    invoke-interface {v0}, Lcq;->o()Ldq;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 857
    :goto_0
    return-object v0

    .line 854
    :catch_0
    move-exception v0

    .line 855
    const-string v1, "MediaControllerCompat"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dead object in getPlaybackState. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 857
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Lci;
    .locals 4

    .prologue
    .line 863
    :try_start_0
    iget-object v0, p0, Lda;->a:Lcq;

    invoke-interface {v0}, Lcq;->n()Lci;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 867
    :goto_0
    return-object v0

    .line 864
    :catch_0
    move-exception v0

    .line 865
    const-string v1, "MediaControllerCompat"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dead object in getMetadata. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 867
    const/4 v0, 0x0

    goto :goto_0
.end method
