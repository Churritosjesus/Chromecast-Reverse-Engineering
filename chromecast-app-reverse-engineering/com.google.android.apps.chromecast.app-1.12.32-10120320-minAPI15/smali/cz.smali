.class final Lcz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lcy;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldm;)V
    .locals 2

    .prologue
    .line 1126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1718
    iget-object v0, p2, Ldm;->a:Ljava/lang/Object;

    .line 2038
    new-instance v1, Landroid/media/session/MediaController;

    check-cast v0, Landroid/media/session/MediaSession$Token;

    invoke-direct {v1, p1, v0}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V

    .line 1127
    iput-object v1, p0, Lcz;->a:Ljava/lang/Object;

    .line 1129
    iget-object v0, p0, Lcz;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    .line 1130
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Ldc;
    .locals 2

    .prologue
    .line 1149
    iget-object v0, p0, Lcz;->a:Ljava/lang/Object;

    .line 2056
    check-cast v0, Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getTransportControls()Landroid/media/session/MediaController$TransportControls;

    move-result-object v1

    .line 1150
    if-eqz v1, :cond_0

    new-instance v0, Ldd;

    invoke-direct {v0, v1}, Ldd;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Lcu;)V
    .locals 2

    .prologue
    .line 1139
    iget-object v0, p0, Lcz;->a:Ljava/lang/Object;

    invoke-static {p1}, Lcu;->c(Lcu;)Ljava/lang/Object;

    move-result-object v1

    .line 2051
    check-cast v0, Landroid/media/session/MediaController;

    check-cast v1, Landroid/media/session/MediaController$Callback;

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->unregisterCallback(Landroid/media/session/MediaController$Callback;)V

    .line 1140
    return-void
.end method

.method public final a(Lcu;Landroid/os/Handler;)V
    .locals 2

    .prologue
    .line 1134
    iget-object v0, p0, Lcz;->a:Ljava/lang/Object;

    invoke-static {p1}, Lcu;->c(Lcu;)Ljava/lang/Object;

    move-result-object v1

    .line 2046
    check-cast v0, Landroid/media/session/MediaController;

    check-cast v1, Landroid/media/session/MediaController$Callback;

    invoke-virtual {v0, v1, p2}, Landroid/media/session/MediaController;->registerCallback(Landroid/media/session/MediaController$Callback;Landroid/os/Handler;)V

    .line 1135
    return-void
.end method

.method public final b()Ldq;
    .locals 1

    .prologue
    .line 1155
    iget-object v0, p0, Lcz;->a:Ljava/lang/Object;

    .line 2060
    check-cast v0, Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v0

    .line 1156
    if-eqz v0, :cond_0

    invoke-static {v0}, Ldq;->a(Ljava/lang/Object;)Ldq;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Lci;
    .locals 1

    .prologue
    .line 1161
    iget-object v0, p0, Lcz;->a:Ljava/lang/Object;

    .line 2064
    check-cast v0, Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v0

    .line 1162
    if-eqz v0, :cond_0

    invoke-static {v0}, Lci;->a(Ljava/lang/Object;)Lci;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
