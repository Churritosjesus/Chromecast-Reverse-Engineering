.class public final Ldg;
.super Landroid/media/session/MediaController$Callback;
.source "PG"


# instance fields
.field private a:Ldf;


# direct methods
.method public constructor <init>(Ldf;)V
    .locals 0

    .prologue
    .line 257
    invoke-direct {p0}, Landroid/media/session/MediaController$Callback;-><init>()V

    .line 258
    iput-object p1, p0, Ldg;->a:Ldf;

    .line 259
    return-void
.end method


# virtual methods
.method public final onMetadataChanged(Landroid/media/MediaMetadata;)V
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Ldg;->a:Ldf;

    invoke-interface {v0, p1}, Ldf;->b(Ljava/lang/Object;)V

    .line 279
    return-void
.end method

.method public final onPlaybackStateChanged(Landroid/media/session/PlaybackState;)V
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, Ldg;->a:Ldf;

    invoke-interface {v0, p1}, Ldf;->a(Ljava/lang/Object;)V

    .line 274
    return-void
.end method

.method public final onSessionDestroyed()V
    .locals 1

    .prologue
    .line 263
    iget-object v0, p0, Ldg;->a:Ldf;

    invoke-interface {v0}, Ldf;->a()V

    .line 264
    return-void
.end method

.method public final onSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 269
    return-void
.end method
